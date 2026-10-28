package steams.atividades.Q12;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static <Autonomo> void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Autonomo> autonomos = new ArrayList<>();

        int opcao;

        do {
            System.out.println("\n===== SISTEMA DE AUTONOMOS =====");
            System.out.println("1 - Cadastrar autonomo");
            System.out.println("2 - Cadastrar servico");
            System.out.println("3 - Consultar servicos por CPF");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            try {
                opcao = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Digite uma opcao numerica valida.");
                opcao = -1;
                continue;
            }

            switch (opcao) {

                case 1: {
                    System.out.print("Nome: ");
                    String nome = sc.nextLine().trim();

                    System.out.print("CPF: ");
                    String cpf = sc.nextLine().trim();

                    boolean cpfExiste = autonomos.stream()
                        .anyMatch(a -> a.getCpf().equals(cpf));

                    if (cpfExiste) {
                        System.out.println("Ja existe um autonomo com esse CPF.");
                    } else {
                        autonomos.add(new Autonomo(nome, cpf));
                        System.out.println("Autonomo cadastrado!");
                    }
                    break;
                }

                case 2: {
                    System.out.print("CPF do autonomo: ");
                    String cpfServico = sc.nextLine().trim();

                    Optional<Autonomo> encontrado = autonomos.stream()
                        .filter(a -> a.getCpf().equals(cpfServico))
                        .findFirst();

                    if (encontrado.isPresent()) {
                        System.out.println("Tipos de servico:");
                        for (TipoServico tipo : TipoServico.values()) {
                            System.out.println("- " + tipo);
                        }

                        try {
                            System.out.print("Digite o tipo: ");
                            TipoServico tipo = TipoServico.valueOf(
                                sc.nextLine().trim().toUpperCase()
                            );

                            System.out.print("Valor do servico: R$ ");
                            double valor = Double.parseDouble(
                                sc.nextLine().trim().replace(",", ".")
                            );

                            if (valor < 0) {
                                System.out.println("O valor nao pode ser negativo.");
                            } else {
                                encontrado.get().adicionarServico(
                                    new Servico(tipo, valor)
                                );
                                System.out.println("Servico cadastrado!");
                            }
                        } catch (IllegalArgumentException e) {
                            System.out.println("Tipo ou valor invalido.");
                        }
                    } else {
                        System.out.println("Autonomo nao encontrado.");
                    }
                    break;
                }

                case 3: {
                    System.out.print("Digite o CPF: ");
                    String cpfConsulta = sc.nextLine().trim();

                    Optional<Autonomo> consulta = autonomos.stream()
                        .filter(a -> a.getCpf().equals(cpfConsulta))
                        .findFirst();

                    if (consulta.isPresent()) {
                        Autonomo autonomo = consulta.get();

                        System.out.println("--------------------------");
                        System.out.println("Usuario: " + autonomo.getNome()
                            + " - CPF: " + autonomo.getCpf());

                        Map<TipoServico, List<Servico>> grupos =
                            autonomo.getServicos().stream()
                                .collect(Collectors.groupingBy(
                                    Servico::getTipoServico
                                ));

                        grupos.forEach((tipo, lista) -> {
                            double totalTipo = lista.stream()
                                .mapToDouble(Servico::getValor)
                                .sum();

                            System.out.printf(
                                "Servico: %s | Valor R$: %.2f%n",
                                tipo, totalTipo
                            );
                        });

                        double totalGeral = autonomo.getServicos().stream()
                            .mapToDouble(Servico::getValor)
                            .sum();

                        System.out.printf("Total R$: %.2f%n", totalGeral);
                        System.out.println("--------------------------");
                    } else {
                        System.out.println("Autonomo nao encontrado.");
                    }
                    break;
                }

                case 0:
                    System.out.println("Encerrando o sistema...");
                    break;

                default:
                    System.out.println("Opcao invalida!");
            }

        } while (opcao != 0);

        sc.close();
    }
}

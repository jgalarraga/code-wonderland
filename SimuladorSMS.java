/**
 * @ProjetoIntegrador (P.I.): Simulador de SMS
 * @Versão 1.0
 * @Orientador: Alessandra
 * @Instituição: Centro Universitário Senac
 * @Curso: Tecnologia em Banco de Dados (1º Semestre)
 */
package simuladorsms;

import java.util.Scanner;

/**
 * @função solução para empresa que auxilia na contratação de serviços
 * domiciliares que possa exibir um relatório com a lista de ofertas diárias. A
 * diarista poderá escolher: ler detalhes da vaga, visualizar o endereço para o
 * serviço, selecionar a vaga ( apenas aquela vaga) e visualizar a remuneração.
 * A diarista só poderá selecionar uma vaga e, quando a vaga estiver
 * selecionada, não poderá ficar mais visível no relatório.
 * @data 15.04.2016
 * @autores João Lucas & Juliana Galarraga
 */

public class SimuladorSMS {

    public static void main(String[] args) {
        /* Declaração de Variáveis */
        Scanner teclado = new Scanner(System.in);
        int opcaoMenu, numOferta, opcaoMenuEmpregador, opcaoMenuServidor;
        String login, senha, tipoLogin;
        boolean opcaoValida, voltar;
        // objeto do tipo MenuEmpregador para poder acessar todos os métodos
        // da classe MenuEmpregador, ou seja, ter acesso aos menús de empregador
        MenuEmpregador menuEmpregador = new MenuEmpregador();
        // objeto do tipo MenuServidor para poder acessar todos os métodos
        // da classe MenuServidor, ou seja, ter acesso aos menús de servidor
        MenuServidor menuServidor = new MenuServidor();
        // objeto do tipo Vagas para poder acessar todos os métodos
        // da classe Vagas, ou seja, ter acesso à todas as vagas
        Vagas vagas = new Vagas();
        String[] primeiraVaga, segundaVaga, terceiraVaga;


        /* Inicialização de Variáveis */
        // variáveis para os menus
        numOferta = 0;
        opcaoMenuEmpregador = 0;
        opcaoMenuServidor = 0;
        opcaoMenu = 0;
        opcaoValida = false;
        voltar = false;
        login = "";
        senha = "";
        tipoLogin = "";
        // variáveis que recebem as vagas
        // esses três vetores recebem as variáveis primeiraVaga, segundaVaga e terceiraVaga da classe "Vagas" (também vetores de string)
        primeiraVaga = vagas.primeiraVaga;
        segundaVaga = vagas.segundaVaga;
        terceiraVaga = vagas.terceiraVaga;

        // Teste
        System.out.println(primeiraVaga[0]); // data
        System.out.println(primeiraVaga[1]); // nome da empresa contratante
        System.out.println(primeiraVaga[2]); // tipo de vaga

        /* Login */
        do {
            System.out.println("\033[35m" + "═══════════════════════════════"); // \033[35m - muda a cor do char para roxo
            System.out.println("*                   LOGIN                       *");
            System.out.println("\033[35m" + "═══════════════════════════════");
            System.out.println("* Opções:                                       *");
            System.out.println("*      (1) Servidor                             *");
            System.out.println("*      (2) Empregador                           *");
            System.out.println("\033[35m" + "═══════════════════════════════");

            System.out.println("");
            System.out.print("\033[30m" + "Selecione uma opção(1-2): ");
            opcaoMenu = teclado.nextInt();
            System.out.println("");

            if (opcaoMenu == 1 || opcaoMenu == 2) {
                opcaoValida = true;
            } else {
                System.out.println(">> Opção Inválida! :( <<");
                System.out.println("");
            }

        } while (!opcaoValida);

        opcaoValida = false; // reseto o valor de opcaoValida

        // se o código de login for igual a 1, quer dizer que a opção de login
        // selecionada foi "servidor" 
        if (opcaoMenu == 1) {
            tipoLogin = "servidor";
            do {
                System.out.println("\033[31m" + "-------------------------");
                System.out.println("Informe o login e senha: ");
                System.out.println("\033[31m" + "-------------------------");
                System.out.print("\033[30m" + "‣ login servidor: ");
                login = teclado.next();
                System.out.print("‣ senha: ");
                senha = teclado.next();
                System.out.println("");

                if (login.equals(tipoLogin) && senha.equals(tipoLogin)) {
                    opcaoValida = true;
                } else {
                    System.out.println("login/senha inválido(a)! :( ");
                    System.out.println("");
                }

            } while (!opcaoValida);
        } else {
            tipoLogin = "empregador";
            do {
                System.out.println("\033[34m" + "-------------------------");
                System.out.println("Informe o login e senha: ");
                System.out.println("\033[34m" + "-------------------------");
                System.out.print("\033[30m" + "‣ login empregador: ");
                login = teclado.next();
                System.out.print("‣ senha: ");
                senha = teclado.next();
                System.out.println("");

                if (login.equals(tipoLogin) && senha.equals(tipoLogin)) {
                    opcaoValida = true;
                } else {
                    System.out.println("login/senha inválido(a)! :( ");
                    System.out.println("");
                }

            } while (!opcaoValida);
        }

        opcaoValida = false; // reseto o valor de opcaoValida

        // Menu para Servidor
        if (tipoLogin.equals("servidor")) {
            voltar = false;
            do {
                // Relatório Ofertas Diárias (ler as ofertas pelo bloco de notas)
                menuServidor.menuPrincipalServidor();

                System.out.println("");
                System.out.print("Selecione uma opção(1-3): ");
                opcaoMenu = teclado.nextInt();
                System.out.println("");

                if (opcaoMenu == 1 || opcaoMenu == 2 || opcaoMenu == 3) {
                    opcaoValida = true;
                } else {
                    System.out.println(">> Opção Inválida! :( <<");
                    System.out.println("");
                }

                switch (opcaoMenu) {
                    case 1:
                        do {
                            // RELATÓRIO DE VAGAS 

                            // Menu para a oferta selecionada
                            menuServidor.exibirMenuVaga();

                            System.out.println("");
                            System.out.print("\033[30m" + "Selecione uma opção(1-3): ");
                            opcaoMenuServidor = teclado.nextInt();
                            System.out.println("");

                            if (opcaoMenuServidor > 3 || opcaoMenuServidor < 1) {
                                System.out.println(">> Opção Inválida! :( <<");
                                System.out.println("");
                            } else {
                                opcaoValida = true;
                                voltar = false;
                            }
                            // Caso usuário solicite ver detalhes da vaga
                            if (opcaoMenuServidor == 2) {
                                menuServidor.exibirDetalhesVaga();

                                System.out.println("");
                                System.out.print("\033[30m" + "Selecione uma opção(1-2): ");
                                opcaoMenuServidor = teclado.nextInt();
                                System.out.println("");

                                if (opcaoMenuServidor > 2 || opcaoMenuServidor < 1) {
                                    System.out.println(">> Opção Inválida! :( <<");
                                    System.out.println("");
                                } else {
                                    opcaoValida = true;
                                    voltar = false;
                                }

                            }

                        } while (!opcaoValida);
                        break;
                    // FIM DA OPÇÃO 1 - OFERTA DE VAGAS
                    // INÍCIO DA OPÇÃO 2 - MEUS SERVIÇOS
                    case 2:
                        do {
                            // Menu Meu Serviço
                            menuServidor.exibirMeuServico();

                            System.out.println("");
                            System.out.print("\033[30m" + "Selecione uma opção(1-3): ");
                            opcaoMenuEmpregador = teclado.nextInt();
                            System.out.println("");

                            if (opcaoMenuEmpregador > 3 || opcaoMenuEmpregador < 1) {
                                System.out.println(">> Opção Inválida! :( <<");
                                System.out.println("");
                            } else {
                                opcaoValida = true;
                            }
                            // caso usuário queira ver detalhes da sua vaga
                            if (opcaoMenuEmpregador == 1) {
                                menuServidor.exibirDetalhesMinhaVaga();

                                System.out.println("");
                                System.out.print("\033[30m" + "Selecione uma opção(1-2): ");
                                opcaoMenuServidor = teclado.nextInt();
                                System.out.println("");

                                if (opcaoMenuServidor > 2 || opcaoMenuServidor < 1) {
                                    System.out.println(">> Opção Inválida! :( <<");
                                    System.out.println("");
                                } else {
                                    opcaoValida = true;
                                    voltar = false;
                                }

                            }

                        } while (!opcaoValida);
                        break;
                    // FIM DO CASO 2 - MEUS SERVIÇOS
                    case 3:
                        voltar = true;
                        break;
                }
            } while (!voltar);

        } else {
            opcaoValida = false;
            voltar = false;
            do {
                do {
                    // Menu - Opções Empregador
                    menuEmpregador.exibirMenuPrincipalEmpregador();

                    System.out.println("");
                    System.out.print("\033[30m" + "Selecione uma opção(1-3): ");
                    opcaoMenuEmpregador = teclado.nextInt();
                    System.out.println("");

                    if (opcaoMenuEmpregador == 1 || opcaoMenuEmpregador == 2 || opcaoMenuEmpregador == 3) {
                        opcaoValida = true;
                    } else {
                        System.out.println(">> Opção Inválida! :( <<");
                    }

                } while (!opcaoValida);

                opcaoValida = false;

                switch (opcaoMenuEmpregador) {
                    case 1:
                        do {
                            // Menu - Adicionar uma Vaga
                            menuEmpregador.adicionarVaga();

                            System.out.println("");
                            System.out.print("\033[30m" + "Selecione uma opção(1-2): ");
                            opcaoMenuEmpregador = teclado.nextInt();
                            System.out.println("");

                            if (opcaoMenu == 1 || opcaoMenu == 2) {
                                opcaoValida = true;
                            } else {
                                System.out.println(">> Opção Inválida! :( <<");
                                System.out.println("");
                            }
                        } while (!opcaoValida);
                        // FIM DA OPÇÃO DE ADICIONAR UMA VAGA
                        break;
                    case 2:
                        // INÍCIO DA OPÇAO PARA ALTERAR UMA VAGA
                        do {
                            // Menu - Alterar Vaga
                            menuEmpregador.alterarVaga();

                            System.out.println("");
                            System.out.print("\033[30m" + "Selecione uma opção(1-2): ");
                            opcaoMenuEmpregador = teclado.nextInt();
                            System.out.println("");
                            if (opcaoMenuEmpregador == 1 || opcaoMenu == 2) {
                                opcaoValida = true;
                            } else {
                                System.out.println(">> Opção Inválida! :( <<");
                            }
                        } while (!opcaoValida);
                        // DEPOIS DE TER SELECIONADO A VAGA QUE QUEIRA ALTERAR
                        if (opcaoMenuEmpregador == 1) {
                            opcaoValida = false;
                            do {
                                // Menu - Editar Vaga
                                menuEmpregador.editarVaga();

                                System.out.println("");
                                System.out.print("\033[30m" + "Selecione uma opção(1-2): ");
                                opcaoMenuEmpregador = teclado.nextInt();
                                System.out.println("");
                                if (opcaoMenuEmpregador == 1 || opcaoMenu == 2) {
                                    opcaoValida = true;
                                } else {
                                    System.out.println(">> Opção Inválida! :( <<");
                                }
                            } while (!opcaoValida);
                        }
                        break;
                    case 3:
                        voltar = true;
                        break;
                }
            } while (!voltar);

        }

    }
}
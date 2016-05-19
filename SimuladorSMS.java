/**
 * @ProjetoIntegrador (P.I.): Simulador de SMS
 * @Versão 1.8
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
 * @autores João Lucas, Emerson & Juliana Galarraga
 */
public class SimuladorSMS {

    /* Declaração de Variáveis */
    // variáveis públicas para serem utilizadas nas demais classes ( MenuServidor, MenuEmpregador & MenuEmpregadorServidor)
    // Scanner
    public static Scanner teclado = new Scanner(System.in);
    // objeto do tipo MenuEmpregador para poder acessar todos os métodos
    // da classe MenuEmpregador, ou seja, ter acesso aos menús de empregador
    public static MenuEmpregador menuEmpregador = new MenuEmpregador();
    // objeto do tipo MenuServidor para poder acessar todos os métodos
    // da classe MenuServidor, ou seja, ter acesso aos menús de servidor
    public static MenuServidor menuServidor = new MenuServidor();
    // objeto do tipo MenuEmpregadorServidos para poder acessar todos os métodos
    // em comum para o servidor e o empregador
    public static MenuEmpregadorServidor menuGeral = new MenuEmpregadorServidor();

    // Vetor Vagas
    public static Vaga[] vaga = new Vaga[100];
    // String
    public static String local;
    public static String tipo;
    public static String data;
    public static String remuneracao;
    public static String detalhes;
    public static String login;
    public static String senha;
    public static String tipoLogin;
    // Inteiras
    public static int contVagas; // contador que irá imcrementando a posição do vetor para ser add a vaga
    public static int numAlteracao; // guarda o número da vaga a ser alterada
    public static int numOferta; // guarda o número da oferta selecionada
    public static int opcaoMenuServidor;
    public static int opcaoMenuEmpregador;
    public static int opcaoMenu;
    // Booleanas
    public static boolean opcaoValida;
    public static boolean voltar;

    public static void main(String[] args) {

        /* Inicialização de Variáveis */
        // Vagas
        local = "";
        tipo = "";
        data = "";
        remuneracao = "";
        detalhes = "";
        contVagas = 0;
        // variáveis para os menus
        numAlteracao = 0;
        numOferta = 0;
        opcaoMenuEmpregador = 0;
        opcaoMenuServidor = 0;
        opcaoMenu = 0;
        opcaoValida = false;
        login = "";
        senha = "";
        tipoLogin = "";
        voltar = false;

        /* Login */
        do {
            // Menu de login
            menuGeral.exibirMenuLogin();
            // Selecionar uma das opções do menu de login ( 1 ou 2 )
            menuGeral.selecionarOpcao(1, 2);
            // Verificar se a opção digitada é válida ou não
            menuGeral.validarOpcao(1, 2);

        } while (!opcaoValida);

        // se o código de login for igual a 1, quer dizer que a opção de login
        // selecionada foi "servidor", senão,  a opção selecionada foi "empregador"
        menuGeral.verificarTipoLogin();

        // Menu para Servidor
        if (tipoLogin.equals("servidor")) {
            voltar = false;
            do {
                // Relatório Ofertas Diárias (ler as ofertas pelo bloco de notas)
                menuServidor.menuPrincipalServidor();
                menuServidor.selecionarOpcaoServidor(1, 4);
                menuServidor.validarOpcaoServidor(1, 4);

                switch (opcaoMenuServidor) {
                    case 1:
                        do {
                            // Menu que exibe o relatório de vagas com as opções para as vagas: 
                            // 1. selecionar uma vaga | 2. Ver detalhes de uma vaga | 3. Sair
                            menuServidor.exibirMenuVagas();
                            menuServidor.selecionarOpcaoServidor(1, 3);
                            menuServidor.validarOpcaoServidor(1, 3);
                            // Caso o usuário deseje selecionar uma das vagas
                            if (opcaoMenuServidor == 1) {
                                menuServidor.selecionarOferta();
                                // Como a vaga foi selecionada, não estará mais disponível
                                vaga[numOferta].disponibilidade = false;
                            }
                            // Caso usuário solicite ver detalhes da vaga
                            if (opcaoMenuServidor == 2) {
                                // usuário escolhe uma vaga para visualizar seus detalhes
                                menuServidor.selecionarOferta();
                                menuServidor.exibirDetalhesVaga();
                                menuServidor.selecionarOpcaoServidor(1, 2);
                                menuServidor.validarOpcaoServidor(1, 2);
                            }
                        } while (!opcaoValida);
                        break;
                    // FIM DA OPÇÃO 1 - OFERTA DE VAGAS
                    // INÍCIO DA OPÇÃO 2 - MEU SERVIÇO
                    case 2:
                        do {
                            // Menu Meu Serviço
                            menuServidor.exibirMeuServico();
                            menuServidor.selecionarOpcaoServidor(1, 3);
                            menuServidor.validarOpcaoServidor(1, 3);

                            if (opcaoMenuServidor == 1) {
                                menuServidor.exibirDetalhesMinhaVaga();
                                menuServidor.selecionarOpcaoServidor(1, 2);
                                menuServidor.validarOpcaoServidor(1, 2);
                                if (opcaoMenuServidor == 1) {
                                    menuServidor.desistirVaga();
                                }
                            } else if (opcaoMenuServidor == 2) {
                                menuServidor.desistirVaga();
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
            // EMPREGADOR
            opcaoValida = false;
            voltar = false;
            do {
                do {
                    // Menu - Opções Empregador
                    menuEmpregador.exibirMenuPrincipalEmpregador();
                    menuEmpregador.selecionarOpcaoEmpregador(1, 5);
                    menuEmpregador.validarOpcaoEmpregador(1, 5);
                } while (!opcaoValida);

                opcaoValida = false;

                switch (opcaoMenuEmpregador) {
                    case 1:
                        do {
                            // Menu - Adicionar uma Vaga
                            menuEmpregador.adicionarVaga();
                            menuEmpregador.selecionarOpcaoEmpregador(1, 2);
                            menuEmpregador.validarOpcaoEmpregador(1, 2);

                            // se desejar adicionar a vaga, jogaremos as variáveis no vetor 'vaga'
                            if (opcaoMenuEmpregador == 1) {
                                menuEmpregador.criarVaga();
                            }

                        } while (!opcaoValida);
                        // FIM DA OPÇÃO DE ADICIONAR UMA VAGA
                        break;
                    case 2:
                        // INÍCIO DA OPÇAO PARA ALTERAR UMA VAGA
                        do {
                            // Menu - Alterar Vaga
                            menuEmpregador.alterarVaga();
                            menuEmpregador.selecionarOpcaoEmpregador(1, 2);
                            menuEmpregador.validarOpcaoEmpregador(1, 2);

                            if (opcaoMenuEmpregador == 1) {
                                menuEmpregador.selecionarVagaAlteracao();
                            }

                        } while (!opcaoValida);
                        // DEPOIS DE TER SELECIONADO A VAGA QUE QUEIRA ALTERAR
                        if (opcaoMenuEmpregador == 1) {
                            opcaoValida = false;
                            do {
                                // Menu - Editar Vaga
                                menuEmpregador.editarVaga();
                                menuEmpregador.selecionarOpcaoEmpregador(1, 2);
                                menuEmpregador.validarOpcaoEmpregador(1, 2);

                                if (opcaoMenuEmpregador == 1) {
                                    menuEmpregador.salvarEdicaoVaga();
                                }

                            } while (!opcaoValida);
                        }
                        break;
                    case 3:
                        System.out.println("excluir oferta!");
                        //menuEmpregador.excluirVagaMenu();
                        //menuEmpregador.selecionarOpcaoEmpregador(1, 2);
                        //menuEmpregador.validarOpcaoEmpregador(1, 2);
                        //menuEmpregador.excluirVaga();
                        break;
                    case 4:
                        System.out.println("logoff");
                        break;
                    case 5:
                        voltar = true;
                        break;
                }
            } while (!voltar);

        }

    }
}

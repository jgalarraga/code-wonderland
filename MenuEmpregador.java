/*
 * Esta classe contém todos os menus relacionados ao empregador ( quando é efetuado o login como empregador ) a
 */
package simuladorsms;

import java.util.Scanner;

/**
 * @função deixar o código principal mais limpo ao retirar todos os menus
 * relacionados ao servidor
 *
 * @data 19.04.2016
 * @autores João Lucas e Juliana Galarraga
 */
public class MenuEmpregador {

    public MenuEmpregador() {

        /* Declaração de Variáveis */
        Scanner teclado = new Scanner(System.in);
        int opcaoMenu, numOferta, opcaoMenuEmpregador, opcaoMenuServidor;
        String login, senha, tipoLogin;
        boolean opcaoValida, voltar;

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
    }

    /**
     *
     */
    public void exibirLoginEmpregador() {

    }

    public void exibirMenuPrincipalEmpregador() {
        System.out.println("\033[34m" + "══════════════════════════════");
        System.out.println("|               OPÇÕES EMPREGADOR              |");
        System.out.println("\033[34m" + "══════════════════════════════");
        System.out.println("| (1) Adicionar oferta                          ");
        System.out.println("| (2) Alterar oferta                            ");
        System.out.println("| (3) Sair                                      ");
        System.out.println("\033[34m" + "══════════════════════════════");

    }

    public void adicionarVaga() {
        System.out.println("\033[34m" + "══════════════════════════════");
        System.out.println("|              ADICIONAR UMA VAGA              |");
        System.out.println("\033[34m" + "══════════════════════════════");
        System.out.println("| Tipo de vaga:                                 ");
        System.out.println("| Local do serviço:                             ");
        System.out.println("| Data do serviço:                              ");
        System.out.println("| Remuneração diária:                           ");
        System.out.println("| (1) Adicionar vaga                            ");
        System.out.println("| (2) Voltar                                    ");
        System.out.println("\033[34m" + "══════════════════════════════");
    }

    public void alterarVaga() {
        System.out.println("\033[34m" + "══════════════════════════════");
        System.out.println("|               ALTERAR VAGA                  |");
        System.out.println("\033[34m" + "══════════════════════════════");
        System.out.println("|                                               ");
        System.out.println("|                                               ");
        System.out.println("|                                               ");
        System.out.println("|                                               ");
        System.out.println("| (1) Selecionar vaga para alteração            ");
        System.out.println("| (2) Voltar                                    ");
        System.out.println("\033[34m" + "══════════════════════════════");
    }

    public void editarVaga() {
        System.out.println("\033[34m" + "══════════════════════════════");
        System.out.println("|               EDITAR UMA VAGA                |");
        System.out.println("\033[34m" + "══════════════════════════════");
        System.out.println("| Tipo de vaga:                                  ");
        System.out.println("| Local do serviço:                              ");
        System.out.println("| Data do serviço:                               ");
        System.out.println("| Remuneração diária:                            ");
        System.out.println("| (1) Alterar vaga                               ");
        System.out.println("| (2) Voltar                                     ");
        System.out.println("\033[34m" + "══════════════════════════════");
    }
}

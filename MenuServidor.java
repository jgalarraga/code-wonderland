/*
 * Esta classe contém todos os menus relacionados ao servidor ( quando é efetuado o login como servidor )
 */
package simuladorsms;

/**
 * @função deixar o código principal mais limpo ao retirar todos os menus
 * relacionados ao servidor
 * @data 19.04.2016
 * @autores João Lucas e Juliana Galarraga
 */
public class MenuServidor {
    
    public void LoginServidor() {
        
    }

    public void menuPrincipalServidor() {
        System.out.println("\033[31m" + "══════════════════════════════");
        System.out.println("|               OPÇAO SERVIDOR                  ");
        System.out.println("\033[31m" + "══════════════════════════════");
        System.out.println("|(1) Oferta de vagas                            ");
        System.out.println("|(2) Meus Serviços                              ");
        System.out.println("|(3) Sair                                       ");
        System.out.println("\033[31m" + "══════════════════════════════");

    }

    public void exibirMenuVaga() {
        System.out.println("\033[31m" + "═══════════════════════════════"); // \033[35m - muda a cor do char para roxo
        System.out.println("|                   MENU VAGA                   |");
        System.out.println("\033[31m" + "═══════════════════════════════");
        System.out.println("|                                               |");
        System.out.println("|                                               |");
        System.out.println("|Opções:                                        |");
        System.out.println("|      (1) Selecionar esta vaga                 |");
        System.out.println("|      (2) Ver detalhes da vaga                 |");
        System.out.println("|      (3) Sair                                 |");
        System.out.println("\033[31m" + "═══════════════════════════════");

    }

    public void exibirMeuServico() {
        System.out.println("\033[31m" + "═══════════════════════════════"); // \033[35m - muda a cor do char para roxo
        System.out.println("|                   MEU SERVIÇO                |");
        System.out.println("\033[31m" + "═══════════════════════════════");
        System.out.println("|                                               |");
        System.out.println("|                                               |");
        System.out.println("|      (1) Ver detalhes da vaga                 |");
        System.out.println("|      (2) Desistir a vaga                      |");
        System.out.println("|      (3) Sair                                 |");
        System.out.println("\033[31m" + "═══════════════════════════════");
    }

    public void exibirDetalhesVaga() {
        System.out.println("\033[34m" + "══════════════════════════════");
        System.out.println("|                DETALHES DA VAGA            |");
        System.out.println("\033[34m" + "══════════════════════════════");
        System.out.println("| Data da vaga:                                 ");
        System.out.println("| Empresa:                                      ");
        System.out.println("| Tipo de vaga:                                 ");
        System.out.println("| Descrição:                                    ");
        System.out.println("| Local do serviço:                             ");
        System.out.println("| Data do serviço:                              ");
        System.out.println("| Remuneração:                                  ");
        System.out.println("| (1) Selecionar vaga                           ");
        System.out.println("| (2) Voltar                                    ");
        System.out.println("\033[34m" + "══════════════════════════════");
    }

    public void exibirDetalhesMinhaVaga() {
        System.out.println("\033[34m" + "══════════════════════════════");
        System.out.println("|                DETALHES DA MINHA VAGA            |");
        System.out.println("\033[34m" + "══════════════════════════════");
        System.out.println("| Tipo de vaga:                                 ");
        System.out.println("| Descrição:                                    ");
        System.out.println("| Local do serviço:                             ");
        System.out.println("| Data do serviço:                              ");
        System.out.println("| Remuneração diária:                           ");
        System.out.println("| (1) Desistir da vaga                          ");
        System.out.println("| (2) Voltar                                    ");
        System.out.println("\033[34m" + "══════════════════════════════");
    }

}

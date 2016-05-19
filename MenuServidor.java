/*
 * Esta classe contém todos os menus relacionados ao servidor ( quando é efetuado o login como servidor )
 */
package simuladorsms;

/**
 * @função deixar o código principal mais limpo ao retirar todos os menus
 * relacionados ao servidor
 * @data 19.04.2016
 * @autores João Lucas, Emerson e Juliana Galarraga
 */
import java.util.Scanner;
import static simuladorsms.SimuladorSMS.numAlteracao;
import static simuladorsms.SimuladorSMS.opcaoMenuServidor;
import static simuladorsms.SimuladorSMS.numOferta;
import static simuladorsms.SimuladorSMS.local;
import static simuladorsms.SimuladorSMS.vaga;
import static simuladorsms.SimuladorSMS.tipo;
import static simuladorsms.SimuladorSMS.data;
import static simuladorsms.SimuladorSMS.remuneracao;
import static simuladorsms.SimuladorSMS.detalhes;
import static simuladorsms.SimuladorSMS.login;
import static simuladorsms.SimuladorSMS.menuGeral;
import static simuladorsms.SimuladorSMS.numOferta;
import static simuladorsms.SimuladorSMS.opcaoMenu;
import static simuladorsms.SimuladorSMS.opcaoValida;
import static simuladorsms.SimuladorSMS.senha;
import static simuladorsms.SimuladorSMS.teclado;
import static simuladorsms.SimuladorSMS.tipoLogin;
import static simuladorsms.SimuladorSMS.vaga;

public class MenuServidor {

    /* Declaração de Variáveis */
    public void efetuarLoginServidor() {
        System.out.println("\033[31m" + "--------------------------------");
        System.out.println("    Informe o login e senha: ");
        System.out.println("\033[31m" + "--------------------------------");
        System.out.print("\033[30m" + "‣ login servidor: ");
        login = teclado.next();
        System.out.print("‣ senha: ");
        // Exibir asteriscos no lugar da senha?
        senha = teclado.next();
        System.out.println("");

        validarLoginServidor();
    }

    public void validarLoginServidor() {
        if (login.equals(tipoLogin) && senha.equals(tipoLogin)) {
            opcaoValida = true;
        } else {
            System.out.println("login/senha inválido(a)! :( ");
            System.out.println("");
        }
    }

    public void validarOpcaoServidor(int n1, int n2) {
        if (opcaoMenuServidor < n1 || opcaoMenuServidor > n2) {
            opcaoValida = false;
            System.out.println(">> Opção Inválida! :( <<");
            System.out.println("");

        } else {
            opcaoValida = true;
        }
    }

    public void selecionarOpcaoServidor(int n1, int n2) {
        System.out.println("");
        System.out.print("\033[30m" + "Selecione uma opção(" + n1 + "-" + n2 + "): ");
        opcaoMenuServidor = teclado.nextInt();
        System.out.println("");
    }

    /**
     * Exibe o menu principal do servidor
     */
    public void menuPrincipalServidor() {
        System.out.println("\033[31m" + "══════════════════════════════");
        System.out.println("|               OPÇAO SERVIDOR                  ");
        System.out.println("\033[31m" + "══════════════════════════════");
        System.out.println("|(1) Oferta de vagas                            ");
        System.out.println("|(2) Meus Serviço                               ");
        System.out.println("|(3) Logoff                                     ");
        System.out.println("|(4) Encerrar programa                          ");
        System.out.println("\033[31m" + "══════════════════════════════");

    }

    /**
     * Exibe a lista de vagas e opções para a lista
     */
    public void exibirMenuVagas() {
        System.out.println("\033[31m" + "═══════════════════════════════"); // \033[35m - muda a cor do char para roxo
        System.out.println("|                   MENU VAGA                   |");
        System.out.println("\033[31m" + "═══════════════════════════════");
        menuGeral.exibirRelatorioVagas();
        System.out.println("|Opções:                                        |");
        System.out.println("|      (1) Selecionar uma vaga                  |");
        System.out.println("|      (2) Ver detalhes de uma vaga             |");
        System.out.println("|      (3) Voltar                               |");
        System.out.println("\033[31m" + "═══════════════════════════════");

    }

    /**
     * Exibe o serviço selecionado pelo usuário
     */
    public void exibirMeuServico() {
        System.out.println("\033[31m" + "═══════════════════════════════"); // \033[35m - muda a cor do char para roxo
        System.out.println("|                   MEU SERVIÇO                |");
        System.out.println("\033[31m" + "═══════════════════════════════");
        System.out.println("| " + vaga[numOferta].tipoVaga + " |");
        System.out.println("> Local: " + vaga[numOferta].localVaga);
        System.out.println("> Remuneração: R$" + vaga[numOferta].remuneracao);
        System.out.println("> Detalhes: " + vaga[numOferta].descricaoVaga);;
        System.out.println("|      (1) Ver detalhes da minha vaga           |");
        System.out.println("|      (2) Desistir a vaga                      |");
        System.out.println("|      (3) Sair                                 |");
        System.out.println("\033[31m" + "═══════════════════════════════");
    }

    /**
     * Exibe os detalhes da vaga informada pelo usuário
     */
    public void exibirDetalhesVaga() {
        System.out.println("\033[34m" + "══════════════════════════════");
        System.out.println("|                DETALHES DA VAGA            |");
        System.out.println("\033[34m" + "══════════════════════════════");
        System.out.println("| Data da vaga: " + vaga[numOferta].dataCriacao);
        System.out.println("| Tipo de vaga: " + vaga[numOferta].tipoVaga);
        System.out.println("| Descrição: " + vaga[numOferta].descricaoVaga);
        System.out.println("| Local do serviço: " + vaga[numOferta].localVaga);
        System.out.println("| Data do serviço: " + vaga[numOferta].periodoVaga);
        System.out.println("| Remuneração: " + vaga[numOferta].remuneracao);
        System.out.println("| (1) Selecionar esta vaga                           ");
        System.out.println("| (2) Voltar                                    ");
        System.out.println("\033[34m" + "══════════════════════════════");
    }

    /**
     * Exibe os detalhes da vaga do usuário
     */
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

    /**
     * Menu para a desistência da vaga
     */
    public void desistirVaga() {
        do {
            System.out.println("\033[34m" + "══════════════════════════════");
            System.out.println("|                DESISTIR DA VAGA?          |");
            System.out.println("\033[34m" + "══════════════════════════════");
            System.out.println("> 1 - SIM! :( ");
            System.out.println("> 0 - NÃO! :) ");

            System.out.println("");
            System.out.print("\033[30m" + "Selecione uma opção(0 ou 1): ");
            opcaoMenuServidor = teclado.nextInt();

        } while (opcaoMenuServidor > 1);

        if (opcaoMenuServidor == 1) {
            System.out.println("\033[30m" + "Você desistiu desta vaga. :(");
            vaga[numOferta].disponibilidade = false;
        } else {
            System.out.println("\033[30m" + "Você não desistiu desta vaga. Boa escolha! :)");
            vaga[numOferta].disponibilidade = true;
        }
    }

    public void selecionarOferta() {
        System.out.print("> Qual vaga deseja selecionar? ");
        numOferta = teclado.nextInt();
        System.out.println("");
        System.out.println("\033[31m" + "Vaga " + numOferta + " selecionada! :)");
        System.out.println("");
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simuladorsms;

import static simuladorsms.SimuladorSMS.contVagas;
import static simuladorsms.SimuladorSMS.menuEmpregador;
import static simuladorsms.SimuladorSMS.menuServidor;
import static simuladorsms.SimuladorSMS.opcaoMenu;
import static simuladorsms.SimuladorSMS.opcaoMenuEmpregador;
import static simuladorsms.SimuladorSMS.opcaoMenuServidor;
import static simuladorsms.SimuladorSMS.opcaoValida;
import static simuladorsms.SimuladorSMS.teclado;
import static simuladorsms.SimuladorSMS.tipoLogin;
import static simuladorsms.SimuladorSMS.vaga;

/**
 *
 * @author User
 */
public class MenuEmpregadorServidor {
    
    public void exibirMenuLogin() {
        System.out.println("\033[35m" + "═══════════════════════════════"); // \033[35m - muda a cor do char para roxo
        System.out.println("*                   LOGIN                       *");
        System.out.println("\033[35m" + "═══════════════════════════════");
        System.out.println("* Opções:                                       *");
        System.out.println("*      (1) Servidor                             *");
        System.out.println("*      (2) Empregador                           *");
        System.out.println("\033[35m" + "═══════════════════════════════");
    }
    
    public void verificarTipoLogin(){
        opcaoValida = false;
        switch (opcaoMenu) {
            case 1:
                tipoLogin = "servidor";
                do {
                    // "tela" de login do servidor com validação
                    // se o usuário e senha forem diferentes de "servidor"
                    // o login é inválido
                    menuServidor.efetuarLoginServidor();
                    
                } while (!opcaoValida);
                break;
            case 2:
                tipoLogin = "empregador";
                do {
                    // "tela" de login do servidor com validação
                    // se o usuário e senha forem diferentes de "empregador"
                    // o login é inválido
                    menuEmpregador.efetuarLoginEmpregador();
                    
                } while (!opcaoValida);
                break;
            default:
                opcaoValida = false;
                break;
        }
    }

    public void selecionarOpcao(int n1, int n2) {
        System.out.println("");
        System.out.print("\033[30m" + "Selecione uma opção(" + n1 + "-" + n2 + "): ");
        opcaoMenu = teclado.nextInt();
        System.out.println("");
    }

    public void validarOpcao(int n1, int n2) {
        if (opcaoMenu < n1 || opcaoMenu > n2) {
            opcaoValida = false;
            System.out.println(">> Opção Inválida! :( <<");
            System.out.println("");
        } else {
            opcaoValida = true;
        }
    }

    /**
     * Método que exibe o relatório de vagas
     */
    public void exibirRelatorioVagas() {
        for (int i = 0; i < contVagas; i++) {
            if (vaga[i].disponibilidade == true) { // só vão ser mostrada as vagas que estão disponíveis
                System.out.print(vaga[i].numero + " - ");
                System.out.println(vaga[i].tipoVaga);
                System.out.println("> Data de Criação: " + vaga[i].dataCriacao);
                System.out.println("> Local: " + vaga[i].localVaga);
                System.out.println("> Remuneração: R$" + vaga[i].remuneracao);
                System.out.println("> Detalhes: " + vaga[i].descricaoVaga);
                System.out.println("\033[34m" + "══════════════════════════════");
            }
        }
    }
}

/*
 * Esta classe contém todos os menus relacionados ao empregador ( quando é efetuado o login como empregador )
 */
package simuladorsms;

import static simuladorsms.SimuladorSMS.contVagas;
import static simuladorsms.SimuladorSMS.numAlteracao;
import static simuladorsms.SimuladorSMS.numOferta;
import static simuladorsms.SimuladorSMS.local;
import static simuladorsms.SimuladorSMS.vaga;
import static simuladorsms.SimuladorSMS.tipo;
import static simuladorsms.SimuladorSMS.data;
import static simuladorsms.SimuladorSMS.remuneracao;
import static simuladorsms.SimuladorSMS.detalhes;
import java.util.Date;

/**
 * @função deixar o código principal mais limpo ao retirar todos os menus
 * relacionados ao servidor
 * @data 19.04.2016
 * @autores João Lucas, Emerson e Juliana Galarraga
 */
public class MenuEmpregador {

    /**
     * método para exibir o menu principal do empregador
     */
    public void exibirMenuPrincipalEmpregador() {
        System.out.println("\033[34m" + "══════════════════════════════");
        System.out.println("|               OPÇÕES EMPREGADOR              |");
        System.out.println("\033[34m" + "══════════════════════════════");
        System.out.println("| (1) Adicionar oferta                          ");
        System.out.println("| (2) Alterar oferta                            ");
        System.out.println("| (3) Sair                                      ");
        System.out.println("\033[34m" + "══════════════════════════════");
    }

    /**
     * método para adicionar vaga
     */
    public void adicionarVaga() {
        System.out.println("\033[34m" + "══════════════════════════════");
        System.out.println("|              ADICIONAR UMA VAGA              |");
        System.out.println("\033[34m" + "══════════════════════════════");
        String lixo = SimuladorSMS.teclado.nextLine(); //O que é isso?
        System.out.print("| Local do serviço: ");
        local = SimuladorSMS.teclado.nextLine();
        System.out.print("| Tipo de vaga: ");
        tipo = SimuladorSMS.teclado.nextLine();
        System.out.print("| Data do serviço: ");
        data = SimuladorSMS.teclado.nextLine();
        System.out.print("| Remuneração diária: R$");
        remuneracao = SimuladorSMS.teclado.nextLine();
        System.out.print("| Detalhes: ");
        detalhes = SimuladorSMS.teclado.nextLine();
        //Como quebrar a linha quando os caracteres >= 34 ???
        System.out.println("| (1) Adicionar vaga                            ");
        System.out.println("| (2) Voltar                                    ");
        System.out.println("\033[34m" + "══════════════════════════════");
    }

    /**
     * Método que cria uma nova vaga
     */
    public void criarVaga() {
        System.out.println("\033[34m" + "Vaga adicionada com sucesso! :)");
        System.out.println("");
        vaga[contVagas] = new Vaga();
        vaga[contVagas].descricaoVaga = detalhes;
        vaga[contVagas].disponibilidade = true;
        vaga[contVagas].localVaga = local;
        vaga[contVagas].periodoVaga = data;
        vaga[contVagas].tipoVaga = tipo;
        vaga[contVagas].remuneracao = remuneracao;
        vaga[contVagas].numero = contVagas;
        contVagas += 1; // estaria aumentando o tamanho do vetor
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

    /**
     * Método que exibe as vagas que podem ser alteradas
     */
    public void alterarVaga() {
        System.out.println("\033[34m" + "══════════════════════════════");
        System.out.println("|               ALTERAR VAGA                  |");
        System.out.println("\033[34m" + "══════════════════════════════");
        exibirRelatorioVagas();
        System.out.println("| (1) Selecionar vaga para alteração            ");
        System.out.println("| (2) Voltar                                    ");
        System.out.println("\033[34m" + "══════════════════════════════");
    }

    /**
     * Método para a edição da vaga selecionada
     */
    public void editarVaga() {
        System.out.println("\033[34m" + "══════════════════════════════");
        System.out.println("|               EDITAR UMA VAGA                |");
        System.out.println("\033[34m" + "══════════════════════════════");
        String lixo = SimuladorSMS.teclado.nextLine();
        System.out.print("| Local do serviço: ");
        local = SimuladorSMS.teclado.nextLine();
        System.out.print("| Tipo de vaga: ");
        tipo = SimuladorSMS.teclado.nextLine();
        System.out.print("| Data do serviço: ");
        data = SimuladorSMS.teclado.nextLine();
        System.out.print("| Remuneração diária: R$");
        remuneracao = SimuladorSMS.teclado.nextLine();
        System.out.print("| Detalhes: ");
        detalhes = SimuladorSMS.teclado.nextLine();
        System.out.println("| (1) Salvar alterações                          ");
        System.out.println("| (2) Voltar                                     ");
        System.out.println("\033[34m" + "══════════════════════════════");
    }

    public void salvarEdicaoVaga() {
        System.out.println("\033[34m" + "Vaga alterada com sucesso! :)");
        System.out.println("");
        vaga[numAlteracao].descricaoVaga = detalhes;
        vaga[numAlteracao].localVaga = local;
        vaga[numAlteracao].periodoVaga = data;
        vaga[numAlteracao].tipoVaga = tipo;
        vaga[numAlteracao].remuneracao = remuneracao;
    }
}

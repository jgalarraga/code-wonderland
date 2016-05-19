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
import static simuladorsms.SimuladorSMS.login;
import static simuladorsms.SimuladorSMS.menuGeral;
import static simuladorsms.SimuladorSMS.opcaoMenuEmpregador;
import static simuladorsms.SimuladorSMS.opcaoValida;
import static simuladorsms.SimuladorSMS.senha;
import static simuladorsms.SimuladorSMS.teclado;
import static simuladorsms.SimuladorSMS.tipoLogin;

/**
 * @função deixar o código principal mais limpo ao retirar todos os menus
 * relacionados ao servidor
 * @data 19.04.2016
 * @autores João Lucas, Emerson e Juliana Galarraga
 */
public class MenuEmpregador {

    public void efetuarLoginEmpregador() {
        System.out.println("\033[34m" + "--------------------------------");
        System.out.println("    Informe o login e senha: ");
        System.out.println("\033[34m" + "--------------------------------");
        System.out.print("\033[30m" + "‣ login empregador: ");
        login = teclado.next();
        System.out.print("‣ senha: ");
        senha = teclado.next();
        System.out.println("");

        validarLoginEmpregador();
    }

    public void validarLoginEmpregador() {
        if (login.equals(tipoLogin) && senha.equals(tipoLogin)) {
            opcaoValida = true;
        } else {
            System.out.println("login/senha inválido(a)! :( ");
            System.out.println("");
        }
    }

    public void selecionarOpcaoEmpregador(int n1, int n2) {
        System.out.println("");
        System.out.print("\033[30m" + "Selecione uma opção(" + n1 + "-" + n2 + "): ");
        opcaoMenuEmpregador = teclado.nextInt();
        System.out.println("");
    }

    public void validarOpcaoEmpregador(int n1, int n2) {
        if (opcaoMenuEmpregador < n1 || opcaoMenuEmpregador > n2) {
            opcaoValida = false;
            System.out.println(">> Opção Inválida! :( <<");
            System.out.println("");
        } else {
            opcaoValida = true;
        }
    }

    /**
     * método para exibir o menu principal do empregador
     */
    public void exibirMenuPrincipalEmpregador() {
        System.out.println("\033[34m" + "══════════════════════════════");
        System.out.println("|               OPÇÕES EMPREGADOR              |");
        System.out.println("\033[34m" + "══════════════════════════════");
        System.out.println("| (1) Adicionar oferta                          ");
        System.out.println("| (2) Alterar oferta                            ");
        System.out.println("| (3) Excluir oferta                            ");
        System.out.println("| (4) Logoff                                    ");
        System.out.println("| (5) Sair                                      ");
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
     * Método que exibe as vagas que podem ser alteradas
     */
    public void alterarVaga() {
        System.out.println("\033[34m" + "══════════════════════════════");
        System.out.println("|               ALTERAR VAGA                  |");
        System.out.println("\033[34m" + "══════════════════════════════");
        menuGeral.exibirRelatorioVagas();
        System.out.println("| (1) Selecionar vaga para alteração            ");
        System.out.println("| (2) Voltar                                    ");
        System.out.println("\033[34m" + "══════════════════════════════");
    }

    public void selecionarVagaAlteracao() {
        System.out.print(">> Qual é a vaga que deseja alterar? ");
        numAlteracao = teclado.nextInt();
        System.out.println("");
    }

    public void excluirVagaMenu() {
        System.out.println("\033[34m" + "══════════════════════════════");
        System.out.println("|               EXCLUIR VAGA                    |");
        System.out.println("\033[34m" + "══════════════════════════════");
        menuGeral.exibirRelatorioVagas();
        System.out.println("| (1) Selecionar vaga para exclusão            ");
        System.out.println("| (2) Voltar                                    ");
        System.out.println("\033[34m" + "══════════════════════════════");
    }

    public void selecionarVagaExclusao() {
        System.out.print("> Qual vaga deseja excluir? ");
        numOferta = teclado.nextInt();
        System.out.println("");
    }

    public void excluirVaga() {

        selecionarVagaExclusao();

        Vaga[] vetorAux = new Vaga[vaga.length];
        int cont = 0;
        for (int i = 0; i < vaga.length; i++) {
            // se avaga não for igual o número vaga que quero excluir
            if (i != numOferta) {
                // o vetor aux vai receber a vaga
                vetorAux[cont] = vaga[i];
                cont++;
            }
        }
        // o vetor vaga agora é o vetorAux
        vaga = vetorAux;

        System.out.println("");
        System.out.println("\033[34m" + "Vaga " + numOferta + " excluída! :(");
        System.out.println("");
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

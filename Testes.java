/*
 * Classe voltada para testes
 */
package simuladorsms;

import java.util.Scanner;

/**
 *
 * @autores 
 */

public class Testes {

    public static void main(String[] args) {
        /* Declaração de Variáveis */
        // Meu vetor vaga tem capacidade para receber duas vagas
        Vaga[] vaga = new Vaga[5];
        Scanner in = new Scanner(System.in);
        boolean voltar = false;
        int resposta = 0;
        int i = 0;

        /* Inicialização do Vetor */
        do {
            vaga[i] = new Vaga();
            vaga[i].dataCriacao = in.nextLine();
            vaga[i].tipoVaga = in.nextLine();
            vaga[i].descricaoVaga = in.nextLine();
            vaga[i].periodoVaga = in.nextLine();
            vaga[i].localVaga = in.nextLine();
            vaga[i].remuneracao = in.nextLine();
            vaga[i].disponibilidade = false;
            i += +1;
            System.out.println("Deseja continuar ?");
            resposta = in.nextInt();
            
            if (resposta != 1) {
                voltar = true;
            }

        } while (!voltar);

        /* Saída */
        // imprimindo a lista de vagas
        for (int j = 0; j < i; j++) {
            if (vaga[j].disponibilidade == false) {
                System.out.println("----------------");
                System.out.println(vaga[j].dataCriacao);
                System.out.println(vaga[j].tipoVaga);
                System.out.println(vaga[j].descricaoVaga);
                System.out.println(vaga[j].periodoVaga);
                System.out.println(vaga[j].localVaga);
                System.out.println(vaga[j].remuneracao);
            }
        }

    }

}

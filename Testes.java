/*
 * Classe voltada para testes
 */
package simuladorsms;

/**
 *
 * @author User
 */
public class Testes {

    public static void main(String[] args) {
        /* Declaração de Variáveis */
        // Meu vetor vaga tem capacidade para receber duas vagas
        Vaga[] vaga = new Vaga[2];
        
        /* Inicialização do Vetor */
        for (int i = 0; i < vaga.length; i++){
            vaga[i] = new Vaga();
        }
        
        // Adicionando as informações às vagas
        // Vaga 1
        vaga[0].dataCriacao = "05/03/2016";
        vaga[0].tipoVaga = "Empregada Doméstica";
        vaga[0].descricaoVaga = "BUSCAMOS DIARISTAS COM EXPERIÊNCIA COMPROVADA, PARA TRABALHAR EM RESIDÊNCIAS,COMÉRCIOS E EMPRESAS.";
        vaga[0].periodoVaga = "Jornada Período Integral.DIAS E HORARIOS VARIADOS DE ACORDO COM SUA DISPONIBILIDADE";
        vaga[0].localVaga = "São Paulo, Sp";
        vaga[0].remuneracao = "A Combinar";
        
        // Vaga 2
        vaga[1].dataCriacao = "05/03/2016";
        vaga[1].tipoVaga = "faxineira";
        vaga[1].descricaoVaga = ".";
        vaga[1].periodoVaga = ".";
        vaga[1].localVaga = ".";
        vaga[1].remuneracao = ".";
        
        // Vaga 3
        
        
        /* Saída */
        // imprimindo a lista de vagas
        for (int j = 0; j < vaga.length; j++){
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

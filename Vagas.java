/**
 * Classe que contém todas as vagas que aparecerão no programa no seguinte formato:
 * - data da criação da vaga
 * - empresa
 * - tipo de vaga
 * - descrição
 * - localização
 * - dias/horário de trabalho
 * - remuneração
 * 
 */

package simuladorsms;

/**
 * @função
 * @data 22/04/2016
 * @autores João Lucas & Juliana Galarraga
 */

public class Vagas {

    /* Declaração de Variáveis */
    String vaga1 = "05/03/2016#MARY HELP VILA CARRÃO#Empregada Doméstica#BUSCAMOS DIARISTAS COM EXPERIÊNCIA COMPROVADA, PARA TRABALHAR EM RESIDÊNCIAS,COMÉRCIOS E EMPRESAS."
            + "Jornada Período Integral.#São Paulo,Sp#DIAS E HORARIOS VARIADOS DE ACORDO COM SUA DISPONIBILIDADE#A Combinar";
    ;
    String vaga2 = "05/03/2016#CONSULT EXPRESS CONTACT CENTER BARRETOS LTDA#faxineira#Limpeza geral. Lavar e passar roupas. Jornada Período Integral.#São José do Rio Preto,SP#três dias "
            + "da semana#R$400,00 à R$500,00 (Bruto Mensal)";
    ;
    String vaga3 = vaga3 = "05/03/2016#Nome Confidencial#Empregada Doméstica#Procura-se diarista com experiência para serviços Gerais - Limpeza Doméstica.Limpar casa, passar, lavar e realizar "
            + "atividades pertinentes ao cargo.Jornada Período Integral.#São Paulo,SP#três dias da semana#R$800,00 à R$1.000,00 (Bruto Mensal)";

    // com o split, as três variáveis (strings) são "cortadas" onde há o hashtag (#) e armazenadas em cada posição desses vetores abaixo
    String[] primeiraVaga = vaga1.split("#");
    String[] segundaVaga = vaga2.split("#");
    String[] terceiraVaga = vaga3.split("#");
    
}

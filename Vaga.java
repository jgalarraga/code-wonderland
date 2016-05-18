/**
 * Classe que contém todas as características das vagas:
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

import java.util.Date;

/**
 * @função armazenar as características que todas as vagas irão conter
 * @data 28/04/2016
 * @autores João Lucas, Emerson & Juliana Galarraga
 */
public class Vaga {
    /* Declaração de Variáveis */
    Date dataCriacao;
    String tipoVaga;
    String descricaoVaga;
    String localVaga;
    String periodoVaga;
    String remuneracao;
    int numero;
    boolean disponibilidade;
}

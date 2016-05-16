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

/**
 * @função gravação da data automaticamente ao inserir vaga 
 * @data 16/05/2016
 * @autor Emer Martins
 */ 
import java.util.Date;

/**
 * @função armazenar as características que todas as vagas irão conter
 * @data 28/04/2016
 * @author João Lucas & Juliana Galarraga
 */
public class Vaga {
    /* Declaração de Variáveis */
    Date dataCriacao;
    String tipoVaga;
    String descricaoVaga;
    String localVaga;
    String periodoVaga; // dias/horário
    String remuneracao;
}

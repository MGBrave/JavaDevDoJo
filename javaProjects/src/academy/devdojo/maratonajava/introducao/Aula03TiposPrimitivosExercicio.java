package academy.devdojo.maratonajava.introducao;
/*Prática
Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:
Eu <nome>, morando no endereço <endereço>, confirmo que recebi o salário de <salário>, na <data>.
 */

public class Aula03TiposPrimitivosExercicio {

    public static void main(String[] args) {
        String nome = "Paulo Coelho" ;
        String endereço = "Avenida João das Galileias";
        double salario = 5431.12;
        String dataRecebimentoSalario = "20/12/2021";
        String relatorio = "Eu " +nome+ ", morando no endereço "+ endereço+", confirmo que recebi o salário de R$" + salario+ ", no dia " +dataRecebimentoSalario;

        System.out.println(relatorio);
    }


    }


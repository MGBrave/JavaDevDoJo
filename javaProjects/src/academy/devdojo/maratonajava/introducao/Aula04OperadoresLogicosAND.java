package academy.devdojo.maratonajava.introducao;

public class Aula04OperadoresLogicosAND {
    public static void main(String[] args) {
        //&& (AND), ||(OR) !
        int idade = 35;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;



        System.out.println(" isDentroDaLeiMaiorQueTrinta " + isDentroDaLeiMaiorQueTrinta);
        System.out.println(" isDentroDaLeiMenorQueTrinta " + isDentroDaLeiMenorQueTrinta);



    }
}

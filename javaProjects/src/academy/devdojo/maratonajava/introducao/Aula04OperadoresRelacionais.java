package academy.devdojo.maratonajava.introducao;

public class Aula04OperadoresRelacionais {
    public static void main(String[] args) {
        // + - / *
        int numero01=10;
        int numero02=20;
        double resultado = numero01/ (double) numero02;
        System.out.println(resultado);

        // %

        //int resto = 20 % 2; resultado zero é par
        //System.out.println(resto);

        int resto = 21 % 2; //resultado diferente de  zero é ímpar
        System.out.println(resto);


        //operadores lógicos retornam um valor booleano
        // < >  <=  >=   ==  !=

        boolean isDezMaiorQueVinte= 10 > 20;
        boolean isDezMenorQueVinte= 10 < 20;
        boolean isDezIgualVinte= 10 ==20;
        boolean isDezIgualDez= 10 == 10;
        boolean isDezDiferenteDez= 10 != 10;

        System.out.println("isDezMaiorQueVinte " + isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte " + isDezMenorQueVinte);
        System.out.println("isDezIgualVinte " + isDezIgualVinte);
        System.out.println("isDezIgualDez " + isDezIgualDez);
        System.out.println("isDezDiferenteDez " + isDezDiferenteDez);


    }
}

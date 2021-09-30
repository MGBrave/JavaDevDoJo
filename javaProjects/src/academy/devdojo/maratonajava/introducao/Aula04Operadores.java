package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - * /
        int numero01 =10;
        int numero02 = 20;
        double numero03 = 20;
        int resultado = numero01 + numero02;

        System.out.println(numero02 - numero01);
        System.out.println(numero02 / numero01);
        System.out.println(numero01 /(double) numero02);
        System.out.println(numero01 / numero03);
        System.out.println(numero02 * numero01);
        System.out.println(numero02 + numero01);
        System.out.println("Valor " + numero02 + numero01 );
        System.out.println(numero02 + numero01 + " Valor " + numero02 + numero01);
        System.out.println(resultado);
/*
        //%

        int resto = 21 % 2;
        System.out.println(resto);

        //operadores logicos retornam valores booleano

        // < >   <=(menor ou igual)   >=(maior ou igual)   ==(igual)  !=(diferente)

        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualAVinte = 10 == 20;
        boolean isDezIgualADez = 10 == 10;
        //boolean isDezIgualADez = 10 == "10.0";
        boolean isDezDiferenteDez = 10!=10;


        System.out.println("isDezMaiorQueVinte " +isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte " +isDezMenorQueVinte);
        System.out.println("isDezIgualAVinte " +isDezIgualAVinte);
        System.out.println("isDezIgualADez " +isDezIgualADez);
        System.out.println("isDezdiferenteADez " +isDezDiferenteDez);

        //operadores lógicos &&(e/and)  // (or)

        int idade = 35;
        float salario = 3500F;

        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println("isDentroDaLeiMaiorQueTrinta " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta " + isDentroDaLeiMenorQueTrinta);


        int idade = 29;
        float salario = 3500F;

        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println("isDentroDaLeiMaiorQueTrinta " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta " + isDentroDaLeiMenorQueTrinta);


        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float  valorPlaystation = 5000F;

        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println("isPlaystationCincoCompravel " +isPlaystationCincoCompravel);

        // = += -=  *= /= %=  // operadores unários

        double bonus = 1800;//1800
        bonus += 1000; //2800
        bonus -= 1000; //1800
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;

        System.out.println(bonus);
        */

        // ++ --
        int contador = 0;
        contador += 1; //contador = contador + 1;
        contador++;
        contador--;
        ++contador;
        --contador;
        int contador2 = 0;
        System.out.println(contador2++);
        System.out.println(contador2);
        System.out.println(contador);

    }
}

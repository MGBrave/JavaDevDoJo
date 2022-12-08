package academy.devdojo.maratonajava.introducao;

public class Aula04OperadoresAtribuição {
    public static void main(String[] args) {
        // += -= *= /=  %=

       /* double bonus = 1000;
        bonus = bonus + 1000;
        System.out.println(bonus);*/

        //pode escrever assim

        double bonus = 1800;
        bonus +=  1000;
        bonus -=  1000;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;


        System.out.println(bonus);

        // ++ --

        int contador = 0;
        contador += 1; // contador = contador 0 1;
        contador ++;
        contador --;
        ++contador;
        --contador;

        int contador2 = 0;

        System.out.println(contador2++);
        System.out.println(contador2);


    }
}

package academy.devdojo.maratonajava.introducao;
//aula 29/286
public class Aula06EstruturasDeRepeticao02ExercicioFor {
    public static void main(String[] args) {
        //imprima todos os números pares de 0 até 1000000
        for (int i = 1; i <= 1000000; i++) {
            if (i % 2 == 0) {
                //for (int i = 0; i <= 1000000; i+=2000){
                System.out.println(i);
            }
        }
    }
}

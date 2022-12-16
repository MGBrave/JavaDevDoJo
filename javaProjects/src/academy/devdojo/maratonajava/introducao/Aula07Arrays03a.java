package academy.devdojo.maratonajava.introducao;
//aula 36/286
public class Aula07Arrays03a {
    public static void main(String[] args) {
        int[] numeros = new int[3];
        int[] numeros2 = {1,2,3,4,5};
        int[] numeros3 = new int[]{1,2,3,4,5};

        for(int num:numeros3){
            System.out.println(num);
        }
        int num = numeros3[0];
        System.out.println(num);
        num = numeros3[1];
        System.out.println(num);
        num = numeros3[2];
        System.out.println(num);

    }
}

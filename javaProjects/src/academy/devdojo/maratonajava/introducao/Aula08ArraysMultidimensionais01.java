package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais01 {
    public static void main(String[] args) {
        //1, 2, 3, 4, 5,6 primeiro array representa os meses
        //31,38,31,30 dias dias do ano
        int[][] dias = new int[3][3];
        dias[0][0] =31;
        dias[0][1] =28;
        dias[0][2] =30;

        dias[1][0] =31;
        dias[1][1] =28;
        dias[1][2] =30;

      //  System.out.println(dias[0][0]);
        for(int i =0; i< dias.length; i++){
            //System.out.println(dias[i]);imprime o endereço de memória
            for (int j = 0; j < dias[0].length; j++){
            System.out.println(dias[i][j]);
        }
    }
        System.out.println("_________________________________");

        for (int[] arrBase: dias){
            for (int num:arrBase){
                System.out.println(num);
            }
        }

        }

}

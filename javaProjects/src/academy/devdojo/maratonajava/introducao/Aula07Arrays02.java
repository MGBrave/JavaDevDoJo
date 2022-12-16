package academy.devdojo.maratonajava.introducao;
//Aula 35/286
public class Aula07Arrays02 {
    public static void main(String[] args) {
        //byte, short, int, long, float e double 0
        //'\u0000' ' '
        //boolean false
        //string null

        String[] nomes = new String[4];
        nomes[0] = "Goku";
        nomes[1] = "Kurosaki";
        nomes[2] = "Luffy";
        nomes[3] = "Minata";

       // for(int i = 0; i < 4; i++){
        for(int i = 0; i < nomes.length; i++){
            System.out.println(nomes[i]);
        }
    }
}

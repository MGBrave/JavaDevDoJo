package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >=18;
        //int idade = 15;

        if (isAutorizadoComprarBebida) {

            System.out.println("Autorizado a comprar bebida alcoólica. ");
        }
       //if(isAutorizadoComprarBebida == false){
        //if(!isAutorizadoComprarBebida == false)
        else {
           System.out.println(" Não Autorizado a comprar bebida alcoólica. ");
       }
       // boolean c = true;
        boolean c = true;
        if(c=true){
            System.out.println("Dentro de algo que nunca deve ser feito");
        }
        System.out.println("Fora do if  ");
    }
}

package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01IFElse {
    public static void main(String[] args) {
        int idade = 25;
        boolean isAutorizadoComprarBebida = idade >= 18;


        if (isAutorizadoComprarBebida) {

            System.out.println("Autorizado a comprar bebida alcoólica. ");
        } else {
            System.out.println(" Não Autorizado a comprar bebida alcoólica. ");
        }

    }
}

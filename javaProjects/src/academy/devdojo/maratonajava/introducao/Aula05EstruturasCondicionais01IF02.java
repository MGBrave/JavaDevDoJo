package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01IF02 {
    public static void main(String[] args) {
        int idade = 25;
        boolean isAutorizadoComprarBebida = idade >= 18;
        //!

        if (isAutorizadoComprarBebida) {

            System.out.println("Autorizado a comprar bebida alcoólica. ");
        }
        if (!isAutorizadoComprarBebida) {

            System.out.println(" Não Autorizado a comprar bebida alcoólica. ");
        }

    }

}

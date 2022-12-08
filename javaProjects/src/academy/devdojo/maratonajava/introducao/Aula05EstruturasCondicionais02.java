package academy.devdojo.maratonajava.introducao;

//este  não é aconselhavel usar
public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {


        int idade = 12;
        String categoria;
        categoria = idade < 15 ? "Categoria Infantil" : idade >= 15 && idade < 18 ? "Categoria Juvenil" : "Categoria Adulto";


        System.out.println(categoria);
    }
}
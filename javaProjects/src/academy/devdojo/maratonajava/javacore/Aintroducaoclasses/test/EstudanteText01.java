package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;
//aula 40/286
import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteText01 {
    public static void main(String[] args) {
        Estudante estudante= new Estudante();
        estudante.nome = "Luffy";
        estudante.idade = 21;
        estudante.sexo = 'M';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        System.out.println(estudante);
}
}

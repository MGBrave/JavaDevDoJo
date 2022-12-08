package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        //doar salário > 5000
        double salario = 6000;
        //(condicao)? verdadeiro:falso
        //String resultado =(condicao) ? verdadeiro : Falso;

        String resultado = salario > 5000 ? "Eu vou doar pro DevDoJo!" : "Ainda não tenho condições, mas vou ter!";
        System.out.println(resultado);
    }
}
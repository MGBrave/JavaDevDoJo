package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03OpTernario01 {
    public static void main(String[] args) {
        //doar salário > 5000
        double salario = 6000;
        String mensagemDoar = "Eu vou doar pro DevDoJo!";
        String mensagemNaoDoar = "Ainda não tenho condições, mas vou ter!";
        //String resultado =(condicao) ? verdadeiro : Falso;

        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;
        System.out.println(resultado);
    }
}
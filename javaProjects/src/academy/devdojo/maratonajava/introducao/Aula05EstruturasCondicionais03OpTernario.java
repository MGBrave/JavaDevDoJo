package academy.devdojo.maratonajava.introducao;
//aula 23/286 operador ternário

public class Aula05EstruturasCondicionais03OpTernario {
    public static void main(String[] args) {
        //doar salário > 5000
        double salario = 10000;
        String mensagemDoar = "Eu vou doar pro DevDoJo";
        String mensagemNaoDoar = "Ainda não tenho condições, mas vou ter!";
        String resultado;
        if(salario > 5880){
            resultado = mensagemDoar;

        }else{
            resultado = mensagemNaoDoar;
        }
        System.out.println(resultado);
    }
}

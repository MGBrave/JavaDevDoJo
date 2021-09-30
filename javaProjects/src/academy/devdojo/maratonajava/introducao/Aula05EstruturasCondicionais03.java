package academy.devdojo.maratonajava.introducao;
//aula 23/286 operador ternário
/*public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        //doar salário > 5000
        double salario = 3880;
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
public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        //doar salário > 5000
        double salario = 6000;
        String mensagemDoar = "Eu vou doar pro DevDoJo!";
        String mensagemNaoDoar = "Ainda não tenho condições, mas vou ter!";
        //String resultado =(condicao) ? verdadeiro : Falso;

        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;
        System.out.println(resultado);
    }
}*/
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
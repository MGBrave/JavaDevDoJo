package academy.devdojo.maratonajava.introducao;
//aula 25/286
//I want to know how much I have to pay in  the Netherlands 2020 based in my annual salary
public class Aula05EstruturasCondicionais04 {
    //€ 0 € 34,712          9.78%
    //€ 34,713 € 68,587   37.35%
    //€ 68,588            49.58%
    public static void main(String[] args) {
        double salarioAnual = 25000;
        double primeiraFaixa = 9.78/100;
        double segundaFaixa = 37.35/100;
        double terceiraFaixa = 49.58/100;
        double valorImposto;
        if(salarioAnual <= 34712){
            valorImposto  = salarioAnual * primeiraFaixa;
        }else  if(salarioAnual >= 34713 && salarioAnual <= 68587){
            valorImposto = salarioAnual * segundaFaixa;
        }else{
            valorImposto = salarioAnual * terceiraFaixa;
        }
        System.out.println(valorImposto);
     }
    }
    /*
    public static void main(String[] args) {
        double salarioAnual = 45000;
        double primeiraFaixa = 9.78/100;
        double segundaFaixa = 37.35/100;
        double terceiraFaixa = 49.58/100;
        double valorImposto;
        if(salarioAnual <= 34712){
            valorImposto  = salarioAnual * primeiraFaixa;
        }else  if(salarioAnual >= 34713 && salarioAnual <= 68587){
            valorImposto = salarioAnual * segundaFaixa;
        }else{
            valorImposto = salarioAnual * terceiraFaixa;
        }
        System.out.println(valorImposto);
     }
    }


    public static void main(String[] args) {
        double salarioAnual = 70000;
        double primeiraFaixa = 9.78/100;
        double segundaFaixa = 37.35/100;
        double terceiraFaixa = 49.58/100;
        double valorImposto;
        if(salarioAnual <= 34712){
            valorImposto  = salarioAnual * primeiraFaixa;
        }else  if(salarioAnual >= 34713 && salarioAnual <= 68587){
            valorImposto = salarioAnual * segundaFaixa;
        }else{
            valorImposto = salarioAnual * terceiraFaixa;
        }
        System.out.println(valorImposto);
     }
    }*/

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        //int, double, float, char, byte, short, long,boolean
        int age = 10;
        System.out.println(age);
        System.out.println("A idade  é  " + age + " anos");
        //int age = (int) 10000000000L;-forcando o int para long - cast
        long numeroGrande = 100000;
        double salarioDouble = 2000;
        float salarioFloat = 2500.0F;
        byte idadeByte = -128;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractereUnicode = '\u0041';
        char caractereAsc = 87;

        String nome = "Goku";




        System.out.println(verdadeiro);
        System.out.println(falso);
        System.out.println("char " + caractereAsc);
        System.out.println("char " + caractereUnicode);

        System.out.println("Oi, meu nome é "+ nome);

    }
}

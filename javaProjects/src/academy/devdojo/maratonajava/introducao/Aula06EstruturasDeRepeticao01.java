package academy.devdojo.maratonajava.introducao;
//Aula 28/286
public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {

        int count = 0;
        while (count < 10) {
            System.out.println(++count);
        }

        count = 0;
        do {
            System.out.println("dentro do do-while "+ ++count);
        } while (count < 10);
    /*
        for(count=0; count < 10; count++){
            System.out.println("For " +count);
            */
    for(int i = 0; i < 10; i++){
        System.out.println("For " +i);

    }
  }
}
/*
    public static void main(String[] args) {
        //Aula06EstruturasDeRepeticao01 - *
        int count = 0;
        while (count < 10){
            System.out.println(++count);
        }
        count = 0;
        do{
            System.out.println("dentro do do-while "+ ++count);
            /*System.out.println("dentro do do-while " +count);
            count++;

        }while (count < 10);
    }
}
/*
public class Aula06EstruturasDeRepeticao01 {

    public static void main(String[] args) {
        //while, do while, for
        int count = 12;
        while (count < 10){
            System.out.println(++count);
        }
        do {
            System.out.println("dentro do do-while");
        }while (count < 10);
    }
}
//
public class Aula06EstruturasDeRepeticao01 {

    public static void main(String[] args) {
        //while, do while, for
        int count = 0;
        while (count < 10){
            System.out.println(++count);
            /*System.out.println(count);
           //count = count + 1;(pode ser desta maneira)
            //count += 2;(pode ser desta maneira)
            count ++;
        }
    }
}*/

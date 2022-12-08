package academy.devdojo.maratonajava.introducao;

// aula 26/286
public class Aula05EstruturasCondicionais05SwitchExerc01 {
    public static void main(String[] args) {

        // char, int, byte, short, enum, String

        char sexo = 'M';
        switch (sexo) {
            case 'M':
                System.out.println("Homem");
                break;
            case 'F':
                System.out.println("Mulher");
                break;
            default:
                System.out.println("Opção Inválida");
                break;
        }
    }
}

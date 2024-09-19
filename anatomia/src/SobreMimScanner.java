import java.util.Scanner;
import java.util.Locale;

public class SobreMimScanner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome:");
        String nome = scanner.next();

        System.out.println("Seu nome é " + nome);
    }
    
}
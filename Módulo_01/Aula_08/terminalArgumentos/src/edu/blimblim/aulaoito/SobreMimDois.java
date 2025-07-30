import java.util.Scanner;
import java.util.Locale;

public class SobreMimDois {
    public static void main(String[] args) {
        // criando o objeto Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome completo");
        String nome = scanner.next();

        System.out.println("Digite a sua idade");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura");
        Double altura = scanner.nextDouble();

        System.out.println("Olá, me chamo " + nome);
        System.out.println("Tenho " + idade + " anos");
        System.out.println("Minha altura é " + altura + " cm");
        
    }
    
}

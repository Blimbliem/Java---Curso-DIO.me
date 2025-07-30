import java.util.Scanner;
import java.util.Locale;

public class ContaBanco{
    public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    scanner.useLocale(Locale.US);

    System.out.println("Digite o número da agência");    
    String agencia = scanner.next();
    System.out.println("Digite o número da conta");
    int conta = scanner.nextInt();
    scanner.nextLine();
    System.out.println("Digite seu nome completo");
    String nomeCompleto = scanner.nextLine();
    System.out.println("Digite seu saldo bancário");
    double saldo = scanner.nextDouble();

    System.out.println("Olá " + nomeCompleto + ", obrigado por criar uma conta em nosso banco. Sua agência é  " + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque.") ;

    scanner.close();
    }
}

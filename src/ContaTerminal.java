import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main (String []args) {
        Scanner scanner = new Scanner(System.in, "UTF-8").useLocale(Locale.getDefault());
                
        System.out.println("Informe o número da conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Informe a agência: ");
        String agencia = scanner.next();

        System.out.println("Informe o primeiro nome do cliente: ");
        String nomeCliente = scanner.next();

        System.out.println("Informe o sobrenome do cliente: ");
        String sobrenomeCliente = scanner.next();

        System.out.println("Informe o saldo da conta: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente+" "+sobrenomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
            + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque");
        
        scanner.close();
    }
}
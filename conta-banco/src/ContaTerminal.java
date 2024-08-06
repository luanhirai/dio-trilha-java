import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número da sua conta:");
        int numero = scanner.nextInt();

        System.out.println("Digite a agência:");
        String agencia = scanner.next();

        System.out.println("Digite seu nome:");
        String nome = scanner.next();

        // Solicitar o saldo total
        System.out.println("Digite o saldo total:");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco. Sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close();
    }
}

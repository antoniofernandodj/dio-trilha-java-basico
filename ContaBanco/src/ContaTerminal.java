import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        long numero;
        String agencia;
        String nomeCliente;
        double saldo;
        System.out.println("Por favor, digite o numero da agencia!");
        agencia = sc.next();
        System.out.println("Agora, digite o numero da conta.");
        numero = sc.nextLong();
        System.out.println("Agora, digite o seu nome:");
        nomeCliente = sc.next();
        System.out.println("Agora, digite quanto deseja depositar:");
        saldo = sc.nextDouble();
        System.out.println(numero);


        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é " +
                agencia + ", conta " + numero + ", e seu saldo " + String.format("%.2f", saldo) +
                " já está disponível para saque.";

        System.out.println(mensagem);
    }
}
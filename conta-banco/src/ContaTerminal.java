
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //TODO: Exibir as menasagens
        //obter os valores do usuário
        //exibir a conta criada
        Locale.setDefault(Locale.BRAZIL);

        Scanner sc = new Scanner(System.in);

        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println( "Por favor, digite o seu Nome: ");
        nomeCliente = sc.nextLine();
        System.out.println();

        System.out.println( "Por favor, digite o número da Agência: ");
        agencia = sc.nextLine();
        System.out.println();

        System.out.println( "Agora, digite o número da sua Conta: ");
        numeroConta = sc.nextInt();
        System.out.println();

        System.out.println( "Agora, digite o seu saldo: ");
        saldo = sc.nextDouble();
        System.out.println();


        System.out.printf("Olá %s , obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.", nomeCliente, agencia , numeroConta, saldo );
        sc.close();



    }
}

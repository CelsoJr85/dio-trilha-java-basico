import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // Cria um objeto Scanner para receber os dados do terminal
        Scanner scanner = new Scanner(System.in);

        // Declaração das variáveis
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        // Solicita e recebe o número da conta
        System.out.println("Por favor, digite o número da Conta:");
        numero = scanner.nextInt();
        
        // Limpa o buffer do scanner após ler um número inteiro
        scanner.nextLine();

        // Solicita e recebe a agência
        System.out.println("Por favor, digite o número da Agência:");
        agencia = scanner.nextLine();

        // Solicita e recebe o nome do cliente
        System.out.println("Por favor, digite o nome do Cliente:");
        nomeCliente = scanner.nextLine();

        // Solicita e recebe o saldo
        System.out.println("Por favor, digite o saldo:");
        saldo = scanner.nextDouble();

        // Exibe a mensagem final com os dados inseridos
        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.";
        System.out.println(mensagem);

        // Fecha o scanner
        scanner.close();
    }
}

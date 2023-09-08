import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception{
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        // Se não houver 4 argumentos, solicite entrada do usuário
        if (args.length != 4) {
           
        // Cria um objeto Scanner para ler entradas do sistema (teclado)
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, digite o nome do(a) cliente: ");
        // Lê outra linha de texto para o nome do cliente
        nomeCliente = scanner.nextLine();


        System.out.print("Por favor, digite a Agência: ");
        // Lê uma linha de texto digitada pelo usuário e armazena em uma variável de texto (String)
        agencia = scanner.nextLine();

        // Exibe uma mensagem para o usuário
        System.out.print("Por favor, digite o número da Agência: ");
        // Lê um número inteiro digitado pelo usuário
        numero = scanner.nextInt();
        // Limpa a quebra de linha pendente após a leitura do número
        scanner.nextLine();

        System.out.print("Por favor, digite o saldo: ");
        // Lê um número decimal (double)
        saldo = scanner.nextDouble();

     

        // Fecha o objeto Scanner para liberar recursos
        scanner.close();

        } else {
            // Se houver 4 argumentos, use os argumentos da linha de comando

             nomeCliente = args[0];
             agencia = args[1];
             numero = Integer.parseInt(args[2]); //converter uma representação de texto (uma string) em um valor inteiro (um número inteiro)

            // converte uma string (representando um número em ponto flutuante) em um valor double
            saldo = Double.parseDouble(args[3]);
        }

        System.out.print("Olá " + nomeCliente);
        System.out.print(", obrigado(a) por criar uma conta em nosso banco, ");
        System.out.print(" sua agência é: " + agencia);
        System.out.print(", Conta: " + numero);
        System.out.print(" e seu saldo de R$" + saldo);
        System.out.print(" já esta disponível para saque.");

    }
}

import java.text.DecimalFormat;  // Importa a classe DecimalFormat para formatação de números decimais.
import java.util.Scanner;  // Importa a classe Scanner para leitura de dados do usuário.

public class Desafio {

    public static void main(String[] args) {
        // Lendo os dados de Entrada:
        Scanner scanner = new Scanner(System.in);  // Cria um objeto Scanner para ler dados do console.
        String titular = scanner.next();  // Lê o nome do titular da conta.
        int numeroConta = scanner.nextInt();  // Lê o número da conta.
        double saldo = scanner.nextDouble();  // Lê o saldo inicial da conta.
        double taxaJuros = scanner.nextDouble();  // Lê a taxa de juros da conta poupança.

        // Utilizando diferentes construtores para criar um objeto do tipo ContaPoupanca
        ContaPoupanca contaPoupanca = new ContaPoupanca(numeroConta, titular, saldo, taxaJuros);

        System.out.println("Conta Poupanca:");  // Imprime uma mensagem indicando que as informações da conta poupança serão exibidas.
        contaPoupanca.exibirInformacoes();  // Chama o método exibirInformacoes() da conta poupança.
    }
}

abstract class ContaBancaria {
    protected int numero;  // Número da conta bancária.
    protected String titular;  // Nome do titular da conta.
    protected double saldo;  // Saldo da conta bancária.

    public ContaBancaria(int numero, String titular, double saldo) {
        // Construtor que inicializa os atributos da classe com os valores passados como parâmetro.
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    // Método abstrato que precisa ser implementado pelas classes filhas
    public abstract void exibirInformacoes();  // Método abstrato que será implementado nas classes filhas para exibir informações da conta bancária.
}

class ContaPoupanca extends ContaBancaria {
    private double taxaJuros;  // Taxa de juros da conta poupança.

    // Construtor principal
    public ContaPoupanca(int numero, String titular, double saldo, double taxaJuros) {
        // Construtor que chama o construtor da classe pai (ContaBancaria) e inicializa o atributo adicional (taxaJuros).
        super(numero, titular, saldo);
        this.taxaJuros = taxaJuros;
    }

    // Outras sobrecargas de construtores

    @Override
    public void exibirInformacoes() {
        // Complementando as informações com a taxa de juros.
        DecimalFormat decimalFormat = new DecimalFormat("#.0");  // Cria um objeto DecimalFormat para formatar números decimais.
        System.out.println(titular);  // Imprime o nome do titular.
        System.out.println(numero);  // Imprime o número da conta.
        System.out.println("Saldo: R$ " + decimalFormat.format(saldo));  // Imprime o saldo formatado em reais.
        System.out.println("Taxa de juros: " + decimalFormat.format(taxaJuros) + "%");  // Imprime a taxa de juros formatada como porcentagem.
    }
}

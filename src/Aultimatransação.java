import java.util.Scanner;

public class Desafio {
    
  public static void main(String[] args) {
    // Criar um Scanner para ler a entrada do usuário
    Scanner scanner = new Scanner(System.in);

    // Ler a entrada do usuário como uma string
    String entrada = scanner.nextLine();
    
    // Dividir a entrada em partes usando a vírgula como delimitador
    String[] partes = entrada.split(",");

    // Verificar se a entrada contém todos os elementos necessários
    if (partes.length == 4) {
        // Extrair os valores das partes
        String data = partes[0];
        String hora = partes[1];
        String descricao = partes[2];
        double valor;

        // Tentar converter a parte "valor" para um double
        try {
            valor = Double.parseDouble(partes[3]);
        } catch (NumberFormatException e) {
            // Se a conversão falhar, imprimir uma mensagem de erro e encerrar o programa
            System.out.println("Formato inválido para o valor. Certifique-se de fornecer um número válido.");
            return;
        }

        // Criar uma instância da classe Transacao com os valores extraídos
        Transacao transacao = new Transacao(data, hora, descricao, valor);

        // Imprimir os detalhes da transação
        transacao.imprimir();
    } else {
        // Se a entrada estiver incompleta, imprimir uma mensagem de erro
        System.out.println("Formato de entrada inválido. Certifique-se de fornecer todos os elementos necessários.");
    }
  }
}

class Transacao {
  private String data;
  private String hora;
  private String descricao;
  private double valor;

  // Construtor para inicializar uma instância da classe com os valores fornecidos
  public Transacao(String data, String hora, String descricao, double valor) {
    this.data = data;
    this.hora = hora;
    this.descricao = descricao;
    this.valor = valor;
  }
  
  // Método para imprimir os detalhes da transação
  public void imprimir() {
    System.out.println(this.descricao);
    System.out.println(this.data);
    System.out.println(this.hora);
    System.out.printf("%.2f\n", this.valor);
  }
}

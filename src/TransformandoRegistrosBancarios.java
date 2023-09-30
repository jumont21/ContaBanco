import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Lê a entrada do usuário
        String entrada = scanner.nextLine();

        // Divide a entrada usando vírgula e ponto e vírgula, pois pode haver diferentes formatos de entrada
        String[] partes = entrada.split("[,;]");

        // Verifica se o formato da entrada está correto
        if (partes.length == 4) {
            // Extrai os valores da entrada
            String data = partes[0];
            String hora = partes[1];
            String descricao = partes[2];
            double valor = Double.parseDouble(partes[3]);

            // Cria um objeto Transacao com os valores fornecidos
            Transacao transacao = new Transacao(data, hora, descricao, valor);

            // Imprime os detalhes da transação
            transacao.imprimir();
        } else {
            System.out.println("Formato de entrada inválido. Certifique-se de usar o formato: data,hora,descricao,valor");
        }
    }
}

class Transacao {
    // Atributos para armazenar os dados da transação
    private String data;
    private String hora;
    private String descricao;
    private double valor;

    // Construtor para inicializar os atributos da transação
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
        System.out.printf("%.2f", this.valor);
    }
}

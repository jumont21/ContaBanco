// créditos: https://github.com/CarlosEduardoLemos/Desafios-Bootcamp2023/blob/main/Java/Desafio03.java
// comentários adicionados para estudo
import java.util.Scanner;

// Classe abstrata base para todos os tipos de cofre
abstract class Cofre {
    protected String tipo;  // Tipo de cofre (Digital ou Físico)
    protected String metodoAbertura;  // Método de abertura (Senha ou Chave)

    // Construtor da classe base Cofre
    public Cofre(String tipo, String metodoAbertura) {
        this.tipo = tipo;
        this.metodoAbertura = metodoAbertura;
    }

    // Método para imprimir informações do cofre
    public void imprimirInformacoes() {
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Metodo de abertura: " + this.metodoAbertura);
    }
}

// Classe específica para Cofres Digitais (herda de Cofre)
class CofreDigital extends Cofre {
    private int senha;  // Senha do cofre digital

    // Construtor específico para CofreDigital
    public CofreDigital(int senha) {
        super("Cofre Digital", "Senha");  // Chama o construtor da classe base
        this.senha = senha;
    }

    // Método para validar a senha do cofre digital
    public boolean validarSenha(int confirmacaoSenha) {
        return confirmacaoSenha == this.senha;
    }
}

// Classe específica para Cofres Físicos (herda de Cofre)
class CofreFisico extends Cofre {
    // Construtor específico para CofreFisico
    public CofreFisico() {
        super("Cofre Fisico", "Chave");  // Chama o construtor da classe base
    }
}

// Classe principal que contém o método main
public class Desafio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String tipoCofre = scanner.nextLine();  // Lê o tipo de cofre (digital ou fisico)

        // Verifica o tipo de cofre escolhido
        if (tipoCofre.equalsIgnoreCase("digital")) {
            gerenciarCofreDigital(scanner);  // Chama o método para gerenciar cofre digital
        } else if (tipoCofre.equalsIgnoreCase("fisico")) {
            gerenciarCofreFisico();  // Chama o método para gerenciar cofre físico
        } else {
            System.out.println("Tipo de cofre inválido");
        }
    }

    // Método para gerenciar o cofre digital
    private static void gerenciarCofreDigital(Scanner scanner) {
        int senha = scanner.nextInt();  // Lê a senha do cofre digital
        int confirmacaoSenha = scanner.nextInt();  // Lê a confirmação da senha

        CofreDigital cofreDigital = new CofreDigital(senha);  // Cria um cofre digital com a senha fornecida

        // Verifica se a senha está correta
        if (cofreDigital.validarSenha(confirmacaoSenha)) {
            cofreDigital.imprimirInformacoes();  // Imprime informações do cofre digital
            System.out.println("Cofre aberto!");  // Informa que o cofre foi aberto com sucesso
        } else {
            cofreDigital.imprimirInformacoes();  // Imprime informações do cofre digital
            System.out.println("Senha incorreta!");  // Informa que a senha está incorreta
        }
    }

    // Método para gerenciar o cofre físico
    private static void gerenciarCofreFisico() {
        CofreFisico cofreFisico = new CofreFisico();  // Cria um cofre físico

        cofreFisico.imprimirInformacoes();  // Imprime informações do cofre físico
    }
}

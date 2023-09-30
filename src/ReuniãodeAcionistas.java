import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {
        // Lê os dados de Entrada conforme descrito neste Desafio.
        Scanner scanner = new Scanner(System.in);
        String dataInicial = scanner.nextLine();
        String dataFinal = scanner.nextLine();

        // Instancia a classe responsável por gerenciar as análises
        SistemaAcionistas sistemaAcionistas = new SistemaAcionistas();
        // Obtém as análises de desempenho no período especificado
        List<String> analises = sistemaAcionistas.obterAnalisesDesempenho(dataInicial, dataFinal);

        // Exibe as análises resultantes
        for (String analise : analises) {
            System.out.println(analise);
        }
    }
}

class SistemaAcionistas {
    // Método para obter análises de desempenho dentro de um período
    public List<String> obterAnalisesDesempenho(String dataInicialStr, String dataFinalStr) throws ParseException {
        // Define um formato para conversão de strings para datas
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        // Converte as strings de data para objetos Date
        Date dataInicial = df.parse(dataInicialStr);
        Date dataFinal = df.parse(dataFinalStr);

        // Simula uma base de dados em uma lista de análises:
        List<Analise> analises = new ArrayList<>();
        analises.add(new Analise(df.parse("01/01/2023"), "Analise de Desempenho Financeiro"));
        analises.add(new Analise(df.parse("15/02/2023"), "Analise de Riscos e Exposicoes"));
        analises.add(new Analise(df.parse("31/03/2023"), "Analises Corporativas"));
        analises.add(new Analise(df.parse("01/04/2023"), "Analise de Politicas e Regulamentacoes"));
        analises.add(new Analise(df.parse("15/05/2023"), "Analise de Ativos"));
        analises.add(new Analise(df.parse("30/06/2023"), "Analise de Inovacao e Tecnologia"));

        // Filtra as análises dentro do período especificado
        List<String> analisesFiltradas = new ArrayList<>();
        for (Analise analise : analises) {
            // Adiciona a descrição da análise à lista se estiver dentro do período
            if (!analise.data.before(dataInicial) && !analise.data.after(dataFinal)) {
                analisesFiltradas.add(analise.descricao);
            }
        }

        // Retorna a lista de análises filtradas
        return analisesFiltradas;
    }

    // Representa uma análise
    class Analise {
        Date data;
        String descricao;

        // Construtor da classe Analise
        public Analise(Date data, String descricao) {
            this.data = data;
            this.descricao = descricao;
        }
    }
}

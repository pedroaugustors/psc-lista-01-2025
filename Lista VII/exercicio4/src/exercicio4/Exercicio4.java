
package exercicio4;
import java.util.*;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] contadores = new int[9]; // Índices 0 a 8

        System.out.println("Digite as vendas brutas dos vendedores (digite -1 para sair):");

        while (true) {
            double vendas = scanner.nextDouble();
            if (vendas == -1) break;

            double salario = 200 + (vendas * 0.09);
            int faixa = (int) salario / 100;

            if (faixa >= 10) {
                contadores[8]++;
            } else if (faixa >= 2) {
                contadores[faixa - 2]++;
            }
        }

        System.out.println("Distribuição dos salários:");
        String[] faixas = {
            "$200 - $299", "$300 - $399", "$400 - $499", "$500 - $599",
            "$600 - $699", "$700 - $799", "$800 - $899", "$900 - $999",
            "$1000 em diante"
        };

        for (int i = 0; i < contadores.length; i++) {
            System.out.printf("%s: %d vendedor(es)%n", faixas[i], contadores[i]);
        }

        scanner.close();
    }
}


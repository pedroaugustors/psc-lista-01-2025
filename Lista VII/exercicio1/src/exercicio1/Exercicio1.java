
package exercicio1;
import java.util.*;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> temperaturas = new ArrayList<>();
        String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
                          "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

        // Leitura das temperaturas
        for (int i = 0; i < 12; i++) {
            System.out.print("Digite a temperatura media de " + meses[i] + ": ");
            temperaturas.add(scanner.nextDouble());
        }

        // Cálculo da média
        double soma = 0;
        for (double temp : temperaturas) {
            soma += temp;
        }
        double media = soma / 12;

        System.out.printf("Média anual: %.2f°C%n", media);
        System.out.println("Meses com temperatura acima da media:");
        for (int i = 0; i < 12; i++) {
            if (temperaturas.get(i) > media) {
                System.out.printf("%d - %s: %.2f°C%n", i + 1, meses[i], temperaturas.get(i));
            }
        }

        scanner.close();
    }
}

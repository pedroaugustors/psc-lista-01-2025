
package exercicio3;
import java.util.*;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> notas = new ArrayList<>();
        double entrada;

        System.out.println("Digite as notas (digite -1 para encerrar):");

        while (true) {
            entrada = scanner.nextDouble();
            if (entrada == -1) break;
            notas.add(entrada);
        }

        int qtdNotas = notas.size();
        System.out.println("Quantidade de notas: " + qtdNotas);

        System.out.print("Notas informadas: ");
        for (double nota : notas) {
            System.out.print(nota + " ");
        }

        System.out.println("\nNotas na ordem inversa:");
        for (int i = notas.size() - 1; i >= 0; i--) {
            System.out.println(notas.get(i));
        }

        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }

        double media = (qtdNotas > 0) ? soma / qtdNotas : 0;
        System.out.printf("Soma das notas: %.2f%n", soma);
        System.out.printf("Media das notas: %.2f%n", media);

        int acimaMedia = 0, abaixoSete = 0;
        for (double nota : notas) {
            if (nota > media) acimaMedia++;
            if (nota < 7) abaixoSete++;
        }

        System.out.println("Notas acima da media: " + acimaMedia);
        System.out.println("Notas abaixo de 7: " + abaixoSete);
        System.out.println("Fim do programa.");
        scanner.close();
    }
}


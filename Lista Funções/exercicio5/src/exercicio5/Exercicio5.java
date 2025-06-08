
package exercicio5;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o custo do item: R$ ");
        double custo = scanner.nextDouble();
        System.out.print("Digite a taxa de imposto (%): ");
        double taxa = scanner.nextDouble();

        double custoComImposto = somaImposto(taxa, custo);
        System.out.printf("Custo com imposto: R$ %.2f%n", custoComImposto);
        scanner.close();
    }

    public static double somaImposto(double taxaImposto, double custo) {
        return custo + (custo * taxaImposto / 100);
    }
}


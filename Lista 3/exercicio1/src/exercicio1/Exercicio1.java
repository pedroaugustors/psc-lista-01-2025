
package exercicio1;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        double a = scanner.nextDouble();

        System.out.print("Digite o segundo numero: ");
        double b = scanner.nextDouble();

        System.out.print("Digite o terceiro numero: ");
        double c = scanner.nextDouble();

        double maior = Math.max(a, Math.max(b, c));
        double menor = Math.min(a, Math.min(b, c));
        double media = (a + b + c) / 3;

        System.out.println("Maior numero: " + maior);
        System.out.println("Menor numero: " + menor);
        System.out.println("Media: " + media);

        scanner.close();
    }
}

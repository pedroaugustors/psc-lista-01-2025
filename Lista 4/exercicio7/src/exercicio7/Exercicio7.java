
package exercicio7;
import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maior = Integer.MIN_VALUE;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o numero " + i + ": ");
            int numero = scanner.nextInt();
            if (numero > maior) {
                maior = numero;
            }
        }

        System.out.println("O maior numero e: " + maior);
        scanner.close();
    }
}


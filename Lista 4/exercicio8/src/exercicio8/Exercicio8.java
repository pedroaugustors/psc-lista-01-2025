
package exercicio8;
import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o numero " + i + ": ");
            int numero = scanner.nextInt();
            soma += numero;
        }

        double media = soma / 5.0;
        System.out.println("Soma: " + soma);
        System.out.println("Media: " + media);

        scanner.close();
    }
}



package exercicio6;
import java.util.Scanner;
import java.util.Random;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Digite o primeiro numero inteiro: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo numero inteiro: ");
        int num2 = scanner.nextInt();

        int menor = Math.min(num1, num2);
        int maior = Math.max(num1, num2);

        int sorteado = rand.nextInt(maior - menor + 1) + menor;

        System.out.println("Numero sorteado: " + sorteado);

        if (sorteado % 2 == 0) {
            System.out.println("O numero e par.");
        } else {
            System.out.println("O numero e impar.");
        }

        scanner.close();
    }
}
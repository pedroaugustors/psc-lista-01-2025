
package exercicio10;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo numero: ");
        int num2 = scanner.nextInt();

        int menor = Math.min(num1, num2);
        int maior = Math.max(num1, num2);

        System.out.println("Numeros entre " + menor + " e " + maior + ":");
        for (int i = menor + 1; i < maior; i++) {
            System.out.println(i);
        }

        scanner.close();
    }
}

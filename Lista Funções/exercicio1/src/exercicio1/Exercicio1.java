
package exercicio1;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um valor inteiro para n: ");
        int n = scanner.nextInt();
        imprimirNumerosRepetidos(n);
        scanner.close();
    }

    public static void imprimirNumerosRepetidos(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}



package exercicio3;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro numero: ");
        int a = scanner.nextInt();
        System.out.print("Digite o segundo numero: ");
        int b = scanner.nextInt();
        System.out.print("Digite o terceiro numero: ");
        int c = scanner.nextInt();

        int resultado = somaTres(a, b, c);
        System.out.println("Soma dos tres valores: " + resultado);
        scanner.close();
    }

    public static int somaTres(int x, int y, int z) {
        return x + y + z;
    }
}


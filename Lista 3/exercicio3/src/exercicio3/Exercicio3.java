
package exercicio3;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o coeficiente a: ");
        double a = scanner.nextDouble();
        System.out.print("Digite o coeficiente b: ");
        double b = scanner.nextDouble();
        System.out.print("Digite o coeficiente c: ");
        double c = scanner.nextDouble();

        if (a == 0 && b == 0 && c != 0) {
            System.out.println("Coeficientes informados incorretamente.");
        } else if (a == 0 && b != 0) {
            double raiz = -c / b;
            System.out.println("Essa e uma equação de primeiro grau.");
            System.out.println("Raiz: " + raiz);
        } else {
            double delta = b * b - 4 * a * c;

            if (delta < 0) {
                System.out.println("Esta equacao nao possui raizes reais.");
            } else if (delta == 0) {
                double raiz = -b / (2 * a);
                System.out.println("Esta equacao possui duas raizes reais iguais.");
                System.out.println("Raiz: " + raiz);
            } else {
                double r1 = (-b + Math.sqrt(delta)) / (2 * a);
                double r2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Esta equacao possui duas raizes reais diferentes.");
                System.out.println("Raiz 1: " + r1);
                System.out.println("Raiz 2: " + r2);
            }
        }

        scanner.close();
    }
}
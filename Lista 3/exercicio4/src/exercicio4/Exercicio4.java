
package exercicio4;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o codigo da operacao (1: perimetro, 2: area, 3: volume): ");
        int opcao = scanner.nextInt();

        System.out.print("Digite o valor do raio: ");
        double r = scanner.nextDouble();
        double pi = 3.141592;

        switch (opcao) {
            case 1:
                System.out.println("Perimetro do circulo: " + (2 * pi * r));
                break;
            case 2:
                System.out.println("Area do circulo: " + (pi * r * r));
                break;
            case 3:
                System.out.println("Volume da esfera: " + ((4.0 / 3) * pi * r * r * r));
                break;
            default:
                System.out.println("Codigo da operacao invalido.");
        }

        scanner.close();
    }
}

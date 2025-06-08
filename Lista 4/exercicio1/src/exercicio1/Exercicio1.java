
package exercicio1;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota;

        do {
            System.out.print("Digite uma nota entre 0 e 10: ");
            nota = scanner.nextDouble();

            if (nota < 0 || nota > 10) {
                System.out.println("Valor invalido. Tente novamente.");
            }
        } while (nota < 0 || nota > 10);

        System.out.println("Nota valida: " + nota);
        scanner.close();
    }
}


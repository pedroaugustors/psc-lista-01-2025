
package exercicio5;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char repetir;

        do {
            int anos = 0;
            int populacaoA, populacaoB;
            double taxaA, taxaB;

            do {
                System.out.print("Populacao do pais A: ");
                populacaoA = scanner.nextInt();
            } while (populacaoA <= 0);

            do {
                System.out.print("Populacao do pais B: ");
                populacaoB = scanner.nextInt();
            } while (populacaoB <= 0 || populacaoB <= populacaoA);

            do {
                System.out.print("Taxa de crescimento do pais A (%): ");
                taxaA = scanner.nextDouble();
            } while (taxaA <= 0);

            do {
                System.out.print("Taxa de crescimento do pais B (%): ");
                taxaB = scanner.nextDouble();
            } while (taxaB <= 0);

            while (populacaoA <= populacaoB) {
                populacaoA += populacaoA * taxaA / 100;
                populacaoB += populacaoB * taxaB / 100;
                anos++;
            }

            System.out.println("Levara " + anos + " anos para A ultrapassar B.");

            System.out.print("Deseja repetir? (s/n): ");
            repetir = scanner.next().toLowerCase().charAt(0);
        } while (repetir == 's');

        scanner.close();
    }
}

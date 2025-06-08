
package exercicio5;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Alemanha
        System.out.print("Digite o valor da viagem para a Alemanha: ");
        double precoAlemanha = scanner.nextDouble();
        System.out.print("Quantas pessoas irao para a Alemanha? ");
        int pessoasAlemanha = scanner.nextInt();

        // Portugal
        System.out.print("Digite o valor da viagem para Portugal: ");
        double precoPortugal = scanner.nextDouble();
        System.out.print("Quantas pessoas irao para Portugal? ");
        int pessoasPortugal = scanner.nextInt();

        // Itália
        System.out.print("Digite o valor da viagem para a Italia: ");
        double precoItalia = scanner.nextDouble();
        System.out.print("Quantas pessoas irao para a Italia? ");
        int pessoasItalia = scanner.nextInt();

        // Cálculo total
        double total = (precoAlemanha * pessoasAlemanha) +
                       (precoPortugal * pessoasPortugal) +
                       (precoItalia * pessoasItalia);

        int totalPessoas = pessoasAlemanha + pessoasPortugal + pessoasItalia;

        System.out.printf("\nValor total da viagem: %.2f%n", total);
        System.out.println("Total de pessoas viajando: " + totalPessoas);

        scanner.close();
    }
}

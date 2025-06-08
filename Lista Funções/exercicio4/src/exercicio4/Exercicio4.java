
package exercicio4;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int numero = scanner.nextInt();

        char resultado = verificarPositivoNegativo(numero);
        System.out.println("Resultado: " + resultado);
        scanner.close();
    }

    public static char verificarPositivoNegativo(int numero) {
        return (numero > 0) ? 'P' : 'N';
    }
}

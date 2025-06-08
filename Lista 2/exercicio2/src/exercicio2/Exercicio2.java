
package exercicio2;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o primeiro numero: ");
        double num1 = scanner.nextDouble();
        
        System.out.println("Digite o segundo numero: ");
        double num2 = scanner.nextDouble();
        
        System.out.println("Soma: " + (num1 + num2));
        System.out.println("Subtracao: " + (num1 - num2));
        System.out.println("Multiplicacao: " + (num1 * num2));
        
        scanner.close();
    }
}

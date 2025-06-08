
package exercicio3;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double somaNotas = 0;
        
        for (int i = 1; i <= 4; i++) {
            System.out.println("Digite a " + i + " nota: ");
            somaNotas += scanner.nextDouble();
        }
        
        double media = somaNotas / 4;
        System.out.println("A media das notas e: " + media);
        
        scanner.close();
    }
}
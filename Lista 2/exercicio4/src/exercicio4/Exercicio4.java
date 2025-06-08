
package exercicio4;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o preco do litro da gasolina: ");
        double precoLitro = scanner.nextDouble();
        
        System.out.println("Digite a quantidade de litros vendidos: ");
        double litros = scanner.nextDouble();
        
        double total = precoLitro * litros;
        
        System.out.printf("O valor total a pagar e: R$ %.2f%n", total);
        
        scanner.close();
    }
}

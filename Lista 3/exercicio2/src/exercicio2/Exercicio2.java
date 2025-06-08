
package exercicio2;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Valor da compra: R$ ");
        int compra = scanner.nextInt();

        System.out.print("Valor pago: R$ ");
        int pago = scanner.nextInt();

        if (pago < compra) {
            System.out.println("Quantia paga e insuficiente para realizar a compra.");
        } else {
            int troco = pago - compra;
            System.out.println("Troco: R$ " + troco);

            int[] notas = {50, 20, 10, 5, 2, 1};
            for (int nota : notas) {
                int quantidade = troco / nota;
                troco %= nota;
                System.out.println("Notas de R$ " + nota + ",00: " + quantidade);
            }
        }

        scanner.close();
    }
}

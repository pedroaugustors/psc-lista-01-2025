
package exercicio6;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char repetir;

        do {
            System.out.print("Digite a hora (0-23): ");
            int hora = scanner.nextInt();
            System.out.print("Digite os minutos (0-59): ");
            int minutos = scanner.nextInt();

            char periodo;
            int hora12 = converterHora(hora);

            if (hora < 12) {
                periodo = 'A'; // AM
            } else {
                periodo = 'P'; // PM
            }

            exibirHora(hora12, minutos, periodo);

            System.out.print("Deseja converter outro horario? (s/n): ");
            repetir = scanner.next().toLowerCase().charAt(0);
        } while (repetir == 's');

        scanner.close();
    }

    public static int converterHora(int hora24) {
        if (hora24 == 0) return 12;
        else if (hora24 > 12) return hora24 - 12;
        else return hora24;
    }

    public static void exibirHora(int hora, int minutos, char periodo) {
        String amPm = (periodo == 'A') ? "A.M." : "P.M.";
        System.out.printf("Hora convertida: %02d:%02d %s%n", hora, minutos, amPm);
    }
}



package exercicio3;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome, sexo, estadoCivil;
        int idade;
        double salario;

        do {
            System.out.print("Nome (mais de 3 caracteres): ");
            nome = scanner.nextLine();
        } while (nome.length() <= 3);

        do {
            System.out.print("Idade (entre 0 e 150): ");
            idade = scanner.nextInt();
        } while (idade < 0 || idade > 150);

        do {
            System.out.print("Salario (maior que 0): ");
            salario = scanner.nextDouble();
        } while (salario <= 0);

        scanner.nextLine(); // Limpar buffer
        do {
            System.out.print("Sexo (f/m): ");
            sexo = scanner.nextLine().toLowerCase();
        } while (!sexo.equals("f") && !sexo.equals("m"));

        do {
            System.out.print("Estado civil (s/c/v/d): ");
            estadoCivil = scanner.nextLine().toLowerCase();
        } while (!estadoCivil.matches("[scvd]"));

        System.out.println("Informacoes validas registradas!");
        scanner.close();
    }
}


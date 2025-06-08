
package exercicio2;
import java.util.*;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] perguntas = {
            "Telefonou para a vitima?",
            "Esteve no local do crime?",
            "Mora perto da vitima?",
            "Devia para a vitima?",
            "Ja trabalhou com a vitima?"
        };

        int respostasPositivas = 0;

        for (String pergunta : perguntas) {
            System.out.print(pergunta + " (s/n): ");
            String resposta = scanner.next().toLowerCase();
            if (resposta.equals("s")) {
                respostasPositivas++;
            }
        }

        String classificacao;
        if (respostasPositivas == 2) {
            classificacao = "Suspeita";
        } else if (respostasPositivas >= 3 && respostasPositivas <= 4) {
            classificacao = "Cumplice";
        } else if (respostasPositivas == 5) {
            classificacao = "Assassino";
        } else {
            classificacao = "Inocente";
        }

        System.out.println("Classificacao: " + classificacao);
        scanner.close();
    }
}

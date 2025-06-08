
package exercicio4;
public class Exercicio4 {
    public static void main(String[] args) {
        int populacaoA = 80000;
        int populacaoB = 200000;
        int anos = 0;

        while (populacaoA <= populacaoB) {
            populacaoA *= 1.03;
            populacaoB *= 1.015;
            anos++;
        }

        System.out.println("Levara " + anos + " anos para A ultrapassar B.");
    }
}

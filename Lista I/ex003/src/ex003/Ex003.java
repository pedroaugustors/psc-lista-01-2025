
package ex003;
import java.util.Scanner;

public class Ex003 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String nome;
        int idade;
        double altura;
        
        System.out.println("Digite seu nome: ");
        nome = sc.nextLine();
        System.out.println("Digite sua idade: ");
        idade = sc.nextInt();
        System.out.println("Digite sua altura: ");
        altura = sc.nextDouble();
        
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Altura: " + altura + " m");
        
        
       
    }
    
}


package main;
import java.util.Scanner;



class Bola {
    private String cor;
    private double circunferencia;
    private String material;

    public Bola(String cor, double circunferencia, String material) {
        this.cor = cor;
        this.circunferencia = circunferencia;
        this.material = material;
    }

    public void trocarCor(String novaCor) {
        this.cor = novaCor;
    }

    public String mostraCor() {
        return cor;
    }
}

class Quadrado {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public void mudarLado(double novoLado) {
        this.lado = novoLado;
    }

    public double getLado() {
        return lado;
    }

    public double calcularArea() {
        return lado * lado;
    }
}

class Retangulo {
    private double ladoA;
    private double ladoB;

    public Retangulo(double ladoA, double ladoB) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }

    public void mudarLados(double novoLadoA, double novoLadoB) {
        this.ladoA = novoLadoA;
        this.ladoB = novoLadoB;
    }

    public double getLadoA() {
        return ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public double calcularArea() {
        return ladoA * ladoB;
    }

    public double calcularPerimetro() {
        return 2 * (ladoA + ladoB);
    }
}

class Pessoa {
    private String nome;
    private int idade;
    private double peso;
    private double altura;

    public Pessoa(String nome, int idade, double peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    public void envelhecer() {
        idade++;
        if (idade < 21) {
            altura += 0.5;
        }
    }

    public void engordar(double quilos) {
        peso += quilos;
    }

    public void emagrecer(double quilos) {
        peso -= quilos;
    }

    public void crescer(double cm) {
        altura += cm;
    }

    public void mostrar() {
        System.out.printf("Nome: %s | Idade: %d | Peso: %.2f kg | Altura: %.2f m%n", nome, idade, peso, altura);
    }
}

class ContaCorrente {
    private String numeroConta;
    private String nomeCorrentista;
    private double saldo;

    public ContaCorrente(String numeroConta, String nomeCorrentista) {
        this.numeroConta = numeroConta;
        this.nomeCorrentista = nomeCorrentista;
        this.saldo = 0;
    }

    public void alterarNome(String novoNome) {
        this.nomeCorrentista = novoNome;
    }

    public void deposito(double valor) {
        saldo += valor;
    }

    public void saque(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void mostrarConta() {
        System.out.printf("Conta: %s | Nome: %s | Saldo: R$ %.2f%n", numeroConta, nomeCorrentista, saldo);
    }
}

// ====================== MAIN ======================

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- MENU PRINCIPAL ---");
            System.out.println("1. Bola");
            System.out.println("2. Quadrado");
            System.out.println("3. Retangulo (Calculo de Piso/Rodape)");
            System.out.println("4. Pessoa");
            System.out.println("5. Conta Corrente");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opcao: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    scanner.nextLine(); // consumir \n
                    System.out.print("Cor da bola: ");
                    String cor = scanner.nextLine();
                    System.out.print("Circunferencia: ");
                    double circ = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Material: ");
                    String mat = scanner.nextLine();
                    Bola bola = new Bola(cor, circ, mat);
                    System.out.println("Cor atual: " + bola.mostraCor());
                    System.out.print("Nova cor: ");
                    String novaCor = scanner.nextLine();
                    bola.trocarCor(novaCor);
                    System.out.println("Cor alterada para: " + bola.mostraCor());
                    break;

                case 2:
                    System.out.print("Digite o lado do quadrado: ");
                    double lado = scanner.nextDouble();
                    Quadrado quad = new Quadrado(lado);
                    System.out.println("Área: " + quad.calcularArea());
                    break;

                case 3:
                    System.out.print("Comprimento do local (m): ");
                    double comp = scanner.nextDouble();
                    System.out.print("Largura do local (m): ");
                    double larg = scanner.nextDouble();
                    Retangulo ret = new Retangulo(comp, larg);
                    System.out.printf("Area: %.2f m²%n", ret.calcularArea());
                    System.out.printf("Perimetro: %.2f m%n", ret.calcularPerimetro());
                    break;

                case 4:
                    scanner.nextLine(); // limpar buffer
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Idade: ");
                    int idade = scanner.nextInt();
                    System.out.print("Peso (kg): ");
                    double peso = scanner.nextDouble();
                    System.out.print("Altura (m): ");
                    double altura = scanner.nextDouble();
                    Pessoa pessoa = new Pessoa(nome, idade, peso, altura);
                    pessoa.envelhecer();
                    pessoa.engordar(2);
                    pessoa.emagrecer(1);
                    pessoa.crescer(1);
                    pessoa.mostrar();
                    break;

                case 5:
                    scanner.nextLine();
                    System.out.print("Numero da conta: ");
                    String numConta = scanner.nextLine();
                    System.out.print("Nome do correntista: ");
                    String nomeConta = scanner.nextLine();
                    ContaCorrente conta = new ContaCorrente(numConta, nomeConta);
                    System.out.print("Valor para deposito: ");
                    double dep = scanner.nextDouble();
                    conta.deposito(dep);
                    System.out.print("Valor para saque: ");
                    double saque = scanner.nextDouble();
                    conta.saque(saque);
                    conta.mostrarConta();
                    break;

                case 0:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opcao inválida!");
            }

        } while (opcao != 0);

        scanner.close();
    }
}

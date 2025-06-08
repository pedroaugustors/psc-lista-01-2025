/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio1;

public class Exercicio1 {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Joao", 30, "111.222.333-44", "joao@email.com");
        p.falar(); p.andar();

        Animal a = new Animal("Cachorro", 4, 12.5, "Branco");
        a.emitirSom(); a.correr();

        Carro carro = new Carro("Honda", "Civic", "Preto", "XYZ-9876");
        carro.ligar(); carro.buzinar();

        Celular cel = new Celular("Apple", "iPhone 13", "iOS", 6.1);
        cel.tocarMusica(); cel.tirarFoto();

        Livro livro = new Livro("1984", "George Orwell", 328, "Ficção");
        livro.ler(); livro.fechar();

        Computador pc = new Computador("Ryzen 5", 16, 1000, "Linux");
        pc.processarDados();

        Cadeira cadeira = new Cadeira("Plástico", "Azul", 1.2, "Giratória");
        cadeira.girar(); cadeira.reclinar();

        Relogio relogio = new Relogio("Casio", "Digital", "Preto", "Médio");
        relogio.cronometrar();

        Televisao tv = new Televisao(55, "Samsung", "4K", "LED");
        tv.ligar(); tv.mudarCanal();

        Bicicleta bike = new Bicicleta("Vermelha", 18, 29, "Disco");
        bike.pedalar(); bike.frear();
    }
}
class Pessoa {
    String nome;
    int idade;
    String cpf;
    String email;

    public Pessoa(String nome, int idade, String cpf, String email) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.email = email;
    }

    public void andar() { System.out.println(nome + " esta andando."); }
    public void comer() { System.out.println(nome + " esta comendo."); }
    public void dormir() { System.out.println(nome + " esta dormindo."); }
    public void falar() { System.out.println(nome + " esta falando."); }
}

class Animal {
    String especie;
    int idade;
    double peso;
    String cor;

    public Animal(String especie, int idade, double peso, String cor) {
        this.especie = especie;
        this.idade = idade;
        this.peso = peso;
        this.cor = cor;
    }

    public void correr() { System.out.println("O " + especie + " esta correndo."); }
    public void comer() { System.out.println("O " + especie + " esta comendo."); }
    public void dormir() { System.out.println("O " + especie + " esta dormindo."); }
    public void emitirSom() { System.out.println("O " + especie + " emite um som."); }
}

class Carro {
    String marca;
    String modelo;
    String cor;
    String placa;

    public Carro(String marca, String modelo, String cor, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.placa = placa;
    }

    public void acelerar() { System.out.println("O carro " + modelo + " esta acelerando."); }
    public void frear() { System.out.println("O carro " + modelo + " esta freando."); }
    public void ligar() { System.out.println("O carro " + modelo + " esta ligado."); }
    public void buzinar() { System.out.println("Buzina do " + modelo + ": Biiip!"); }
}

class Celular {
    String marca;
    String modelo;
    String sistemaOperacional;
    double tamanhoTela;

    public Celular(String marca, String modelo, String sistemaOperacional, double tamanhoTela) {
        this.marca = marca;
        this.modelo = modelo;
        this.sistemaOperacional = sistemaOperacional;
        this.tamanhoTela = tamanhoTela;
    }

    public void ligar() { System.out.println("O celular " + modelo + " está ligando."); }
    public void enviarMensagem() { System.out.println("Mensagem enviada pelo " + modelo + "."); }
    public void tocarMusica() { System.out.println("O celular " + modelo + " está tocando música."); }
    public void tirarFoto() { System.out.println("Foto tirada com o " + modelo + "."); }
}

class Livro {
    String titulo;
    String autor;
    int numeroPaginas;
    String genero;

    public Livro(String titulo, String autor, int numeroPaginas, String genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.genero = genero;
    }

    public void ler() { System.out.println("Lendo o livro \"" + titulo + "\"."); }
    public void abrir() { System.out.println("Livro \"" + titulo + "\" aberto."); }
    public void fechar() { System.out.println("Livro \"" + titulo + "\" fechado."); }
    public void emprestar() { System.out.println("Livro \"" + titulo + "\" foi emprestado."); }
}

class Computador {
    String processador;
    int memoriaRAM;
    int hd;
    String sistemaOperacional;

    public Computador(String processador, int memoriaRAM, int hd, String sistemaOperacional) {
        this.processador = processador;
        this.memoriaRAM = memoriaRAM;
        this.hd = hd;
        this.sistemaOperacional = sistemaOperacional;
    }

    public void ligar() { System.out.println("Computador ligado."); }
    public void desligar() { System.out.println("Computador desligado."); }
    public void processarDados() { System.out.println("Processando dados..."); }
    public void exibirImagem() { System.out.println("Exibindo imagem no monitor."); }
}

class Cadeira {
    String material;
    String cor;
    double altura;
    String tipo;

    public Cadeira(String material, String cor, double altura, String tipo) {
        this.material = material;
        this.cor = cor;
        this.altura = altura;
        this.tipo = tipo;
    }

    public void sustentarPeso() { System.out.println("A cadeira esta sustentando peso."); }
    public void girar() { System.out.println("A cadeira esta girando."); }
    public void deslizar() { System.out.println("A cadeira esta deslizando."); }
    public void reclinar() { System.out.println("A cadeira esta reclinando."); }
}

class Relogio {
    String marca;
    String tipo;
    String cor;
    String tamanho;

    public Relogio(String marca, String tipo, String cor, String tamanho) {
        this.marca = marca;
        this.tipo = tipo;
        this.cor = cor;
        this.tamanho = tamanho;
    }

    public void marcarHora() { System.out.println("Marcando hora..."); }
    public void despertar() { System.out.println("Despertador acionado!"); }
    public void cronometrar() { System.out.println("Cronometro ligado."); }
    public void vibrar() { System.out.println("Relógio vibrando."); }
}

class Televisao {
    int tamanho;
    String marca;
    String resolucao;
    String tipoTela;

    public Televisao(int tamanho, String marca, String resolucao, String tipoTela) {
        this.tamanho = tamanho;
        this.marca = marca;
        this.resolucao = resolucao;
        this.tipoTela = tipoTela;
    }

    public void ligar() { System.out.println("TV ligada."); }
    public void desligar() { System.out.println("TV desligada."); }
    public void mudarCanal() { System.out.println("Canal alterado."); }
    public void ajustarVolume() { System.out.println("Volume ajustado."); }
}

class Bicicleta {
    String cor;
    int marchas;
    int aro;
    String tipoFreio;

    public Bicicleta(String cor, int marchas, int aro, String tipoFreio) {
        this.cor = cor;
        this.marchas = marchas;
        this.aro = aro;
        this.tipoFreio = tipoFreio;
    }

    public void pedalar() { System.out.println("Pedalando..."); }
    public void frear() { System.out.println("Freando a bicicleta."); }
    public void virar() { System.out.println("Virando a direita/esquerda."); }
    public void parar() { System.out.println("Bicicleta parada."); }
}

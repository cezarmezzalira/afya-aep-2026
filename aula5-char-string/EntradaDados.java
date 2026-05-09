// EntradaDados.java

import java.util.Scanner;

void main() {
    // Seu código mora aqui...
    // 3 passos básicos de um programa de computador

    // ENTRADA
    // Cria um leitor de dados do teclado
    Scanner teclado = new Scanner(System.in);

    System.out.print("Informe seu nome: ");
    String nome = teclado.nextLine();

    // F - Física ou J - Jurídica
    System.out.print("Informe o tipo de pessoa (F ou J): ");
    char tipoPessoa = teclado.next().charAt(0);

    System.out.print("Informe sua idade: ");
    int idade = teclado.nextInt();

    teclado.nextLine();

    String endereco = teclado.nextLine();

    System.out.print("Informe seu peso: ");
    double peso = teclado.nextDouble();

    // PROCESSAMENTO
    String nomeEmMaisculo = nome.toUpperCase();

    // SAÍDA
    System.out.print("Nome: ");
    System.out.println(nomeEmMaisculo);
    System.out.println(tipoPessoa);
    System.out.println(idade);
    System.out.println(endereco);
    System.out.println(peso);
    // Seu nome é (nome). Você tem (idade) anos.
    // Você mora no endereço (endereco).
    System.out.println("Seu nome é " + nome + ". Você tem " + idade + " anos.");
    System.out.println("Você mora no endereço " + endereco);

    System.out.printf("\"Seu nome é %s.\" \nVocê tem %d anos.\n", nome, idade);
    System.out.printf("\tVocê mora no endereço %s", endereco);
    System.out.printf("\nSeu peso é %f", peso);
}
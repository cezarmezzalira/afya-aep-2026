//1- Faça um programa que simule um jogo de adivinhação. 
// O programa deve gerar um número 
// aleatório entre 1 e 100, e pedir para o 
// usuário tentar adivinhar o número. 
// A cada tentativa do usuário, o programa 
// deve informar se o número a ser adivinhado 
// é maior ou menor do que o 
// número informado pelo usuário. 
// O jogo termina quando o usuário acerta o número. 

import java.util.Scanner;

void main() {

    Scanner teclado = new Scanner(System.in);

    boolean acertou = false;

    int min = 1;
    int max = 100;
    int numero = (int) (Math.random() * (max - min + 1) + min);

    while (!acertou) {
        System.out.println("Informe um número");
        int aposta = teclado.nextInt();

        if (aposta < numero) {
            System.out.println("Errou! É um número maior.");
        } else if (aposta > numero) {
            System.out.println("Errou! É um número menor.");
        } else {
            acertou = true;
        }
    }

    System.out.println("Parabéns! Você acertou!");
    teclado.close();
}
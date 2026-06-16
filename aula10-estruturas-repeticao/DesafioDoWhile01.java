// DesafioDoWhile01.java

// Crie um programa que exiba
// um menu de opções na tela e
// só pare de ser exibido quando
// o usuário digitar a opção de saída.

// 1. Imprima um menu: [1] Saldo, [2]
// Saque, [3] Depósito, [0] Sair.
// 2. Leia a opção do usuário.
// 3. Se a opção for 1, 2 ou 3, imprima
// 'Processando...' e repita o
// menu.
// 4. O laço deve obrigatoriamente
// utilizar a estrutura do-while com
// a condição sendo opсао != 0.

import java.util.Scanner;

void main() {

    // ENTRADA
    Scanner teclado = new Scanner(System.in);

    int opcao = 0;

    String menu = "[:::: MENU - CAIXA ELETRÔNICO ::::]\n[1] Saldo\n[2] Saque\n[3] Depósito\n[0] Sair";

    // PROCESSAMENTO
    do {
        System.out.println(menu);
        opcao = teclado.nextInt();
        if (opcao == 1 || opcao == 2 || opcao == 3) {
            System.out.println("Processando...");
        }
    } while (opcao != 0);

    // SAÍDA

    System.out.println("Obrigado por usar os nossos serviços!");
    teclado.close();
}
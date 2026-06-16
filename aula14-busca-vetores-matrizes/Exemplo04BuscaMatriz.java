/*
Exemplo 3 (Busca Linear em Matriz): 
A aplicação do algoritmo de busca sequencial 
para procurar um valor específico fornecido 
pelo usuário e retornar em qual posição exata 
(índice da linha e da coluna) ele foi encontrado.

*/

import java.util.Scanner;

void main() {
    Scanner teclado = new Scanner(System.in);

    System.out.println("Informe o número que deseja encontrar");
    int numero = teclado.nextInt();

    int[][] numeros = {
            { 2, 10, 45, 32 },
            { 22, 13, 17, 55 },
            { 40, 1, 9, 50 }
    };

    boolean encontrou = false;
    // 1º for - lê linha a linha
    for (int i = 0; i < 3; i++) {
        if (encontrou) {
            break;
        }
        // 2º for - lê coluna a coluna
        for (int j = 0; j < 4; j++) {
            if (encontrou) {
                break;
            }
            if (numeros[i][j] == numero) {
                System.out.println("Número " + numero +
                        " Encontrado na linha " + i +
                        " Coluna " + j);
                encontrou = true;
            }
            System.out.println(j);
        }
        System.out.println(i);
    }

    teclado.close();

}
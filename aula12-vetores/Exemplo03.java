import java.util.Scanner;

// Crie um vetor de números inteiros
// com 3 posições e use o Scanner para
// atribuir o valor para cada posição

void main() {

    // ENTRADA
    Scanner teclado = new Scanner(System.in);

    int[] numeros = new int[3];

    System.out.println("Informe um valor");
    numeros[0] = teclado.nextInt();

    System.out.println("Informe o segundo valor");
    numeros[1] = teclado.nextInt();

    System.out.println("Informe o terceiro valor");
    numeros[2] = teclado.nextInt();

    // PROCESSAMENTO

    // SAÍDA
    System.out.println(numeros[0]);
    System.out.println(numeros[1]);
    System.out.println(numeros[2]);

    teclado.close();
}
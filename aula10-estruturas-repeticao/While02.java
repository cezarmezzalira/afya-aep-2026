// Elaborar um programa que efetue a 
// entrada de um valor numérico inteiro qualquer. 
// Em seguida, processar o cálculo 
// do valor de entrada, multiplicando-o 
// por 3 e apresentando seu resultado. 
// Proceder à execução dos passos 
// anteriores cinco vezes.

import java.util.Scanner;

void main() {
    Scanner teclado = new Scanner(System.in);

    // variável de controle
    int i = 1;
    int multiplicador = 3;

    while (i <= 5) {
        System.out.println("Informe um número: ");
        int numero = teclado.nextInt();
        int resultado = numero * multiplicador;
        System.out
                .printf("%d X %d = %d\n",
                        numero,
                        multiplicador,
                        resultado);
        // incrementar a variável
        i = i + 1;
    }

    teclado.close();
}
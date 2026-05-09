// Revisao02.java

import java.util.Scanner;

void main() {
    /*
     * Cenário: O Java precisa calcular a área
     * de um círculo baseando-se no raio.
     * Desafio: Crie uma constante
     * final double PI = 3.14159; .
     * Peça ao usuário para
     * digitar o valor do raio (double) usando o Scanner.
     * Calcule a área usando a fórmula PI * (raio * raio).
     * Imprima o resultado.
     * Objetivo: Trabalhar com cálculos que misturam
     * variáveis dinâmicas lidas pelo teclado e constantes
     * declaradas no código, consolidando a
     * diferença de comportamento de ambas .
     */

    // ENTRADA
    // criar uma constante do tipo double chamada PI
    // com o valor 3.141592
    final double PI = 3.141592;

    // solicitar do usuário o valor do raio e armazenar
    // em uma variável do tipo double
    Scanner teclado = new Scanner(System.in);
    System.out.print("Informe o raio do círculo: ");
    double raio = teclado.nextDouble();

    // PROCESSAMENTO
    // calcular a área do círculo usando a fórmula:
    // area = PI * (raio * raio)
    double area = PI * (raio * raio);

    // SAÍDA
    // imprimir a área do círculo
    System.out.println("A área do círculo é: " + area);

    // Desconecte do recurso de entrada de dados
    teclado.close();
}
// Revisao04.java

import java.util.Scanner;

void main() {
    /*
     * Cenário: Um terminal de vendas de loja de eletrônicos.
     * Desafio: Peça ao usuário: O nome do produto (String),
     * a quantidade comprada (int) e o valor unitário (double).
     * Calcule o total (quantidade multiplicada pelo valor).
     * Exiba um recibo utilizando o printf :
     * "Recibo: [Quantidade] x [Produto] - Total: R$ [Total]"
     * Objetivo: Misturar tipos de dados diferentes no mesmo
     * cálculo (um int multiplicando um double) e
     * usar múltiplas máscaras no printf
     * (%d para quantidade, %s para o nome, %.2f para o total) .
     */
    // ENTRADA
    Scanner teclado = new Scanner(System.in);

    // Criei as variáveis, porém não inicializei
    // As variáveis tem o valor nulo
    String nomeProduto;
    int quantidadeComprada;
    double valorUnitario;

    // variável nome produto do tipo string
    System.out.println("Informe o nome do produto: ");
    nomeProduto = teclado.next();
    // variável quantidade comprada do tipo int
    System.out.println("Informe a quantidade comprada: ");
    quantidadeComprada = teclado.nextInt();
    // variável valor unitário do tipo double
    System.out.println("Informe o valor unitário: ");
    valorUnitario = teclado.nextDouble();

    // PROCESSAMENTO
    // variável valor total = quantidade * valor unitário
    double valorTotal = quantidadeComprada * valorUnitario;

    // SAÍDA
    // com printf "Recibo: [Produto] \n [Quantidade] x [Valor Unitário] = Total: R$
    // [Total]"
    System.out.printf("Recibo: %s \n %d x %.2f = Total: R$ %.2f\n",
            nomeProduto,
            quantidadeComprada,
            valorUnitario,
            valorTotal);
    teclado.close();
}
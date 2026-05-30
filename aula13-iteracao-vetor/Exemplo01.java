// aula13-iteracao-vetor
// Exemplo01.java
void main() {
    // Some os valores dos itens que estão
    // dentro do vetor do carrinho

    double[] carrinho = { 12.50, 45.00, 9.90, 30.00, 25.00 };
    double somaTotal = 0;

    for (int i = 0; i < carrinho.length; i++) {
        somaTotal = somaTotal + carrinho[i];
    }

    System.out.printf("O valor total dos itens do carrinho é: R$ %.2f", somaTotal);

}
void main() {
    Scanner teclado = new Scanner(System.in);

    System.out.print("Digite o valor da compra: R$ ");
    double valor = teclado.nextDouble();

    // Aplicando a regra de negócio (Seleção Composta)
    if (valor >= 100.0) {
        double desconto = valor * 0.1;
        System.out.printf("Desconto aplicado! Valor final: R$ %.2f\n", (valor - desconto)); // [cite: 45]
    } else {
        System.out.printf("Valor abaixo do mínimo para desconto. Total: R$ %.2f\n", valor);
    }

    teclado.close();
}
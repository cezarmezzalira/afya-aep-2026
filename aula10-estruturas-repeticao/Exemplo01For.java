// Exemplo01For.java

void main() {
    double[] valores = { 10.0, 2.00, 25.00, 14.00 };

    // for (int i = 0; i < 4; i = i + 1) {

    // Imprimir item a item, somar a um total
    // e imprimir o total no final
    double total = 0;
    for (int i = 0; i < 4; i++) {
        System.out.println("Processando o item " + i
                + ": R$ " + valores[i]);
        total = total + valores[i];
    }

    System.out.println("Total dos Itens: R$ " + total);

}
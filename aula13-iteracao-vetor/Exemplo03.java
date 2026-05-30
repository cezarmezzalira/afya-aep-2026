void main() {
    // Transformação dos valores de uma lista
    int[] valores = { 2, 5, 8, 10 };

    // Imprimo os valores antes da modificação
    for (int i = 0; i < valores.length; i++) {
        System.out.println(valores[i]);
    }

    // Dobrar os valores dos itens da lista
    for (int i = 0; i < valores.length; i++) {
        valores[i] = valores[i] * 2;
    }

    // Imprimo os valores depois da modificação
    for (int i = 0; i < valores.length; i++) {
        System.out.println(valores[i]);
    }
}
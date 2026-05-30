// Usando um único for, percorra um vetor de 7 posiçÕes
// e jogue para a mesma posição de um segundo vetor
// com 7 posições o valor corrigido de cada parcela com
// acrescimo de 10% sobre o valor original

void main() {
    final int numeroParcelas = 7;
    double[] parcelas = new double[numeroParcelas];
    double[] parcelasAtualizadas = new double[numeroParcelas];

    // ENTRADA
    // Inicialização - Criando o vetor com os valores iniciais
    for (int i = 0; i < parcelas.length; i++) {
        parcelas[i] = 100.00;
    }

    // PROCESSAMENTO
    for (int i = 0; i < parcelas.length; i++) {
        // pegar o valor original
        // multiplicar por 10%
        // jogar para o vetor parcelasAtualizadas
        // o valor atual + o valor de acrescimo
        // na mesma posição do vetor parcelasAtualizadas

        double valorAcrescimo = (parcelas[i] / 100.0) * 10.0;
        double valorAtualizado = parcelas[i] + valorAcrescimo;
        parcelasAtualizadas[i] = valorAtualizado;
    }

    // SAÍDA
    for (int i = 0; i < parcelasAtualizadas.length; i++) {
        System.out
                .printf("Parcela [%d]: Valor original: R$ %.2f - Valor Atualizado: R$ %.2f \n",
                        i+1,
                        parcelas[i],
                        parcelasAtualizadas[i]);
    }

}
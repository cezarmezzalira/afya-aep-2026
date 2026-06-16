/*
Exemplo 4 (Buscando o Menor Valor): 
Um algoritmo prático varrendo toda a 
matriz para identificar e armazenar o valor 
mínimo contido nela, ótimo para mostrar 
como inicializar a variável de controle 
com a primeira posição da matriz.
*/

void main() {
    Scanner teclado = new Scanner(System.in);

    int[][] numeros = {
            { 2, 10, 45, 32 },
            { 22, 13, 17, 55 },
            { 40, 1, 9, 50 }
    };

    int menorValor = numeros[0][0];
    // 1º for - lê linha a linha
    for (int i = 0; i < 3; i++) {

        // 2º for - lê coluna a coluna
        for (int j = 0; j < 4; j++) {

            if (numeros[i][j] < menorValor) {
                menorValor = numeros[i][j];
            }

        }

    }

    System.out.println(menorValor);
    teclado.close();
}
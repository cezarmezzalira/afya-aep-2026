/*

Exemplo 2 (Somas e Iterações): Um código demonstrando 
como usar laços for aninhados 
(iterando por linhas e colunas) 
para preencher a matriz e 
calcular resultados (como a soma total ou médias por linha).
*/

void main() {
    int[][] pixels = {
            { 0, 255, 0 },
            { 0, 0, 255 },
            { 255, 0, 0 }
    };

    // Diminuir a intensidade da cor em 50%
    // quando uma das cored do pixel for maior que 0
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            if (pixels[i][j] > 0) {
                pixels[i][j] = pixels[i][j] / 2;
            }
            System.out.print(pixels[i][j] + " ");
        }
        System.out.println("");
    }
}
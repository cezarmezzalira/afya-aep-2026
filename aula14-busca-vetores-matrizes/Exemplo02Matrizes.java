/*
Exemplo 1 (Diagonal Principal): Um exemplo clássico mostrando 
como usar um laço simples para calcular a soma dos 
elementos que ficam na diagonal principal de uma matriz quadrada.

*/

void main() {

    int[][] matriz = {
            { 1, 2, 3 },
            { 4, 5, 6 },
            { 7, 8, 9 }
    };

    int total = 0;
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            if (i == j) {
                total += matriz[i][j];
            }
        }
    }

    System.out.println(total);
    
}
// DesafioFor01.java

void main() {
    // Elaborar um programa que calcule o fatorial de um número
    int produto = 1;
    for (int i = 1; i <= 17; i++) {
        int valorAtual = produto;
        produto = produto * i;
        System.out.println(i + " x " + valorAtual + " = " + produto);
    }
}
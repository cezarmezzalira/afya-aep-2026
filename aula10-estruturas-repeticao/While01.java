//While01.java

void main() {
    // imprimir uma frase 10x
    String frase = "Olá turma linda de Alg Prog";

    // variável de controle
    int vez = 1;

    // enquanto a condição for verdadeira,
    // repita o código
    while (vez < 10 || vez == 10) {
        System.out.println(frase + vez);
        vez = vez + 1;
    }
    System.out.println("Fim do programa.");
}
void main() {
    // double nota1 = 10;
    // double nota2 = 5;
    // double nota3 = 8;
    // double nota4 = 3;
    // double nota5 = 3;
    // double nota6 = 3;

    final int numeroDeNotas = 6;
    double[] notas = new double[numeroDeNotas];

    notas[0] = 10;
    notas[1] = 5;
    notas[2] = 8;
    notas[3] = 3;
    notas[4] = 3;
    notas[5] = 3;

    double somaNotas = 0;

    for (int i = 0; i < numeroDeNotas; i++) {

        // somaNotas = somaNotas + notas[i];
        somaNotas += notas[i];
    }

    double media = somaNotas / numeroDeNotas;

    System.out.printf("A sua média é: %.2f", media);

}
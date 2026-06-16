void main() {
    // ENTRADA
    int nota1 = 7;
    int nota2 = 8;
    // PROCESSAMENTO
    double media = (nota1 + nota2) / 2.0;
    /*
     * O erro estava acontecendo por causa dos tipos de dados utilizado, int é da
     * familia
     * dos inteiros o que resultava em um valor sempre redondo sem os numeros
     * decimais, agora
     * quando a gente põe 2.0 a gente força o resultado a ser com numero decimal,
     * por
     * isso o problema
     * do codigo era o 2, so precisava dele ser trancrito para decimal 2.0
     */
    // SAIDA
    System.out.println(media);
}
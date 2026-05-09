void main() {
    // Seguindo o plano de aula,
    // o aluno deve ler as notas N1 e N2 (máximo 50 cada).
    // Se a soma for 60 ou mais, está "Aprovado".
    // Se for menor, está em "Exame Final".

    // ENTRADA
    Scanner teclado = new Scanner(System.in);

    // N1
    System.out.println("Informe a nota N1");
    double n1 = teclado.nextDouble();
    teclado.next();

    // N2
    System.out.println("Informe a nota N2");
    double n2 = teclado.nextDouble();

    // PROCESSAMENTO + SAÍDA
    // se a n1 E a n2 forem menores que 50
    // então some os valores e
    // se resultado for maior OU igual a 60
    // imprima Aprovado, senão imprima Exame Final.
    // se alguma das notas for maior que 50
    // imprima, notas inválidas.

    if (n1 <= 50.0 && n2 <= 50.0) {
        double resultado = (n1 + n2);
        if (resultado >= 60.0) {
            System.out.println("Aprovado!");
        } else {
            System.out.println("Exame Final");
        }
    } else if (n1 > 50) {
        System.out.println("N1 é maior que 50!");
    } else if (n2 > 50) {
        System.out.println("N2 é maior do que 50!");
    }

    teclado.close();
}
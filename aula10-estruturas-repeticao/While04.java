void main() {
    Scanner teclado = new Scanner(System.in);

    // variável de controle
    int i = 1;
    int multiplicador = 3;

    while (!(i > 5)) {
        System.out.println("Informe um número: ");
        int numero = teclado.nextInt();
        int resultado = numero * multiplicador;
        System.out
                .printf("%d X %d = %d\n",
                        numero,
                        multiplicador,
                        resultado);
        // incrementar a variável
        i = i + 1;
    }

    teclado.close();
}
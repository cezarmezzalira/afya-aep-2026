void main() {
    Scanner teclado = new Scanner(System.in);

    final int multiplicador = 3;

    // variável de controle
    char continuar = 'S';

    // enquanto continuar não for diferente de 'S'
    while (!(continuar != 'S')) {
        System.out.print("Informe um número: ");
        int numero = teclado.nextInt();
        int resultado = numero * multiplicador;

        System.out.println(numero + " X " +
                multiplicador +
                " = " + resultado);

        System.out.print("Deseja continuar? (Sim/Não): ");
        String vaiContinuar = teclado.next();
        continuar = vaiContinuar.toUpperCase().charAt(0);
    }

    teclado.close();
}
// Elaborar um programa que efetue a entrada 
// de um valor numérico inteiro qualquer. 
// Em seguida, calcular o valor informado, 
// multiplicando-o por 3 e apresentando seu resultado. 
// Ao final da apresentação do resultado, o programa 
// deve perguntar ao usuário se ele deseja um novo cálculo.
// Se a resposta for sim, deve executar novamente 
// as instruções subordinadas ao bloco adjacente. 
// Se a resposta for diferente de sim, 
// o programa deve parar a execução.

void main() {
    Scanner teclado = new Scanner(System.in);

    final int multiplicador = 3;

    // variável de controle
    char continuar = 'S';

    while (continuar == 'S') {
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
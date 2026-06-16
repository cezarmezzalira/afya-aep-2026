import java.util.Scanner;

void main() {
    // Um desenvolvedor está criando um módulo de processamento financeiro
    // que deve ler as transações de um lote de tamanho desconhecido.
    // A regra de negócios estipula que a leitura deve ocorrer
    // até que o usuário digite o valor `-1`, o que indica o fim do lote.
    // Adicionalmente, caso o primeiro valor informado já seja `-1`,
    // nenhuma transação deve ser processada.

    Scanner teclado = new Scanner(System.in);

    System.out
            .println("Continuar lendo informações? (1 para continuar ou -1 para sair)");
    int continuar = teclado.nextInt();
    int total = 0;

    while (continuar > 0) {
        // Leitura das informações...
        teclado.nextLine();
        System.out.println("Informe um numero");
        total = total + teclado.nextInt();
        // Valida a continuação
        System.out.println("Continuar lendo informações? (1 para continuar ou -1 para sair)");
        continuar = teclado.nextInt();
    }

    System.out.println(total);
    teclado.close();

}
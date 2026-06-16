void main() {
    Scanner teclado = new Scanner(System.in);

    int opcao = 0;

    do {
        // Leitura das informações...
        // Valida a continuação
        System.out.println("Informe a opção desejada:"
                + "\n1-Saldo"
                + "\n2-Saque"
                + "\n3-Cadastro"
                + "\n0-SAIR");
        opcao = teclado.nextInt();

        // PROCESSAMENTO DE CADA OPÇÃO
        // if (opcao == 1){
        // System.out.println("Seu saldo é de: R$ 1000,00");
        // } else if (opcao == 2) {
        // System.out.println("Saque indisponível.");
        // } else if (opcao == 3) {
        // System.out.println("Dados do cliente");
        // } else {
        // System.out.println("Opção inválida");
        // }
        switch (opcao) {
            case 1:
                System.out.println("Seu saldo é de: R$ 1000,00");
                break;
            case 2:
                System.out.println("Saque indisponível.");
                break;
            case 3:
                System.out.println("Dados do cliente");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    } while (opcao != 0);

    System.out.println("Obrigado por usar nossos serviços!");
    teclado.close();
}
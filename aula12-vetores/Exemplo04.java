import java.util.Scanner;

void main() {
    String[] nomes = new String[5];
    int[] idades = new int[5];

    Scanner teclado = new Scanner(System.in);

    // primeiro cadastro
    System.out.println("Informe o nome");
    nomes[0] = teclado.nextLine();

    System.out.println("Informe a idade");
    idades[0] = teclado.nextInt();

    teclado.nextLine();

    // segundo cadastro
    System.out.println("Informe o nome");
    nomes[1] = teclado.nextLine();

    System.out.println("Informe a idade");
    idades[1] = teclado.nextInt();

    teclado.nextLine();

    // terceiro cadastro
    System.out.println("Informe o nome");
    nomes[2] = teclado.nextLine();

    System.out.println("Informe a idade");
    idades[2] = teclado.nextInt();

    teclado.nextLine();

    // quarto cadastro
    System.out.println("Informe o nome");
    nomes[3] = teclado.nextLine();

    System.out.println("Informe a idade");
    idades[3] = teclado.nextInt();

    teclado.nextLine();

    // quinto cadastro
    System.out.println("Informe o nome");
    nomes[4] = teclado.nextLine();

    System.out.println("Informe a idade");
    idades[4] = teclado.nextInt();

    System.out
            .printf("[ CRACHÁ: %s | Idade: %d ]",
                    nomes[0],
                    idades[0]);

    teclado.close();
}
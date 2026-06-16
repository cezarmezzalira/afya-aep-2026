import java.util.Scanner;

void main() {
    Scanner teclado = new Scanner(System.in);

    System.out.print("Informe um número: ");
    int numeroBusca = teclado.nextInt();

    int[] numeros = { 15, 42, 7, 89, 23, 10, 4, 99 };

    for (int i = 0; i < numeros.length; i++){

        if (numeros[i] == numeroBusca){
            System.out.println("Número existe no indice "+ i);
            break;
        }
        System.out.println(numeros[i]);
    }
}
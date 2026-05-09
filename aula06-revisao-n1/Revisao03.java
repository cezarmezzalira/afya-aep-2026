// Revisao03.java

import java.util.Scanner;

void main() {
    /*
     * Cenário: Você, como Desenvolvedor Líder,
     * tem um número de chamados de suporte (int)
     * e uma equipe de desenvolvedores (int).
     * Você quer dividir os chamados igualmente
     * e saber quantos vão sobrar para você.
     * Desafio: Peça para o usuário digitar a
     * quantidade de chamados e a quantidade
     * de devs na equipe.
     * Use a divisão inteira / para saber quantos
     * chamados cada dev recebe.
     * Use o operador de módulo %
     * para descobrir o resto (quantos chamados sobram) .
     * Imprima os dois resultados.
     * Objetivo: Mostrar a utilidade prática do
     * operador de módulo % além de
     * apenas verificar se um número é par ou ímpar .
     */

    // Cenário: 3 desenvolvedores e 17 chamados

    // ENTRADA
    Scanner teclado = new Scanner(System.in);

    // solicitar o número de desenvolvedores e guardar
    // numa variável do tipo int
    System.out.println("Informe o número de desenvolvedores: ");
    int numeroDevs = teclado.nextInt();

    // solicitar o número de chamados e guardar
    // numa variável do tipo int
    System.out.println("Informe o número de chamados: ");
    int numeroChamados = teclado.nextInt();

    // PROCESSAMENTO
    // calcular o número de chamados que cada
    // desenvolvedor irá receber e guardar
    // numa variável int
    int numeroChamadosPorDev = numeroChamados / numeroDevs;

    // os chamados que sobraram
    int numeroChamadosQueSobraram = numeroChamados % numeroDevs;

    // SAÍDA
    // Imprimir a quantidade de chamados por dev
    // Imprimir o número de chamados que sobraram

    System.out.println("Número de chamados por dev: "
            + numeroChamadosPorDev);
    System.out.println("Número de chamados que sobraram: "
            + numeroChamadosQueSobraram);
    teclado.close();
}
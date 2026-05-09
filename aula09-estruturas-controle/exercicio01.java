void main() {
    // Crie um programa que leia 
    // a velocidade de um carro. 
    // Se ultrapassar 80 km/h, exiba "Multado!". 
    // Caso contrário, exiba "Boa viagem!".

    // Crio o scanner para entrada dos dados
    Scanner teclado = new Scanner(System.in);

    // Imprime uma mensagem para o usuário
    System.out.println("Qual a sua velocidade?");
    
    // Obtem a informação do usuário
    int velocidade = teclado.nextInt();

    if (velocidade > 80) {
        System.out.println("🚨 MULTADO!");
    } else {
        System.out.println("Talis Berado!");
    }
    
    teclado.close();
}
// Pratica02IMC.java

void main() {
    // Calculo IMC
    // Fórmula: Peso / (Altura*Altura)
    // ENTRADA
    // Variáveis: peso e altura
    double peso = 109;
    double altura = 1.82;

    // PROCESSAMENTO
    // Variável: resultadoIMC = peso / (altura * altura)

    double resultadoImc = peso / (altura * altura);

    // SAÍDA
    // Mostrar o resultadoIMC
    System.out.println("Seu IMC é " + resultadoImc);
}
package calculadora;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        int a, b; // cria as variáveis

        // Abrir o fluxo de entrada através do teclado:
        Scanner scan = new Scanner(System.in);

        // Chamar a entrada das variáveis:
        System.out.println("Digite o primeiro valor:");
        a = scan.nextInt();
        System.out.println("Digite o segundo valor:");
        b = scan.nextInt();

        // Executar os Métodos:
        int soma = soma(a, b);
        int sub = sub(a, b);
        float mult = mult(a, b);
        float div = div(a, b);

        // Imprimindo os resultados dos métodos:
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + sub);
        System.out.println("Multiplicação: " + mult);
        System.out.println("Divisão: " + div);
    }
    // Métodos:
    public static  int soma(int a, int b) {
        return a + b;
    }

    public static  int sub(int a, int b) {
        return a - b;
    }

    public static  float mult(float a, float b) {
        return a * b;
    }

    public static  float div(float a, float b) {
        return a / b;
    }

}

package br.com.dio.calculadora;
import java.util.Scanner;
public class Calculadora {

	public static void main(String[] args) {
		// Instrução que solicita os valores ao usuário:
		Scanner scan = new Scanner(System.in);
		
		// Criando as Variáveis que receberão os valores:
		int a, b;
		
		// Solicitando os valores ao usuário:
		System.out.println("Digite o primeiro valor: ");
		a = scan.nextInt();
		System.out.println("Digite o segundo valor: ");
		b = scan.nextInt();
		
		// Executando as Operações:
		int soma = soma(a, b);
		int subtracao = subtracao(a, b);
		float divisao = divisao(a, b);
		int multiplicacao = multiplicacao(a, b);
		
		// Exibir os resultados das operações:
		System.out.println("soma: " + soma);
		System.out.println("subtração: " + subtracao);
		System.out.println("divisão: " + divisao);
		System.out.println("multiplicação: " + multiplicacao);
			}
	// Soma:
	public static int soma (int a, int b) {
		return a + b;
		}
	// Subtração:
	public static int subtracao (int a, int b) {
		return a - b;
		}
	// Divisão:
	public static float divisao (float a, float b) {
		return a / b;
		}
	// Multiplicação:
	public static int multiplicacao (int a, int b) {
		return a * b;
		}
}

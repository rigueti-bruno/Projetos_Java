package br.com.dio.calculadora;
import java.util.Scanner;
public class Calculadora {

	public static void main(String[] args) {
		// Instru��o que solicita os valores ao usu�rio:
		Scanner scan = new Scanner(System.in);
		
		// Criando as Vari�veis que receber�o os valores:
		int a, b;
		
		// Solicitando os valores ao usu�rio:
		System.out.println("Digite o primeiro valor: ");
		a = scan.nextInt();
		System.out.println("Digite o segundo valor: ");
		b = scan.nextInt();
		
		// Executando as Opera��es:
		int soma = soma(a, b);
		int subtracao = subtracao(a, b);
		float divisao = divisao(a, b);
		int multiplicacao = multiplicacao(a, b);
		
		// Exibir os resultados das opera��es:
		System.out.println("soma: " + soma);
		System.out.println("subtra��o: " + subtracao);
		System.out.println("divis�o: " + divisao);
		System.out.println("multiplica��o: " + multiplicacao);
			}
	// Soma:
	public static int soma (int a, int b) {
		return a + b;
		}
	// Subtra��o:
	public static int subtracao (int a, int b) {
		return a - b;
		}
	// Divis�o:
	public static float divisao (float a, float b) {
		return a / b;
		}
	// Multiplica��o:
	public static int multiplicacao (int a, int b) {
		return a * b;
		}
}

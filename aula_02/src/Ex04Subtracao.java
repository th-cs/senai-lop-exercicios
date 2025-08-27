// Lê 2 números, efetua a subtração do primeiro pelo segundo e escreve o
// resultado na tela
import java.util.Scanner;

public class Ex04Subtracao {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Declaração das variáveis
		int num1, num2, diferenca;

		// Entrada dos valores
		System.out.print("Olá, digite o primeiro número da subtração: ");
		num1 = input.nextInt();

		System.out.print("Digite o segundo número da subtração: ");
		num2 = input.nextInt();

		// Cálculo
		diferenca = num1 - num2;

		// Exibe o resultado
		System.out.printf("O resultado da subtração %d - %d é %d\n", num1, num2,
			diferenca);

		input.close();
	}
}

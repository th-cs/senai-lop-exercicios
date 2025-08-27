// Lê 2 números inteiros, efetua a soma deles e escreve o resultado na tela
import java.util.Scanner;

public class Ex03Soma {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Declaração das variáveis
		int num1, num2, soma;

		// Entrada dos valores
		System.out.print("Olá, digite o primeiro número da soma: ");
		num1 = input.nextInt();

		System.out.print("Digite o segundo número da soma: ");
		num2 = input.nextInt();

		// Cálculo e armazenamento da soma
		soma = num1 + num2;

		System.out.printf("O resultado da soma %d + %d é %d\n", num1, num2,
			soma);

		input.close();
	}
}

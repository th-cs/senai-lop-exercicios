// Lê 2 números inteiros, efetua a multiplicação deles e escreve o resultado na
// tela
import java.util.Scanner;

public class Ex05Multiplicacao {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Declaração das variáveis
		int fator1, fator2, produto;

		// Entrada dos valores
		System.out.print("Olá, digite o primeiro número da multiplicação: ");
		fator1 = input.nextInt();

		System.out.print("Digite o segundo número da multiplicação: ");
		fator2 = input.nextInt();

		// Cálculo
		produto = fator1 * fator2;

		// Exibe o resultado
		System.out.printf("O resultado da multiplicação %d x %d é %d\n", fator1,
			fator2, produto);

		input.close();
	}
}

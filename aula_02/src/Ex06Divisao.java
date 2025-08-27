// Lê 2 números reais, efetua a divisão do primeiro pelo segundo e escreve o
// resultado na tela
import java.util.Scanner;

public class Ex06Divisao {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Declaração das variáveis do tipo double (aceita números decimais)
		double dividendo, divisor, quociente;

		// Entrada dos valores
		System.out.print("Olá, digite o primeiro número da divisão: ");
		dividendo = input.nextDouble();

		System.out.print("Digite o segundo número da divisão: ");
		divisor = input.nextDouble();

		// Cálculo
		quociente = dividendo / divisor;

		// Exibe os valores com 2 casas decimais depois da vírgula
		System.out.printf("O resultado da divisão %.2f / %.2f é %.2f\n",
			dividendo, divisor, quociente);

		input.close();
	}
}

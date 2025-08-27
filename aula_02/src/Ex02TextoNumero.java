// Lê uma entrada de texto e uma de número inteiro e as escreve na tela
import java.util.Scanner;

public class Ex02TextoNumero {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Declara uma variável do tipo String "texto" e uma variável do tipo
		// int "numero"
		String texto;
		int numero;

		// Lê a palavra e o número digitados e os armazena nas variáveis
		System.out.print("Olá, digite uma palavra: ");
		texto = input.next();

		System.out.print("Agora digite um número: ");
		numero = input.nextInt();

		// Exibe as informações armazenadas
		System.out.printf("Palavra digitada: %s\nNúmero digitado: %d\n", texto,
			numero);

		input.close();
	}
}

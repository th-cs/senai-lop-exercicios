// Lê uma entrada de texto e a escreve na tela

// Importa a classe Scanner
import java.util.Scanner;

public class Ex01Texto {
	public static void main(String[] args) {
		// Cria um objeto do tipo Scanner
		Scanner input = new Scanner(System.in);

		// Declara uma variável do tipo String chamada "texto"
		String texto;

		// Lê a mensagem digitada pelo usuário e a armazena na variável
		System.out.print("Olá, digite a sua mensagem: ");
		texto = input.nextLine();

		// Exibe a mensagem digitada
		System.out.printf("Sua mensagem: %s\n", texto);

		// Fecha o scanner
		input.close();
	}
}

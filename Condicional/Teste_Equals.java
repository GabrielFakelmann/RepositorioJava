// Gabriel Fakelmann
// o codigo dependendo do que o usuario digita ele retorna ou bom dia, ou boa tarde ou boa noite
import java.util.Scanner;

public class Teste_Equals {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String valor;

		System.out.println("Digite boa tarde: ");
		valor = scanner.nextLine();

		if (valor.equalsIgnoreCase("boa tarde")) {
			System.out.println("Boa tarde");
		} else if (valor.equalsIgnoreCase("Bom dia")) {
			System.out.println("Bom dia");
		} else {
			System.out.println("Boa noite.");
		}

	}

}

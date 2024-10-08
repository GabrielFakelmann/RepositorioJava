// Gabriel Fakelmann
/**  
exemplo: Elabore um algoritmo que o usuário precise imputar seu nome, salario, empresa em que trabalha, telefone, email e cargo.
Se ele receber mais de 2 salários mínimos, ele é nível 2, senão ele é nível 1
*/

import java.util.Scanner;

public class Salario_if_else {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite seu nome: ");
		String nome = scanner.nextLine();

		System.out.print("Digite seu salário: ");
		Double salario = scanner.nextDouble();

		scanner.nextLine();
		System.out.print("Empresa que trabalha: ");
		String empresa = scanner.nextLine();

		System.out.print("Seu Telefone: ");
		String telefone = scanner.nextLine();

		System.out.print("Seu email: ");
		String email = scanner.nextLine();

		System.out.print("Qual seu cargo: ");
		String cargo = scanner.nextLine();

		scanner.close();
		if (salario > 2824) {
			System.out.println("\n" + nome + ", você é nível 2");
		} else {
			System.out.println("\n" + nome + ", você é nível 1");
		}

		System.out.println("Seu salário é: R$" + salario);
		System.out.println("Cargo: " + cargo);
		System.out.println("Telefone: " + telefone);
		System.out.println("Email: " + email);
		System.out.println("Empresa: " + empresa);

	}

}

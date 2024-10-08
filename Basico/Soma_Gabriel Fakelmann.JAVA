/*DEV:Gabriel Fakelmann 
 O codigo realiza uma soma de dois numeros digitados pelo usuario e finaliza
mostrando as entradas de dados e as saidas de dados*/

import java.util.Scanner;

public class Exercício_A {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o primeiro número: ");
		int num1 = scanner.nextInt();

		System.out.print("Digite o segundo número: ");
		int num2 = scanner.nextInt();

		int soma = num1 + num2;

		System.out.println("ENTRADA");
		System.out.println("" + num1 + "  " + num2);
		System.out.println("SAÍDA");
		System.out.println("SOMA = " + soma);
	}
}
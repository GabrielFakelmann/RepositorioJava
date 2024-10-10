/*Na matemática, um número perfeito é um número inteiro para o qual a soma de todos os seus
divisores positivos próprios (excluindo-o) é igual ao próprio número. Por exemplo o número 6 é perfeito, pois
1+2+3 é igual a 6. Sua tarefa é escrever um programa que imprima se um determinado número é perfeito ou
não. Utilize o laço que lhe for mais conveniente.*/
//DESENVOLVIDO POR: Gabriel Fakelmann
//DATA:10/10/2024

import java.util.Scanner;

public class NumeroPerfeito_Ex6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = 0, soma = 0;

		System.out.print("Digite um número: ");
		num = sc.nextInt();

		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				soma += i;
			}
		}

		if (soma == num) {
			System.out.println(num + " é um número perfeito.");
		} else {
			System.out.println(num + " não é um número perfeito.");
		}

		sc.close();
	}
}
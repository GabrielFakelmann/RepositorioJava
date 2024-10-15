/*7 - Faça um algoritmo que leia dois valores booleanos (lógicos) e determine se ambos são VERDADEIRO ou FALSO.
Desensvolvido por: Gabriel Fakelmann
Data: 15/10/2024*/

import java.util.Scanner;

public class Valores_Booleanos {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean valor_1, valor_2, result;

		System.out.println("Digite um valor lógico para a 1º posição: ");
		valor_1 = sc.nextBoolean();

		System.out.println("Agora digite um valor lógico para a 2º posição: ");
		valor_2 = sc.nextBoolean();

		result = valor_1 && valor_2;

		System.out.println("Resposta da posição é: " + result);
		
        sc.close();


	}

}

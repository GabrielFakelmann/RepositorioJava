/*Faça um programa que leia um número inteiro N maior do que zero e calcule o fatorial desse
número. Fatorial de N é representado por N! e calculado da seguinte maneira: ��! = �� ∗ (�� − 1) ∗ (�� − 2) ∗. . .∗
3 ∗ 2 ∗ 1 Utilize o laço que lhe for mais conveniente.*/
//DESENVOLVIDO POR: Gabriel Fakelmann
//DATA:10/10/2024

import java.util.Scanner;

public class Fatorial_Ex7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num;

		System.out.print("Digite um número maior que 0, que deseje saber seu fatorial: ");
		num = sc.nextInt();
		if (num <= 0) {
			System.out.print("Valor inválido. Digite um número maior que 0: ");
		}
		while (num <= 0);

		double fatorial = 1;
		for (int i = 1; i <= num; i++) {
			fatorial *= i;
		}
		System.out.println("O fatorial de " + num + " é " + fatorial);

		sc.close();
	}
}
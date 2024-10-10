/*Crie um programa que armazene 10 números inteiros e então determine e exiba o maior e o menor
número digitado.*/
//DESENVOLVIDO POR: Gabriel Fakelmann
//DATA:10/10/2024

import java.util.Scanner;

public class Maior_Menor_Ex9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] nums = new int[10];
		int maior = -99999999, menor = 99999999;
		for (int i = 0; i <= 9; i++) {
			System.out.print("Digite um número: ");
			nums[i] = sc.nextInt();
			if (nums[i] > maior) {
				maior = nums[i];
			}
			if (nums[i] < menor) {
				menor = nums[i];
			}
		}
		System.out.println("Maior número: " + maior);
		System.out.println("Menor número: " + menor);

		sc.close();
	}
}

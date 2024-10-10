/*Desenvolva um algoritmo em Java que leia um número inteiro e imprima
o seu antecessor e seu sucessor.*/
//DESENVOLVIDO POR: Gabriel Fakelmann
//DATA:10/10/2024

import java.util.Scanner;
public class Sucessor_Antecessor_Ex4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número: ");
		int num = sc.nextInt();
		
		System.out.println("Número escolhido: " + num);
		System.out.println("Antecessor: " + (num - 1));
		System.out.println("Sucecessor: " + (num + 1));

		sc.close();
	}

}

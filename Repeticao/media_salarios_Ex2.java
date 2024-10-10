/*Criar um programa que calcule a média de salários de uma empresa, pedindo ao usuário a grade
de funcionários e os salários, e devolvendo a média salarial.*/
//DESENVOLVIDO POR: Gabriel Fakelmann
//DATA:10/10/2024

import java.util.Scanner;
public class media_salarios_Ex2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double salario, media = 0;
		
		System.out.println("Digite a quantidade de funcionários presentes em sua empresa: ");
		int quant = sc.nextInt();
		
		for (int i =1; i <= quant; i++) {
			System.out.println("Digite o salário do "  + i + "° colaboradore(as):");
			salario = sc.nextDouble();
			media = media + salario;
		}
	 media = (media/quant);
	 System.out.printf("A media salarial da empresa é R$:  %.2f" , media);
	 
	 sc.close();
	}

}
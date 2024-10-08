/*DEV: Gabriel Fakelmann
 O programa le o código da uma peça1, a quantidade que está levando desta peça1, o
valor unitário da peça1, o código de uma peça 2, a quantidade que está levando desta peças2 e o valor unitário
de cada peça 2.Calcula e mostre o valor a ser pago e finaliza
mostrando as entradas de dados e as saidas de dados*/


import java.util.Scanner;

public class Exercicio_D {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		int peça1, peça2, qtd_peça1, qtd_peça2;
		double valor_peça1, valor_peça2, total;
		
		/*--------------------------------------------------------------------------------*/
		
		System.out.println("Digite o codigo da peça 1: ");
		peça1 = scanner.nextInt();
		
		System.out.println("Digite a quantidade de peças 1: ");
		qtd_peça1 = scanner.nextInt();
		
		System.out.println("Digite o valor da peça 1: ");
		valor_peça1 = scanner.nextDouble();
		/*--------------------------------------------------------------------------------*/
		
		System.out.println("Digite o codigo da peça 2: ");
		peça2 = scanner.nextInt();
		
		System.out.println("Digite a quantidade de peças 2: ");
		qtd_peça2 = scanner.nextInt();
		
		System.out.println("Digite o valor da peça 2: ");
		valor_peça2 = scanner.nextDouble();
		
		/*--------------------------------------------------------------------------------*/
		total = (qtd_peça1 * valor_peça1) + (qtd_peça2 * valor_peça2);
		
		System.out.println("Entrada: ");
		
		System.out.println("Peça1 - " + peça1 + qtd_peça1 + valor_peça1);
		System.out.println("Peça2 - " + peça2 + qtd_peça2 + valor_peça2);
		
		System.out.println("Saida: ");
		System.out.printf("Valor a pagar: %.2f%n" , total);
		scanner.close();

	}

}

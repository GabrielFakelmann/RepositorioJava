/*//DEV:Gabriel Fakelmann e Phelipe Campos
 O codio efetua o calculo da area do circulo atraves de informacoes dadas pelo usuario e finaliza
mostrando as entradas de dados e as saidas de dados
*/
import java.util.Scanner;

public class Exercicio_B {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		double raio, area;
		
		System.out.println("Digite o raio do circulo: ");
		raio = scanner.nextDouble();
		
		area = (raio * raio) * 3.14159;
		
		System.out.println("Entrada: ");
		System.out.println(raio);
		
		System.out.println("Saida: ");
		System.out.printf("A = %.4f%n" , area);
		
		scanner.close();
	}

}

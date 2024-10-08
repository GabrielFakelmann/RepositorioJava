/*DEV:Gabriel Fakelmann
 O programa mostra a soma de uma multiplicacao a partir de numeros cedidos pelo usuario e finaliza
mostrando as entradas de dados e as saidas de dados
*/
import java.util.Scanner;
public class Exercício_C {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite os valores para A, B, C e D:");

		System.out.print("A: ");
		int A = scanner.nextInt();

		System.out.print("B: ");
		int B = scanner.nextInt();

		System.out.print("C: ");
		int C = scanner.nextInt();

		System.out.print("D: ");
		int D = scanner.nextInt();

		int multAB = A * B;
		int multCD = C * D;
		int diferenca = multAB - multCD;

		System.out.println("ENTRADA");
		System.out.println(+A);
		System.out.println(+B);
		System.out.println(+C);
		System.out.println(+D);

		System.out.println("SAÍDA");
		System.out.println("DIFERENCA: " + diferenca);
	}
}
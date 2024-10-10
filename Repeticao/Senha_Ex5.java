/*Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura
de senha incorreta informada, escrever a mensagem &quot;Senha Invalida&quot;. Quando a senha for informada
corretamente deve ser impressa a mensagem &quot;Acesso Permitido&quot; e o algoritmo encerrado. Considere que a
senha correta é o valor 2002. Utilize o laço que lhe for mais conveniente.*/
//DESENVOLVIDO POR: Gabriel Fakelmann
//DATA:10/10/2024

import java.util.Scanner;
public class Senha_Ex5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

			for (int i = 1; i <= 3; i++) {
				System.out.println("Digite a senha: ");
				double senha = sc.nextDouble();
				
				if (senha == 2002) {
					System.out.println("Acesso permitido!");
					break;
				}
				else {
					System.out.println("Acesso negado. Você tem mais " + (3 - i) + " tentativas");
				}
			}
			sc.close();
	}

}

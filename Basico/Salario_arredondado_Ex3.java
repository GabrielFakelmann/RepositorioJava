//Informar um saldo e imprimir o saldo com reajuste de 1%
//DESENVOLVIDO POR: Gabriel Fakelmann
//DATA:10/10/2024

import java.util.Scanner;

public class Salario_arredondado_Ex3 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite seu salario: ");
	double salario = sc.nextDouble();
	
	double SalarioReajustado = (salario * 1 / 100) + salario;
	System.out.println("O salário reajustado em 1% é R$" + SalarioReajustado );

	sc.close();
	}

}

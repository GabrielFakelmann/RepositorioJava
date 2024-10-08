
//DEV: Gabriel Fakelmann
//O usuario sede suas informações como altura, peso e idade e o codigo diz seu imc
// FOI UTILIZADO A SEGUINTE FORMULA: PESO / (ALTURA * ALTURA)
import java.util.Scanner;

public class Calc_IMC {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String nome;
		char sexo;
		int idade;
		double peso, altura, imc;

		System.out.println("****************************");
		System.out.println("*****CALCULADORA DE IMC*****");
		System.out.println("****************************");

		System.out.print("Primeiramente digite seu nome: ");
		nome = scanner.nextLine();

		System.out.print("Digite seu sexo com M = Masculino ou F = Feminino: ");
		sexo = scanner.next().charAt(0);
		while (sexo != 'M' && sexo != 'F') {
			System.out.println("Algo foi digitado incorretamente, tente novamente");
			sexo = scanner.next().charAt(0);
		}

		System.out.print("Digite sua idade: ");
		idade = scanner.nextInt();
		while (idade <= 0 || idade >= 120) {
			System.out.println("Algo foi digitado incorretamente, tente novamente");
			idade = scanner.nextInt();
		}

		System.out.print("Digite seu peso (em kg): ");
		peso = scanner.nextDouble();

		System.out.print("Digite sua altura (em metros): ");
		altura = scanner.nextDouble();

		imc = peso / (altura * altura);

		System.out.println("                           ");
		System.out.println("                           ");

		System.out.println("================================");
		System.out.println("======TABELA DE RESULTADOS======");
		System.out.println("================================");

		System.out.println("Olá, " + nome + " SEUS RESULTADOS SÃO:");
		System.out.println("Seu sexo é: " + sexo);
		System.out.println("Sua idade é: " + idade);
		System.out.println("Seu peso é: " + peso + " kg");
		System.out.println("Sua altura é: " + altura + " metros");
		System.out.println("Seu IMC é: " + String.format("%.2f", imc));

		if (imc <= 18.5) {
			System.out.println("Você está abaixo do peso.");
		} else if (imc >= 18.6 && imc <= 24.9) {
			System.out.println("Você está no peso normal( PARABÉNS !!!).");
		} else if (imc >= 25.0 && imc <= 29.9) {
			System.out.println("Você está levemente acima do peso.");
		} else if (imc >= 30.0 && imc <= 34.9) {
			System.out.println("Você está com obesidade I.");
		} else if (imc >= 35.0 && imc <= 39.9) {
			System.out.println("Você está com obesidade grau II (severa).");

		} else if (imc > 40) {
			System.out.println("Você está com obesidade grau III (mórbida).");
		} else {
			System.out.println("Você digitou algo errado. Por favor reinicie o código.");
		}
		System.out.println("OBIGADO POR USAR A CALCULADORA DE IMC :)");
	}
}
/*Calcular e mostrar a média aritmética dos números pares compreendidos entre 13 e 73. Utilize
o laço que lhe for mais conveniente.*/
//DESENVOLVIDO POR: Gabriel Fakelmann
//DATA:10/10/2024

public class Media_13_73_Ex8 {
	public static void main(String[] args) {
		
	
		int quant_par = 0, soma_par = 0; //Variável tipo inteiro, com valor inicial igual a zero
		float media = 0; //Variável tipo float(decimal), com valor inicial igual a zero
      
		for (int i = 14; i <= 73; i++) { //Laço for que irá de 13 à 73
			if (i % 2 == 0) { //Se o resto da divisão por 2 for igual a 0
				quant_par++; //Contador quant_par que soma a quantidade de numeros pares presentes no intervalo
				soma_par = soma_par + i; //soma_par realiza a soma de todos os valores pares do intervalo
				media = media + i; //media realiza a soma dos numeros pares que posteriormente será realizada a media aritmetica 
			}
		}
		media = media / quant_par; //Calcula a media aritmetica
		System.out.printf("Quantidade de números pares: %d%n", quant_par);//Exibe a quantidade de números pares
		System.out.printf("Soma total dos números pares: %d%n", soma_par);//Exibe a soma total dos números pares
		System.out.printf("Média aritmética dos números pares: %f%n", media);//Exibe a média aritmética dos números pares

	}
}
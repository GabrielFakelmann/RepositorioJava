//Desenvolvido por: Gabriel Fakelmann
/*Realizar um programa que calcule o estoque médio, sendo que:
  estoque medio= (QUANTIDADE_MÍNIMA + QUANTIDADE_MÁXIMA) / 2.*/
import java.util.Scanner;

public class Estoque_medio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	double quant_min, quant_max,estoque_medio;
	
	System.out.println("==================================");
	System.out.println("==========ESTOQUE MEDIO===========");
	System.out.println("==================================");

	System.out.print("Digite a quantidade mímima:");
	quant_min = scanner.nextDouble();
	
	System.out.print("Digite a quantidade máxima:");
	quant_max = scanner.nextDouble();
	estoque_medio = (quant_min + quant_max ) / 2;
	System.out.print("Estoque Médio = "+estoque_medio+"\n");
	
    }

}
/*DESENVOLVIDO POR: Gabriel Fakelmann
  1.11 Você resolveu dar uma força para a NASA, que deseja calcular o peso das pessoas em diferentes planetas do sistema solar. (Isso vai ter importantes consequências na expansão da humanidade pelos planetas). Escreva um algoritmo que recebe o peso de uma pessoa (em Newtons) e calcula o novo peso nos corpos celestes, de acordo com as conversões gravitacionais de cada planeta (estas constantes estão normalizadas em relação à constante da Terra), dadas abaixo:

| Corpo celeste | Fator de conversão       |
|---------------|--------------------------|
| Mercúrio      | 0.3649337410              |
| Vênus         | 0.9041794087              |
| Marte         | 0.3812436289              |
| Lua           | 0.1651376146              |
| Terra         | 1                         |
| Júpiter       | 2.6513761467              |
| Saturno       | 1.1386340468              |
| Urano         | 1.0693170234              |
| Netuno        | 1.3506625891              |
| Plutão        | 0.2252803261              |

Depois de fazer as conversões, informe o quanto as pessoas pesariam se estivessem na Terra.*/
import java.util.Scanner;
public class PesoNosPlanetas {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double[] conversao = {
				0.3649337410, //mercurio
				0.9041794007, //venus
				0.3812436289, //marte
				0.1651376146, //lua
				1.0, //terra
				2.6513761467, //jupter
				1.1386340468, //saturno
				1.0693170234, //urano
				1.3506625891, //netuno
				0.2252803261 // plutao



};
		
		String[] planetas = {
		"Mercúrio", "Vênus", "Marte", "Lua", "Terra", "Júpter", "Saturno", "Urano", "Netuno", "Plutão"		
		};
		
		
		System.out.println("Digite seu peso em Newtons: ");
		double PesoTerra = sc .nextDouble();
		
		System.out.println("Seu peso em diferentes planetas: ");
		
		for (int i = 0; i < conversao.length; i++) {
			double PesoPlanetas = PesoTerra * conversao[i];
			System.out.printf("%s: %.2f N%n", planetas[i], PesoPlanetas);
		}
		sc.close();

	}

}

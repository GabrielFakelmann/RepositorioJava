/* DEV: Gabriel Fakelmann.
 DATA: 26/09/2024
 o usuario deve responder 10 perguntas expecíficas para o resultado final.
  O usuario pode responder  apenas com "sim" ou "não".
  As perguntas expecíficas que são:
 1- voce se sente com dificuldades de concentração?
  2- voce se sente cansado facilmente?
  3 -tem dificuldade em adormecer ou permanecer a dormir?
  4- voce se preocupa muito com o futuro?
  5- tem dificuldades em relaxar?
  6- sentiu-se tão preocupado que foi dificil ficar parado?
  7- sentiu-se facilmente inrritavel ou chateado?
  8- sentiu medo como se algo muito ruim fosse acontecer?
  9- voce se preocupa com a opinião dos outros?
  10- voce está com dificuldades em lembrar de detalhes?
  --------------------------------------------------------------------------------------------------------------------------------
  Se o usuario responder "SIM" em 7 perguntas ou mais, a impressão deve ser: "voce possui indícios de ansiedade. faça terapia."
  Se o usuario responder "Sim" em menos de 5 perguntas a impressão deve ser: "voce está aparentemente bem e sem riscos de ansiedade"
  --> se o user responder sim em 5 ou 6 perguntas a impressão deve ser: "voce precisa cuidar do corpo e da mente, procure orientação medica."

*/
import java.util.Scanner;

public class Teste_de_Anciedade {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("==============================================");
		System.out.println("===========   TESTE DE ANSIEDADE  ============");
		System.out.println("==============================================");
		String[] perguntas = { 
				"1. Você se sente com dificuldades de concentração?",
				"2. Você se sente cansado facilmente?", 
				"3. Tem dificuldade em adormecer ou permanecer a dormir?",
				"4. Você se preocupa muito com o futuro?", 
				"5. Tem dificuldades em relaxar?",
				"6. Sentiu-se tão preocupado que foi difícil ficar parado?",
				"7. Sentiu-se facilmente irritável ou chateado?",
				"8. Sentiu medo como se algo muito ruim fosse acontecer?",
				"9. Você se preocupa com a opinião dos outros?",
				"10. Você está com dificuldades em lembrar de detalhes?" };

		int cont_sim = 0;

		System.out.println("Responda às perguntas abaixo com 'sim' ou 'não'. Bom teste!");

		for (String pergunta : perguntas) {
			System.out.println(pergunta);
			boolean respostaAceita = false;

			while (!respostaAceita) {
				String resposta = scanner.nextLine();
				if (resposta.equalsIgnoreCase("Sim")) {
					cont_sim++;
					respostaAceita = true;
				} else if (resposta.equalsIgnoreCase("Não")) {
					respostaAceita = true;
				} else {
					System.out.println("Resposta inválida, responda novamente.");
					System.out.println(pergunta);
				}
			}
		}

		if (cont_sim >= 7) {
			System.out.println("Você possui indícios de ansiedade. Faça terapia.");
		} else if (cont_sim >= 5 && cont_sim <= 6) {
			System.out.println("Você precisa cuidar do corpo e da mente, procure orientação médica.");
		} else {
			System.out.println("Você está aparentemente bem e sem riscos de ansiedade.");
		}
		scanner.close();
	}
}

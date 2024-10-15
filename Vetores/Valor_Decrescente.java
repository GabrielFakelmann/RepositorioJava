/*8 - Faça um algoritmo que leia três valores inteiros diferentes e imprima na tela os valores em ordem decrescente.
Desensvolvido por: Gabriel Fakelmann
Data: 15/10/2024*/
import java.util.Scanner;
import java.util.Arrays;

public class Valor_Decrescente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] valores = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Digite o " + (i + 1) + "° valor: ");
            valores[i] = sc.nextInt();
        }

        Arrays.sort(valores);
        System.out.println("Valores em ordem decrescente:");
        for (int i = valores.length - 1; i >= 0; i--) {
            System.out.print(valores[i] + " ");
        }

        sc.close();
    }
}
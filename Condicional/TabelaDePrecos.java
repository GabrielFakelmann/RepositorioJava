/* 12 - Faça um algoritmo que leia o valor de um produto e determine o valor que deve ser pago, conforme a escolha da forma de pagamento

 pelo comprador e imprima na tela o valor final do produto a ser pago. Utilize os códigos da tabela de condições de pagamento para efetuar o cálculo adequado.
 Tabela de Código de Condições de Pagamento

 1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto

 2 - À Vista no cartão de crédito, recebe 10% de desconto

 3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros

 4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%
 Desensvolvido por: Gabriel Fakelmann
Data: 15/10/2024 */

import java.util.Scanner;

public class TabelaDePrecos {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Digite o nome do produto: ");
    String nome = sc.next();

    System.out.print("Digite o valor unitario de " + nome + " R$:");
    double produto = sc.nextDouble();

    System.out.println("Escolha a forma de pagamento:");
    System.out.println("1 - À Vista em Dinheiro ou Pix");
    System.out.println("2 - À Vista no cartão de crédito");
    System.out.println("3 - Parcelado no cartão em (2x)");
    System.out.println("4 - Parcelado no cartão em (3x)");
    int opcao = sc.nextInt();

    if (opcao < 1 || opcao > 4) {
      System.out.println("Opção de pagamento inválida!");
    } else {
      double juros;
      switch (opcao) {
        case 1: juros = 0.85; break;
        case 2: juros = 0.90; break;
        case 3: juros = 1.00; break;
        case 4: juros = 1.10; break;
        default: juros = 0; break; 
      }
      double valorfinal = produto * juros;
      System.out.printf("O valor final do produto a ser pago é: R$%.2f" , valorfinal);
    }
    sc.close();
  }
}
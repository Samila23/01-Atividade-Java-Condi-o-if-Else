// Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
//seguir, calcule e mostre o valor da conta a pagar.

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double cod , quant, total ; 
		
		System.out.println("Digite o Codigo do produto");
		cod = sc.nextDouble();
		System.out.println("Quantidade do produto");
		quant= sc.nextDouble();
		
		if(cod == 1) {
			total = (quant * 4.00);
			System.out.printf("Valor total é de R$ %.2f%n", total);
		}
		else if(cod == 2) {
			total = (quant * 4.50);
			System.out.printf("Valor total é de R$ %.2f%n", total);
		}
		else if(cod == 3) {
			total = (quant * 5.00);
			System.out.printf("Valor total é de R$ %.2f%n", total);
		}
		else if(cod == 4) {
			total = (quant * 2.00);
			System.out.printf("Valor total é de R$ %.2f%n", total);
		}
		else if(cod == 5) {
			total = (quant * 1.50);
			System.out.printf("Valor total é de R$ %.2f%n", total);
		}
		else {
			System.out.println("Codigo do produto não cadastrado");
		}
		sc.close();
}
}

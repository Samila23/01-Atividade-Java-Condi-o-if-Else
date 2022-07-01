//Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
//Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em ordem crescente ou decrescente.

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int a,b;
		
		System.out.println("Digite um numero");
		a = sc.nextInt();
		System.out.println("Digite um numero");
		b = sc.nextInt();
		
		if (a % b  == 0 || b % a == 0) {
			System.out.println("Os números são multiplos");
		}
		
		else {
			System.out.println("Os números não são multiplos");
		}
		sc.close();
}
}

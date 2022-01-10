//Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas
//de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
//ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
//Se o ponto estiver na origem, escreva a mensagem “Origem”.
//Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a
//situação.

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double x, y;
		
		System.out.println("Digite o valor que corresponde ao eixo x");
		x = sc.nextDouble();
		
		System.out.println("Digite o valor que corresponde ao eixo y");
		y = sc.nextDouble();
		
		if( x > 0 && y > 0) {
			System.out.println("Q1");
		}
		else if( x < 0 && y > 0) {
			System.out.println("Q2");
		}
		else if( x < 0 && y < 0) {
			System.out.println("Q3");
		}
		else if ( x > 0 && y < 0) {
			System.out.println("Q4");
		}	
		else if  ( x == 0 && y == 0) {
			System.out.println("Origem");
		}
		// Se o valor de X = 0, e Y for negativo ou positivo irá apontar que  é da origem ao eixo Y
		else if (x == 0 && y > 0 || y < 0) {
			System.out.println("Eixo Y");
		}
		// Se o valor de Y = 0, e X for negativo ou positivo irá apontar que  é da origem ao eixo Y
		else if (y == 0 && x > 0 || x < 0) {
			System.out.println("Eixo X");
		}
		sc.close();
}
}

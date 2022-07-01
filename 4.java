// Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode começar em um dia e terminar em outro,
//tendo uma duração mínima de 1 hora e máxima de 24 horas.

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double horaInicial , horaFinal, duracao = 0 , duracao2;
		
		System.out.println("Hora Inicial");
		horaInicial = sc.nextDouble();
		System.out.println("Hora Final");
		horaFinal = sc.nextDouble();
		
		duracao = (24 - horaInicial) + horaFinal; 
		duracao2 = duracao;
		
		if (duracao2 < 1 || duracao2 > 24 ){
			System.out.println("Formato inserido está incorreto, considerar duracao minima de 1h ");	
		}
		else if (horaInicial<24) {
			System.out.println("Duração do Jogo é de " + duracao + "horas");
		}
		

		sc.close();
}
}

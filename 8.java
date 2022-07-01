//Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, pois sabem
//que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população, sem
//qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$.
//Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida, calcule e
//mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.
//Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, pois a faixa de
//salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa é
//de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser impresso com
//duas casas decimais.

//DE R$ 0.00 a R$ 2000.00 / Imposto = Isento
//DE R$ 2000.01 a R$ 3000.00 / Imposto = 8%
//DE R$ 3000.01 a R$ 4500.00 / Imposto = 18%
//DE R$ 4500.00 / Imposto = 28%

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double salBruto , DescFase01 , DescFase02 ,
			DescFase02Total , DescFase03 , DescFase03Total, total,
			DescFase04, DescFase04Total;
		
		System.out.println("Por favor, digite o valor bruto recebido");
		salBruto = sc.nextDouble();
		
		if (salBruto <= 2000.00) {
			DescFase01 = 0.00;
			System.out.printf("Isento");
		}
		else if (salBruto > 2000.00 && salBruto <= 3000.00) {
			DescFase01 = 0;
			DescFase02 = (salBruto - 2000.00);
			DescFase02Total = (DescFase02 * 0.08);
			total = (DescFase01 + DescFase02Total);
			System.out.printf("Desconto é de R$ %.2f%n", total);	
		}
		else if (salBruto > 3000.00 && salBruto <= 4500.00) {
			DescFase01 = 0.00;
			DescFase02 = (1000.00 * 0.08);
			DescFase03 = (salBruto - 3000.00);
			DescFase03Total = (DescFase03 * 0.18);
			total = (DescFase01 + DescFase02 + DescFase03Total);
			System.out.printf("Desconto é de R$ %.2f%n", total);
		}
		else if (salBruto > 4500.00) {
			DescFase01 = 0.00;
			DescFase02 = (1000.00 * 0.08);
			DescFase03 = (1500.00 * 0.18);
			DescFase04 = (salBruto - 4500.00);
			DescFase04Total = (DescFase04 * 0.28);
			total = (DescFase01 + DescFase02 + DescFase03 + DescFase04Total);
			System.out.printf("Desconto é de R$ %.2f%n", total);
		}
		sc.close();
		
}
}

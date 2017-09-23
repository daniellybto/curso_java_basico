/*
 * @author dany-fera
 * Criado no Eclipse: Version: Mars.2 Release (4.5.2)
 * Build id: 20160218-0600
 * 
 *
 * Criado em 22 de set de 2017 */

/*12. Faça um programa para o cálculo de uma folha de pagamento, sabendo que os descontos são do Imposto de Renda, que depende do
salário bruto (conforme tabela abaixo) e 3% para o Sindicato e que o FGTS corresponde a 11% do Salário Bruto, mas não é descontado (é
a empresa que deposita). O Salário Líquido corresponde ao Salário Bruto menos os descontos. O programa deverá pedir ao usuário o
valor da sua hora e a quantidade de horas trabalhadas no mês.
>> Desconto do IR:
>> Salário Bruto até 900 (inclusive) - isento
>> Salário Bruto até 1500 (inclusive) - desconto de 5%
>> Salário Bruto até 2500 (inclusive) - desconto de 10%
>> Salário Bruto acima de 2500 - desconto de 20%

Imprima na tela as informações, dispostas conforme o exemplo abaixo.
No exemplo o valor da hora é 5 e a quantidade de hora é 220.

		Salário Bruto: (5 * 220) : R$ 1100,00
		(-) IR (5%) 			 : R$ 55,00 (desconta)
		(-) INSS ( 10%) 		 : R$ 110,00 (desconta)
		FGTS (11%) 				 : R$ 121,00 (NÃO DESCONTA!)
		Total de descontos 		 : R$ 165,00
		Salário Liquido 		 : R$ 935,00
*/
package curso_loiane.cursojava.aula15;

import java.util.Scanner;

public class ExercicioLista12 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		System.out.println("Entre com o valor da sua hora trabalhada e a quantidade de horas trabalhadas por mês: ");
			double valorHora = read.nextDouble();
			int horasMes = read.nextInt();
		
		double salarioBruto = valorHora * horasMes;
		double descontoIR;
		double descontoINSS = salarioBruto * 0.1;
		double descontoFGTS = salarioBruto * 0.11;
		double percentualIR = 0;
		double salarioLiquido;
		
		if (salarioBruto <= 900){ //isento
			percentualIR = 0;
		} else if (salarioBruto <=1500){ //desconto de 5% no IR
			percentualIR = 0.05;
		} else if (salarioBruto <=2500){ //desconto de 10% no IR
			percentualIR = 0.1;
		} else{ //desconto de 20% no IR
			percentualIR =  0.2;
		}
		descontoIR = salarioBruto * percentualIR;
		salarioLiquido = salarioBruto-descontoIR-descontoINSS;
				
		System.out.println("Salário Bruto: ("+valorHora+" * "+ horasMes+ "): R$ "+salarioBruto);
		System.out.println("(-) IR ("+(percentualIR*100)+"%): R$"+descontoIR);
		System.out.println("(-) INSS (10%): R$"+descontoINSS);
		System.out.println("FGTS (11%): R$"+descontoFGTS);
		System.out.println("Total de descontos: R$"+(descontoINSS+descontoIR));
		System.out.println("\nSalário Liquido: R$"+salarioLiquido);
	}

}

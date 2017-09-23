/*
 * @author dany-fera
 * Criado no Eclipse: Version: Mars.2 Release (4.5.2)
 * Build id: 20160218-0600
 * 
 *
 * Criado em 22 de set de 2017 */

/*12. Fa�a um programa para o c�lculo de uma folha de pagamento, sabendo que os descontos s�o do Imposto de Renda, que depende do
sal�rio bruto (conforme tabela abaixo) e 3% para o Sindicato e que o FGTS corresponde a 11% do Sal�rio Bruto, mas n�o � descontado (�
a empresa que deposita). O Sal�rio L�quido corresponde ao Sal�rio Bruto menos os descontos. O programa dever� pedir ao usu�rio o
valor da sua hora e a quantidade de horas trabalhadas no m�s.
>> Desconto do IR:
>> Sal�rio Bruto at� 900 (inclusive) - isento
>> Sal�rio Bruto at� 1500 (inclusive) - desconto de 5%
>> Sal�rio Bruto at� 2500 (inclusive) - desconto de 10%
>> Sal�rio Bruto acima de 2500 - desconto de 20%

Imprima na tela as informa��es, dispostas conforme o exemplo abaixo.
No exemplo o valor da hora � 5 e a quantidade de hora � 220.

		Sal�rio Bruto: (5 * 220) : R$ 1100,00
		(-) IR (5%) 			 : R$ 55,00 (desconta)
		(-) INSS ( 10%) 		 : R$ 110,00 (desconta)
		FGTS (11%) 				 : R$ 121,00 (N�O DESCONTA!)
		Total de descontos 		 : R$ 165,00
		Sal�rio Liquido 		 : R$ 935,00
*/
package curso_loiane.cursojava.aula15;

import java.util.Scanner;

public class ExercicioLista12 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		System.out.println("Entre com o valor da sua hora trabalhada e a quantidade de horas trabalhadas por m�s: ");
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
				
		System.out.println("Sal�rio Bruto: ("+valorHora+" * "+ horasMes+ "): R$ "+salarioBruto);
		System.out.println("(-) IR ("+(percentualIR*100)+"%): R$"+descontoIR);
		System.out.println("(-) INSS (10%): R$"+descontoINSS);
		System.out.println("FGTS (11%): R$"+descontoFGTS);
		System.out.println("Total de descontos: R$"+(descontoINSS+descontoIR));
		System.out.println("\nSal�rio Liquido: R$"+salarioLiquido);
	}

}

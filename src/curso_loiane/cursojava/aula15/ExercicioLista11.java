/*
 * @author dany-fera
 * Criado no Eclipse: Version: Mars.2 Release (4.5.2)
 * Build id: 20160218-0600
 * 
 *
 * Criado em 22 de set de 2017 */

/*11. As Organizações Tabajara resolveram dar um aumento de salário aos
seus colaboradores e lhe contraram para desenvolver o programa que
calculará os reajustes.
>> Faça um programa que recebe o salário de um colaborador e o
reajuste segundo o seguinte critério, baseado no salário atual:
>> salários até R$ 280,00 (incluindo) : aumento de 20%
>> salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
>> salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
>> salários de R$ 1500,00 em diante : aumento de 5% 
Após o aumento ser realizado, informe na tela:
>> o salário antes do reajuste;
>> o percentual de aumento aplicado;
>> o valor do aumento;
>> o novo salário, após o aumento.*/
package curso_loiane.cursojava.aula15;

import java.util.Scanner;

public class ExercicioLista11 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		System.out.println("Insira seu salário atual (em R$): ");
			double salarioAtual = read.nextDouble();
		
		double novoSalario;
		double percentagemReajuste;
		
		if (salarioAtual <= 280){ //aumento de 20%
			percentagemReajuste = 1.2;						
		} else if (salarioAtual < 700){ //aumento de 15%
			percentagemReajuste = 1.15;
		} else if (salarioAtual < 1500){ //aumento de 10%
			percentagemReajuste = 1.1;
		} else{ //aumento de 5%
			percentagemReajuste = 1.05;
		}
		
		novoSalario = salarioAtual * percentagemReajuste;
		
		System.out.println("Seu salário antes do reajuste é de R$ "+salarioAtual);
		System.out.println("O percentual de reajuste é de: " + (percentagemReajuste-1)*100 + " %");
		System.out.println("O valor de aumento é de R$ "+ (novoSalario-salarioAtual));
		System.out.println("Seu NOVO salário será de R$ "+ novoSalario);
	
	}
}

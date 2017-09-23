/*
 * @author dany-fera
 * Criado no Eclipse: Version: Mars.2 Release (4.5.2)
 * Build id: 20160218-0600
 * 
 *
 * Criado em 22 de set de 2017 */

/*11. As Organiza��es Tabajara resolveram dar um aumento de sal�rio aos
seus colaboradores e lhe contraram para desenvolver o programa que
calcular� os reajustes.
>> Fa�a um programa que recebe o sal�rio de um colaborador e o
reajuste segundo o seguinte crit�rio, baseado no sal�rio atual:
>> sal�rios at� R$ 280,00 (incluindo) : aumento de 20%
>> sal�rios entre R$ 280,00 e R$ 700,00 : aumento de 15%
>> sal�rios entre R$ 700,00 e R$ 1500,00 : aumento de 10%
>> sal�rios de R$ 1500,00 em diante : aumento de 5% 
Ap�s o aumento ser realizado, informe na tela:
>> o sal�rio antes do reajuste;
>> o percentual de aumento aplicado;
>> o valor do aumento;
>> o novo sal�rio, ap�s o aumento.*/
package curso_loiane.cursojava.aula15;

import java.util.Scanner;

public class ExercicioLista11 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		System.out.println("Insira seu sal�rio atual (em R$): ");
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
		
		System.out.println("Seu sal�rio antes do reajuste � de R$ "+salarioAtual);
		System.out.println("O percentual de reajuste � de: " + (percentagemReajuste-1)*100 + " %");
		System.out.println("O valor de aumento � de R$ "+ (novoSalario-salarioAtual));
		System.out.println("Seu NOVO sal�rio ser� de R$ "+ novoSalario);
	
	}
}

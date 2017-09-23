// @author dany-fera
package curso_loiane.cursojava.aula13;

import java.util.Scanner;

public class ExercicioLista13 {
/*13. Fa�a um Programa que pergunte quanto voc� ganha por hora e o
n�mero de horas trabalhadas no m�s. Calcule e mostre o total do seu
sal�rio no referido m�s, sabendo-se que s�o descontados 11% para o
Imposto de Renda, 8% para o INSS e 5% para o sindicato, fa�a um
programa que nos d�:
. sal�rio bruto.
a. quanto pagou ao INSS.
b. quanto pagou ao sindicato.
c. o sal�rio l�quido.
d. calcule os descontos e o sal�rio l�quido, conforme a tabela
abaixo:
+ Sal�rio Bruto 
: R$ - IR (11%) 
: R$ - INSS (8%) 
: R$ - Sindicato ( 5%) 
: R$ = Sal�rio Liquido : R$*/
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite quanto voc� ganha por hora (em R$) e quantas horas trabalha no m�s (em horas): ");
			double valorHora = ler.nextDouble();
			int horaDeTrabalhoMes = ler.nextInt();
			
		double salarioBruto = valorHora * horaDeTrabalhoMes;
		double descontoImpostoDeRenda= salarioBruto*0.11;
		double descontoInss = salarioBruto*0.08;
		double descontoSindicato = salarioBruto*0.05;
		double salarioLiquido = salarioBruto - descontoImpostoDeRenda -descontoInss - descontoSindicato;
		
		System.out.println("Seu Sal�rio Bruto � de: "+salarioBruto+" R$");
		System.out.println("Voc� paga de INSS: "+descontoInss+" R$");
		System.out.println("Voc� paga ao Sindicato: "+descontoSindicato+" R$");
		System.out.println("Seu sal�rio L�quido �: "+salarioLiquido+" R$");
		System.out.println("");
		System.out.println("");
		System.out.println("......TODOS OS DESCONTOS......");
		System.out.println("Desconto Imposto de Renda: "+descontoImpostoDeRenda+" R$");
		System.out.println("Desconto INSS: "+descontoInss+" R$");
		System.out.println("Desconto Sindicato: "+descontoSindicato+" R$");
		System.out.println("");
		System.out.println("TOTAL DE DESCONTOS: "+(descontoImpostoDeRenda + descontoInss + descontoSindicato)+" R$");
		System.out.println("..............................");
	}

}

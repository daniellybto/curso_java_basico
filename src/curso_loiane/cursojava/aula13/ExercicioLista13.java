// @author dany-fera
package curso_loiane.cursojava.aula13;

import java.util.Scanner;

public class ExercicioLista13 {
/*13. Faça um Programa que pergunte quanto você ganha por hora e o
número de horas trabalhadas no mês. Calcule e mostre o total do seu
salário no referido mês, sabendo-se que são descontados 11% para o
Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um
programa que nos dê:
. salário bruto.
a. quanto pagou ao INSS.
b. quanto pagou ao sindicato.
c. o salário líquido.
d. calcule os descontos e o salário líquido, conforme a tabela
abaixo:
+ Salário Bruto 
: R$ - IR (11%) 
: R$ - INSS (8%) 
: R$ - Sindicato ( 5%) 
: R$ = Salário Liquido : R$*/
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite quanto você ganha por hora (em R$) e quantas horas trabalha no mês (em horas): ");
			double valorHora = ler.nextDouble();
			int horaDeTrabalhoMes = ler.nextInt();
			
		double salarioBruto = valorHora * horaDeTrabalhoMes;
		double descontoImpostoDeRenda= salarioBruto*0.11;
		double descontoInss = salarioBruto*0.08;
		double descontoSindicato = salarioBruto*0.05;
		double salarioLiquido = salarioBruto - descontoImpostoDeRenda -descontoInss - descontoSindicato;
		
		System.out.println("Seu Salário Bruto é de: "+salarioBruto+" R$");
		System.out.println("Você paga de INSS: "+descontoInss+" R$");
		System.out.println("Você paga ao Sindicato: "+descontoSindicato+" R$");
		System.out.println("Seu salário Líquido é: "+salarioLiquido+" R$");
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

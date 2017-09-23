// @author dany-fera
package curso_loiane.cursojava.aula13;

import java.util.Scanner;

public class ExercicioLista08 {
/*8. Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. 
Calcule e mostre o total do seu salário no referido mês.*/
	public static void main(String[] args) {
		System.out.println("CÁLCULO DE SALÁRIO");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a seguir quanto você ganha por hora e o número de horas trabalhadas no mês: ");
			double valorHora = scan.nextDouble();
			int horasTrabalhasMes = scan.nextInt();
			
		double salario = valorHora * horasTrabalhasMes;
		System.out.println("Seu salário mensão, então é: "+ salario);

	}

}

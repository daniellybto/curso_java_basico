// @author dany-fera
package curso_loiane.cursojava.aula13;

import java.util.Scanner;

public class ExercicioLista08 {
/*8. Fa�a um Programa que pergunte quanto voc� ganha por hora e o n�mero de horas trabalhadas no m�s. 
Calcule e mostre o total do seu sal�rio no referido m�s.*/
	public static void main(String[] args) {
		System.out.println("C�LCULO DE SAL�RIO");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a seguir quanto voc� ganha por hora e o n�mero de horas trabalhadas no m�s: ");
			double valorHora = scan.nextDouble();
			int horasTrabalhasMes = scan.nextInt();
			
		double salario = valorHora * horasTrabalhasMes;
		System.out.println("Seu sal�rio mens�o, ent�o �: "+ salario);

	}

}

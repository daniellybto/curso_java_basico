/*
 * @author dany-fera
 * Criado no Eclipse: Version: Mars.2 Release (4.5.2)
 * Build id: 20160218-0600
 * 
 *
 * Criado em 22/09/17*/

/*5. Fa�a um programa para a leitura de duas notas parciais de um aluno.
O programa deve calcular a m�dia alcan�ada por aluno e apresentar:
o A mensagem "Aprovado", se a m�dia alcan�ada for maior ou
igual a sete;
o A mensagem "Reprovado", se a m�dia for menor do que sete;
o A mensagem "Aprovado com Distin��o", se a m�dia for igual a
dez.*/

package curso_loiane.cursojava.aula15;

import java.util.Scanner;

public class ExercicioLista05 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		System.out.println("Entre com as 2 notas parciais de um aluno: ");
			double nota1 = read.nextDouble();
			double nota2 = read.nextDouble();
			
		double media = (nota1+nota2)/2;
		if ((media != 10) && (media >=7)){
			System.out.println("Aprovado!!");
		}else if (media <7){
			System.out.println("Reprovado");
		}else if (media == 10){
			System.out.println("APROVADO COM DISTIN��O!!");
		}
		
	}

}

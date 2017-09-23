/*
 * @author dany-fera
 * Criado no Eclipse: Version: Mars.2 Release (4.5.2)
 * Build id: 20160218-0600
 * 
 *
 * Criado em 22 de set de 2017 */

/*10. Faça um Programa que pergunte em que turno você estuda. Peça
para digitar M-matutino ou V-Vespertino ou N- Noturno. Imprima a
mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor
Inválido!", conforme o caso.*/
package curso_loiane.cursojava.aula15;

import java.util.Scanner;

public class ExercicioLista10 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		System.out.println("Digite em qual turno você estuda ( M-matutino ou V-Vespertino ou N-Noturno): ");
			char turno = read.nextLine().charAt(0);
			
		switch (turno){
			case 'n': case 'N':
				System.out.println("BOA NOITE!");break;
			case 'v': case 'V':
				System.out.println("BOA TARDE!");break;
			case 'm': case 'M':
				System.out.println("BOM DIA!");break;
			default: System.out.println("Valor Inválido");
		}
	}

}

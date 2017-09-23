// @author dany-fera
//Criado no Eclipse: Version: Mars.2 Release (4.5.2)
//Build id: 20160218-0600

//Criação deste aquivo 22/09/17

/*4. Faça um Programa que verifique se uma letra digitada é vogal ou
consoante.*/

package curso_loiane.cursojava.aula15;

import java.util.Scanner;

public class ExercicioLista04 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		System.out.println("Insira uma letra: ");
			char letra = read.nextLine().charAt(0);
		
		switch(letra){
			case 'a': case 'A': case 'e': case 'E': case 'i': case 'I': case 'o': case 'O': case 'u': case 'U':
				System.out.println("A primeira letra digitada é uma VOGAL!");break;
			default: System.out.println("A primeira letra digitada é uma CONSOANTE!");
		}
	}

}

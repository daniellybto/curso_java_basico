// @author dany-fera

package curso_loiane.cursojava.aula15;

import java.util.Scanner;

public class ExercicioLista03 {
/*3. Faça um Programa que verifique se uma letra digitada é "F" ou "M".
Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.*/
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		System.out.println("Digite seu Sexo (F / M)");
			//String letra = read.nextLine();
			char letra = read.nextLine().charAt(0);/*charAt: função utilizada para armazenar apenas um caratere da string,
													o valor entre parênteses determina qual posição da string guardar! 
													-> '0' para o primeiro caractere!*/ 
		
		switch(letra){
			case 'm': case 'M':
				System.out.println("Masculino");break;
			case 'f': case 'F':
				System.out.println("Feminino");break;
			default: System.out.println("Sexo Inválido");
		}
		
	}

}

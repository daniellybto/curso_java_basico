// @author dany-fera
package curso_loiane.cursojava.aula13;

import java.util.Scanner;

public class ExercicioLista03 {
//3. Faça um Programa que peça dois números e imprima a soma.
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
			int primeiroNumero = scan.nextInt();
		System.out.println("Digite outro número: ");
			int segundoNumero = scan.nextInt();
			int soma = primeiroNumero + segundoNumero;
		System.out.println(primeiroNumero + " + " + segundoNumero + " = " + soma);
		

	}

}

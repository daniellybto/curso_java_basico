// @author dany-fera
package curso_loiane.cursojava.aula13;

import java.util.Scanner;

public class ExercicioLista03 {
//3. Fa�a um Programa que pe�a dois n�meros e imprima a soma.
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
			int primeiroNumero = scan.nextInt();
		System.out.println("Digite outro n�mero: ");
			int segundoNumero = scan.nextInt();
			int soma = primeiroNumero + segundoNumero;
		System.out.println(primeiroNumero + " + " + segundoNumero + " = " + soma);
		

	}

}

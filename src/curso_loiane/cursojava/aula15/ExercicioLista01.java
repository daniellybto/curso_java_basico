// @author dany-fera
package curso_loiane.cursojava.aula15;

import java.util.Scanner;

public class ExercicioLista01 {
//1. Fa�a um Programa que pe�a dois n�meros e imprima o maior deles.
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		System.out.println("Entre com dois n�meros: ");
			double primeiroNumero = read.nextDouble();
			double segundoNumero = read.nextDouble();
		
		System.out.println("\nO maior n�mero �: ");
		
		if (primeiroNumero > segundoNumero){//primeiro n�mero maior
			System.out.println(primeiroNumero);
		}else{
			System.out.println(segundoNumero);//segundo n�mero maior
		}
		
	}
}

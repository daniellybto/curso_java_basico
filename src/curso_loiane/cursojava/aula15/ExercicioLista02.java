// @author dany-fera
package curso_loiane.cursojava.aula15;

import java.util.Scanner;

public class ExercicioLista02 {
/*2. Fa�a um Programa que pe�a um valor e mostre na tela se o valor �
positivo ou negativo.*/
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
			double numero = read.nextDouble();
			
		if (numero<0){
			System.out.println("N�mero Negativo");
		}else{
			System.out.println("N�mero Positivo");
		}

	}

}

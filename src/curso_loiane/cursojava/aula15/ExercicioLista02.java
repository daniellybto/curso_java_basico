// @author dany-fera
package curso_loiane.cursojava.aula15;

import java.util.Scanner;

public class ExercicioLista02 {
/*2. Faça um Programa que peça um valor e mostre na tela se o valor é
positivo ou negativo.*/
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
			double numero = read.nextDouble();
			
		if (numero<0){
			System.out.println("Número Negativo");
		}else{
			System.out.println("Número Positivo");
		}

	}

}

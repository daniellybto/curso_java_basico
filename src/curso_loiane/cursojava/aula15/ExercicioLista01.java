// @author dany-fera
package curso_loiane.cursojava.aula15;

import java.util.Scanner;

public class ExercicioLista01 {
//1. Faça um Programa que peça dois números e imprima o maior deles.
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		System.out.println("Entre com dois números: ");
			double primeiroNumero = read.nextDouble();
			double segundoNumero = read.nextDouble();
		
		System.out.println("\nO maior número é: ");
		
		if (primeiroNumero > segundoNumero){//primeiro número maior
			System.out.println(primeiroNumero);
		}else{
			System.out.println(segundoNumero);//segundo número maior
		}
		
	}
}

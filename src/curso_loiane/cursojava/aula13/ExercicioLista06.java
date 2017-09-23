// @author dany-fera
package curso_loiane.cursojava.aula13;

import java.util.Scanner;

public class ExercicioLista06 {
//6. Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Programa para calcular área de um círculo!");
		System.out.println("Digite o Raio do círculo: ");
			double raioCirculo = ler.nextDouble();
			
		double areaCirculo = 3.14 * Math.pow(raioCirculo, 2);//funçao Math.pow só aceita Double, por isso o uso do double!
		System.out.println("A área do círculo é: " + areaCirculo);
	}

}

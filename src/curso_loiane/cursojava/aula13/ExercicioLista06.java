// @author dany-fera
package curso_loiane.cursojava.aula13;

import java.util.Scanner;

public class ExercicioLista06 {
//6. Fa�a um Programa que pe�a o raio de um c�rculo, calcule e mostre sua �rea.
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Programa para calcular �rea de um c�rculo!");
		System.out.println("Digite o Raio do c�rculo: ");
			double raioCirculo = ler.nextDouble();
			
		double areaCirculo = 3.14 * Math.pow(raioCirculo, 2);//fun�ao Math.pow s� aceita Double, por isso o uso do double!
		System.out.println("A �rea do c�rculo �: " + areaCirculo);
	}

}

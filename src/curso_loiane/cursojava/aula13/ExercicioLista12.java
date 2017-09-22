package curso_loiane.cursojava.aula13;

import java.util.Scanner;

public class ExercicioLista12 {
/*12. Tendo como dados de entrada a altura de uma pessoa, construa um
algoritmo que calcule seu peso ideal, usando a seguinte fórmula:
(72.7*altura) - 58 */
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Entre com sua altura para calcular seu peso ideal: ");
			double altura = ler.nextDouble();
		
		double pesoIdeal = (altura * 72.7)-58;
		
		System.out.println("Seu peso ideal é: "+ pesoIdeal + " kg");

	}

}

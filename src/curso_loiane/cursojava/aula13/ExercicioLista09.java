package curso_loiane.cursojava.aula13;

import java.util.Scanner;

public class ExercicioLista09 {
/*9. Faça um Programa que peça a temperatura em graus Farenheit,
transforme e mostre a temperatura em graus Celsius.
-> C = (5 * (F-32) / 9).  */
	public static void main(String[] args) {
		System.out.println("TRANSFORMANDO TEMPERATURA EM F° P/ C°");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor da tempratura em F°: ");
			double temperaturaFarenheit = scan.nextDouble();
			
		double temperaturaCelsius = 5*(temperaturaFarenheit -32)/9;
		System.out.println("Temperatura em C°: " + temperaturaCelsius);

	}

}

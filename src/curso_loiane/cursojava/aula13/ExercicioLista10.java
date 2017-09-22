package curso_loiane.cursojava.aula13;

import java.util.Scanner;

/*10. Faça um Programa que peça a temperatura em graus Celsius,
transforme e mostre em graus Farenheit.*/
public class ExercicioLista10 {

	public static void main(String[] args) {
		System.out.println("TRANSFORMAÇÃO DE TEMPERATURAS: C° p/ F°");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em C°: ");
			double temperaturaCelsius = scan.nextDouble();
			
		double temperaturaFarenheit = temperaturaCelsius*1.8 + 32;
		System.out.println("A temperatura em F°: " + temperaturaFarenheit);

	}

}

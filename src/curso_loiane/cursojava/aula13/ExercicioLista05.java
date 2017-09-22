package curso_loiane.cursojava.aula13;

import java.util.Scanner;

public class ExercicioLista05 {
//5. Faça um Programa que converta metros para centímetros.
	public static void main(String[] args) {
		Scanner observar = new Scanner(System.in);
		
		System.out.println("Digite um número em metro que será convertidos em centímetros: ");
			float valorMetros = observar.nextFloat();
		System.out.println("O valor convertido em centímetros é: " + (valorMetros*100)+" cm");

	}

}

package curso_loiane.cursojava.aula13;

import java.util.Scanner;

public class ExercicioLista05 {
//5. Fa�a um Programa que converta metros para cent�metros.
	public static void main(String[] args) {
		Scanner observar = new Scanner(System.in);
		
		System.out.println("Digite um n�mero em metro que ser� convertidos em cent�metros: ");
			float valorMetros = observar.nextFloat();
		System.out.println("O valor convertido em cent�metros �: " + (valorMetros*100)+" cm");

	}

}

package curso_loiane.cursojava.aula13;

import java.util.Scanner;

public class ExercicioLista04 {
//4. Fa�a um Programa que pe�a as 4 notas bimestrais e mostre a m�dia.	
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite a 1� Nota: ");
			float nota1 = ler.nextFloat();
		System.out.println("Digite a 2� Nota: ");
			float nota2 = ler.nextFloat();
		System.out.println("Digite a 3� Nota: ");
			float nota3 = ler.nextFloat();
		System.out.println("Digite a 4� Nota: ");
			float nota4 = ler.nextFloat();
			
		float mediaNotas = (nota1+nota2+nota3+nota4)/4;
		System.out.println("A m�dia das notas s�o: "+mediaNotas);
		
	}

}

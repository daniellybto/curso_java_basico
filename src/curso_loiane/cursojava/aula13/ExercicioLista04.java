package curso_loiane.cursojava.aula13;

import java.util.Scanner;

public class ExercicioLista04 {
//4. Faça um Programa que peça as 4 notas bimestrais e mostre a média.	
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite a 1ª Nota: ");
			float nota1 = ler.nextFloat();
		System.out.println("Digite a 2ª Nota: ");
			float nota2 = ler.nextFloat();
		System.out.println("Digite a 3ª Nota: ");
			float nota3 = ler.nextFloat();
		System.out.println("Digite a 4ª Nota: ");
			float nota4 = ler.nextFloat();
			
		float mediaNotas = (nota1+nota2+nota3+nota4)/4;
		System.out.println("A média das notas são: "+mediaNotas);
		
	}

}

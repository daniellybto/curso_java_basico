package curso_loiane.cursojava.aula13;

import java.util.Scanner;

public class ExercicioLista07 {
/*7. Faça um Programa que calcule a área de um quadrado, em seguida
mostre o dobro desta área para o usuário.*/
	public static void main(String[] args) {
		System.out.println("CÁLCULO DA ÁREA DE UM QUADRADO");
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite os valores de altura e largura do quadrado: ");
			double altura = ler.nextDouble();
			double largura = ler.nextDouble();
			
		System.out.println("A área do quadrado é: "+ (altura*largura));
		System.out.println("O dobro da área é: " + ((altura*largura)*2));
		
	}

}

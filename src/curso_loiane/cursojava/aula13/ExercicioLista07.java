package curso_loiane.cursojava.aula13;

import java.util.Scanner;

public class ExercicioLista07 {
/*7. Fa�a um Programa que calcule a �rea de um quadrado, em seguida
mostre o dobro desta �rea para o usu�rio.*/
	public static void main(String[] args) {
		System.out.println("C�LCULO DA �REA DE UM QUADRADO");
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite os valores de altura e largura do quadrado: ");
			double altura = ler.nextDouble();
			double largura = ler.nextDouble();
			
		System.out.println("A �rea do quadrado �: "+ (altura*largura));
		System.out.println("O dobro da �rea �: " + ((altura*largura)*2));
		
	}

}

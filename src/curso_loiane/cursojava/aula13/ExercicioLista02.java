package curso_loiane.cursojava.aula13;

import java.util.Scanner;

public class ExercicioLista02 {
//2. Fa�a um Programa que pe�a um n�mero e ent�o mostre a 
//mensagem: O n�mero informado foi [n�mero].
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		float numero = ler.nextFloat();
		System.out.println("O n�mero informado foi: " + numero);
		
	}

}

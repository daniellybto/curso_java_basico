package curso_loiane.cursojava.aula13;

import java.util.Scanner;

public class ExercicioLista02 {
//2. Faça um Programa que peça um número e então mostre a 
//mensagem: O número informado foi [número].
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		float numero = ler.nextFloat();
		System.out.println("O número informado foi: " + numero);
		
	}

}

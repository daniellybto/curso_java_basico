package curso_loiane.cursojava.aula13;

import java.util.Scanner;

public class ExercicioLista11 {
/*11. Fa�a um Programa que pe�a 2 n�meros inteiros e um n�mero real. Calcule e mostre:
a. o produto do dobro do primeiro com metade do segundo .
b. a soma do triplo do primeiro com o terceiro.
c. o terceiro elevado ao cubo.*/
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a seguir 2 n�meros inteiros e por �ltimo um terceiro n�mero que poder ser real (com v�rgula): ");
			int	primeiroNumero = scan.nextInt();
			int segundoNumero = scan.nextInt();
			double terceiroNumero = scan.nextDouble();
		
		//a.
		double operacao1 = (primeiroNumero*2)+((double)segundoNumero/2);
		System.out.println("O produto do dobro do primeiro com metado do sergundo �: "+ operacao1);
		
		//b.
		double operacao2 = (primeiroNumero*3)+terceiroNumero;
		System.out.println("A soma do triplo do primeiro com o terceiro �: " + operacao2);
		
		//c.
		double operacao3 = Math.pow(terceiroNumero, 3);
		System.out.println("O terceiro elevado ao cubo �: " + operacao3);
		
	}

}

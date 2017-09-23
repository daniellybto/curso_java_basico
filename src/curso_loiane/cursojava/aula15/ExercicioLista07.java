/*
 * @author dany-fera
 * Criado no Eclipse: Version: Mars.2 Release (4.5.2)
 * Build id: 20160218-0600
 * 
 *
 * Criado em 22 de set de 2017 */

// 7. Faça um Programa que leia três números e mostre o maior e o menor deles.
package curso_loiane.cursojava.aula15;

import java.util.Scanner;

public class ExercicioLista07 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		System.out.println("Digite 3 números: ");
			double valor1 = read.nextDouble();
			double valor2 = read.nextDouble();
			double valor3 = read.nextDouble();
			
		if (valor1 > valor2){ //valor1 MAIOR
			if (valor1 >valor3){  //valor1 MAIOR
				System.out.println("Maior valor: "+valor1);
				if (valor2 > valor3){  //valor2 MAIOR
					System.out.println("Menor valor: "+valor3);
				}else{  //valor3 MAIOR
					System.out.println("Menor valor: "+valor2);
				}
			}
		} else if (valor2 > valor1){  //valor2 MAIOR
			if (valor2 > valor3){  //valor2 MAIOR
				System.out.println("Maior valor: "+valor2);
				if (valor1 > valor3){ //valor1 MAIOR
					System.out.println("Menor valor: "+valor3);
				}else{
					System.out.println("Menor valor: "+valor1);
				}
			}else{  //valor3 MAIOR
				System.out.println("Maior valor: "+valor3);
				if (valor1 > valor2){ //valor1 MAIOR
					System.out.println("Menor valor: "+valor2);
				}else{
					System.out.println("Menor valor: "+valor1);
				}
			}
		} 
		
		
	}

}

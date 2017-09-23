/*
 * @author dany-fera
 * Criado no Eclipse: Version: Mars.2 Release (4.5.2)
 * Build id: 20160218-0600
 * 
 *
 * Criado em 22 de set de 2017 */

/*9. Faça um Programa que leia três números e mostre-os em ordem
decrescente.*/
package curso_loiane.cursojava.aula15;

import java.util.Scanner;

public class ExercicioLista09 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		System.out.println("Insira 3 números: ");
			int numero1 = read.nextInt();
			int numero2 = read.nextInt();
			int numero3 = read.nextInt();
			
		if (numero1 > numero2){ //numero1 MAIOR
			if (numero1 > numero3){ //numero1 MAIOR
				System.out.println(numero1);
				if (numero2 > numero3){ //numero2 MAIOR
					System.out.println(numero2 +"\n" + numero3);
				}else{ //numero3 MAIOR
					System.out.println(numero3 +"\n" + numero2);
				}
			}
		} else if (numero2 > numero1){ //numero2 MAIOR
			if (numero2 > numero3){ //numero2 MAIOR
				System.out.println(numero2);
				if (numero3 > numero1){ //numero3 MAIOR
					System.out.println(numero3 +"\n" + numero1);
				} else{ //numero1 MAIOR
					System.out.println(numero1 +"\n" + numero3);
				}
			}else{ //numero3 MAIOR
				System.out.println(numero3);
				if (numero1 > numero2){ //numero1 MAIOR
					System.out.println(numero1 +"\n" + numero2);
				}else{ //numero2 MAIOR
					System.out.println(numero2 +"\n" + numero1);
				}
			}
		}

	}

}

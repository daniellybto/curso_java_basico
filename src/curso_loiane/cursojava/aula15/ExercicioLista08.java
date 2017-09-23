/*
 * @author dany-fera
 * Criado no Eclipse: Version: Mars.2 Release (4.5.2)
 * Build id: 20160218-0600
 * 
 *
 * Criado em 22 de set de 2017 */

/*8. Faça um programa que pergunte o preço de três produtos e informe
qual produto você deve comprar, sabendo que a decisão é sempre
pelo mais barato.*/
package curso_loiane.cursojava.aula15;

import java.util.Scanner;

public class ExercicioLista08 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		System.out.println("Digite o Preço dos três produtos: ");
			double preco1 = read.nextDouble();
			double preco2 = read.nextDouble();
			double preco3 = read.nextDouble();
			
		if (preco1 < preco2){ //preco1 MENOR
			if (preco1 <preco3){ //preco1 MENOR
				System.out.println("Compre o produto com o valor de $"+preco1);
			}else{  //preco3 MENOR
				System.out.println("Compre o produto com o valor de $"+preco3);
			}
		} else if(preco2 < preco1){ //preco2 MENOR
			if (preco2 < preco3){ //preco2 MENOR
				System.out.println("Compre o produto com o valor de $"+preco2);
			}else{ //preco3 MENOR
				System.out.println("Compre o produto com o valor de $"+preco3);
			}
		}
	}

}

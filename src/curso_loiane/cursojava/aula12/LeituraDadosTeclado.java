package curso_loiane.cursojava.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		/*System.out.println("Digite seu nome Completo: ");
		String nomeCompleto = ler.nextLine();
		System.out.println("Hum... Ent�o seu nome completo e: " + nomeCompleto);*/
		
		/*System.out.println("Digite somente seu primeiro nome a seguir: ");
		String primeiroNome = ler.next();
		System.out.println("Seu primeiro nome �: " + primeiroNome);*/
		
		/*System.out.print("Digite sua Idade: ");
		int idade = ler.nextInt();
		System.out.println("Voc� tem "+idade +" anos!!!");*/
		
		System.out.println("Digite seu 1� nome, idade, quantos filhos, altura e se tem bichos de estima��o (True/False): ");
			String primeiroNome = ler.next();
			int idade = ler.nextInt();
			byte qtdFilhos = ler.nextByte();
			float altura = ler.nextFloat();//por algum motivo ao digitar a altura deve-se utilizar a ',' para separar o n�mero inteiro!!!
			boolean bichosEstimacao = ler.nextBoolean();
		
		System.out.println("Seu 1� Nome: " + primeiroNome);
		System.out.println("Sua idade: " + idade);
		System.out.println("Quantidade de Filhos: " + qtdFilhos);
		System.out.println("Sua Altura: " + altura);
		System.out.println("Tem bichos de estima��o: " + bichosEstimacao);
		

	}

}

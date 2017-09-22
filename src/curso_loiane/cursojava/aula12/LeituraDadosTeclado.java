package curso_loiane.cursojava.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		/*System.out.println("Digite seu nome Completo: ");
		String nomeCompleto = ler.nextLine();
		System.out.println("Hum... Então seu nome completo e: " + nomeCompleto);*/
		
		/*System.out.println("Digite somente seu primeiro nome a seguir: ");
		String primeiroNome = ler.next();
		System.out.println("Seu primeiro nome é: " + primeiroNome);*/
		
		/*System.out.print("Digite sua Idade: ");
		int idade = ler.nextInt();
		System.out.println("Você tem "+idade +" anos!!!");*/
		
		System.out.println("Digite seu 1º nome, idade, quantos filhos, altura e se tem bichos de estimação (True/False): ");
			String primeiroNome = ler.next();
			int idade = ler.nextInt();
			byte qtdFilhos = ler.nextByte();
			float altura = ler.nextFloat();//por algum motivo ao digitar a altura deve-se utilizar a ',' para separar o número inteiro!!!
			boolean bichosEstimacao = ler.nextBoolean();
		
		System.out.println("Seu 1º Nome: " + primeiroNome);
		System.out.println("Sua idade: " + idade);
		System.out.println("Quantidade de Filhos: " + qtdFilhos);
		System.out.println("Sua Altura: " + altura);
		System.out.println("Tem bichos de estimação: " + bichosEstimacao);
		

	}

}

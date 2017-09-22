package curso_loiane.cursojava.aula13;

import java.util.Scanner;

public class ExercicioLista14 {
/*14. Faça um programa que peça o tamanho de um arquivo para download
(em MB) e a velocidade de um link de Internet (em Mbps), calcule e
informe o tempo aproximado de download do arquivo usando este link
(em minutos).*/
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o tamanho do arquivo (em MB) e a velocidade da sua internet (em Mbps): ");
			double tamanhoArquivo = scan.nextDouble();
			int velocidadeInternet = scan.nextInt();
			
		double tempoDownload = tamanhoArquivo / (velocidadeInternet*60);//velocidade (em segundos) * 60 s = velocidd p/ minuto
		int valorInteiroTempo = (int) tempoDownload;
		double tempoDownMinutos = ((tempoDownload - valorInteiroTempo)*60) + ((int) tempoDownload)*60;
		System.out.println("Tempo de Download (em minutos): "+tempoDownMinutos);
	}

}

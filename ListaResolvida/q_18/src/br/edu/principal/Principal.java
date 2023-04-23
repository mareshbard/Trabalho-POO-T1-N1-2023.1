package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Por favor, digite o peso do saco em quilos: ");
		double pesoSaco = sc.nextDouble();
		System.out.println("Por favor, digite o que o gato 1 recebe por dia em gramas: ");
		double racaogato1 = sc.nextDouble();
		System.out.println("Por favor, didite o que o gato 2 recebe por dia em gramas: ");
		double racaogato2 = sc.nextDouble();
		racaogato1 = racaogato1 /1000;
		racaogato2 = racaogato2 /1000;
		double totalfinal = pesoSaco - 5 * (racaogato1 + racaogato2);
		System.out.println("Sobrará "+totalfinal+"kg de ração no saco após 5 dias.");

	}

}

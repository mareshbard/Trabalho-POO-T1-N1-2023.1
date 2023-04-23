package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a altura do degrau da escada: ");
        double degrauTam = sc.nextDouble();
        System.out.println("Digite a altura que você deseja subir na escada: ");
        double alturaDes = sc.nextDouble();
        double qtdDegraus = (alturaDes / degrauTam);
        System.out.println("Você subiu um total de " + qtdDegraus +" degraus.");
        

	}

}

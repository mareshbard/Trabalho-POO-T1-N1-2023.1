package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Por favor, digite a base do triângulo: ");
		double base = sc.nextDouble();
		System.out.println("Por favor, digite a altura do triângulo: ");
		double altura = sc.nextDouble();
		double areat = (base*altura)/2;
		System.out.println("A area do triângulo é igual a "+areat);
		
	}
}
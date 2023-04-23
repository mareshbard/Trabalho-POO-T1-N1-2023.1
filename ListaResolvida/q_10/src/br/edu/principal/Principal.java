package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Por favor, digite o raio numerico do circulo: ");
		double raio = sc.nextDouble();
		double pi = 3.14;
		double areac = pi * (raio * raio) ;
	    System.out.println("A área do círculo é igual a "+areac+".");

	}

}

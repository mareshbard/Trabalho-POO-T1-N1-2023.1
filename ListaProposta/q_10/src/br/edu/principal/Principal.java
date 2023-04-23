package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 System.out.println("Por favor, digite o lado do quadrado: ");
         double lado = sc.nextDouble();
         double area = lado * lado;
         System.out.println("A área do quadrado é igual a " +area+".");
        
	}
}
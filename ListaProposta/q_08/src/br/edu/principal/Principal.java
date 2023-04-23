package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 System.out.println("Por favor, digite o seu peso em quilos: ");
         double pesoKg = sc.nextDouble();
         double pesoG = pesoKg * 1000;
         System.out.println("O seu peso convertido é igual a: " +pesoG+" gramas.");

        
	}
}

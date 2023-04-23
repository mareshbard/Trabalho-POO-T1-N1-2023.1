package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 System.out.println("Por favor, digite a temperatura em °C: ");
         double tempC = sc.nextDouble();
         double tempF = (tempC * 9/5) + 32;
         System.out.println("O valor convertido é igual a " + tempF+" fahrenheit.");
        
	}
}

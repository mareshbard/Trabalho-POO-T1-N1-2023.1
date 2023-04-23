package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 System.out.println("Por favor, digite o primeiro ângulo do triângulo: ");
         double angulo1 = sc.nextDouble();
         System.out.println("Por favor, digite o segundo ângulo do triângulo: ");
         double angulo2 = sc.nextDouble();
         double angulo3 = 180 - (angulo1 + angulo2);
         System.out.println("O valor do terceiro angulo é igual a " +angulo3+" graus.");
        
	}
}
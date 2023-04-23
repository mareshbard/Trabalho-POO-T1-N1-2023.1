
package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, digite o valor do seu salário-base: ");
        double salBase = sc.nextDouble();
        double imposto = salBase * 0.1;
        double salReceber = salBase + 50 - imposto;
        System.out.println("Você vai receber um total de "+salReceber+" reais.");

	}

}


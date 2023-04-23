
package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, digite o preço do produto:");
        double preco = sc.nextDouble();
        double desconto = preco * 0.1;
        double precofinal = preco - desconto;
        System.out.println("O preço final do produto, com desconto de 10%, será "+ precofinal+" reais.");
        
	}
}

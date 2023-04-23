package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, digite o valor do depósito: ");
        double valorDep = sc.nextDouble();
        System.out.println("Por favor, digite o valor da taxa de juros: ");
        double valorTax = sc.nextDouble();
        double Rend = valorDep * (valorTax / 100);
        double valorTotal = valorDep + Rend;
        System.out.println("O rendimento do depósito será "+ Rend+" reais.");
        System.out.println("O valor total do depósito será "+valorTotal+" reais.");
        
	}

}
package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, digite o salário fixo:");
        double salFixo = sc.nextDouble();
        System.out.println("Por favor, digite o valor das vendas:");
        double vendas = sc.nextDouble();
        double comissao = vendas * 0.04;
        double salFinal = salFixo + comissao;
        System.out.println("A comissão do funcionário é igual a "+comissao+" reais e o seu salário final é igual a "+salFinal+" reais.");
        
	}
}
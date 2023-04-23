package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, digite o preço de fábrica do carro: ");
        double precoCarro = sc.nextDouble();
        System.out.println("Por favor, digite o percentual de lucro do distribuidor: ");
        double percenLucro = sc.nextDouble();
        System.out.println("Por favor, digite o percentual de impostos: ");
        double percenImpos = sc.nextDouble();
        double lucroDistri = precoCarro * (percenLucro / 100);
        double valorImpos = precoCarro * (percenImpos / 100);
        double valorFinal = precoCarro + valorImpos + lucroDistri;
        System.out.println("O lucro do distribuidor é igual a "+ lucroDistri +" reais.");
        System.out.println("O valor dos impostos será " +valorImpos +" reais.");
        System.out.println("O preço final do veículo será " +valorFinal+ " reais. ");
        

	}

}
package br.edu.principal;
import java.util.Scanner;
public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, digite o valor do seu salário: ");
        double salMinimo = sc.nextDouble();
        System.out.println("Por favor, digite a quantidade de quilowatts consumida: ");
        double quilowatts = sc.nextDouble();
        double valQuilow = salMinimo /5;
        double pagRes = valQuilow * quilowatts;
        double descon = pagRes * 15/100;
        double valorDesc = pagRes - descon;
        System.out.println("Cada quilowatt vai valer " +valQuilow + " reais.");
        System.out.println("O valor a ser pago por essa residência será " +pagRes+" reais.");
        System.out.println("O valor a ser pago, considerando o desconto, será "+valorDesc+" reais.");

    }
} 

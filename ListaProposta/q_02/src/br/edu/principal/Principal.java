
package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
            System.out.println("Por favor, digite o primeiro numero: ");
        	int num1 = sc.nextInt();
        	System.out.println("Por favor, digite o segundo numero: ");
        	int num2 = sc.nextInt();
        	System.out.println("Por favor, digite o terceiro numero: ");
        	int num3 = sc.nextInt();
        	int mult = num1 * num2 * num3;
        	System.out.println("A multiplicação desses três números é igual a "+mult);
        }
    } 

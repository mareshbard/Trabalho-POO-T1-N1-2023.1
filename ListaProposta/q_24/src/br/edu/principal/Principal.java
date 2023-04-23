
package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
          Scanner input = new Scanner(System.in);

            System.out.println("Digite a quantidade de dinheiro em reais que você possui: ");
            double reais = input.nextDouble();

            double dolares = reais / 1.8;
            double marcoAlemao = reais / 2.0;
            double libraEsterlina = reais / 1.57;

            System.out.println("Valor em dólares: " + dolares);
            System.out.println("Valor em marco alemão: " + marcoAlemao);
            System.out.println("Valor em libra esterlina: " + libraEsterlina);
        }
    } 


package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor da primeira nota: ");
        double nota1 = sc.nextDouble();
        System.out.print("Digite o valor do primeira peso: ");
        double peso1 = sc.nextDouble();
        System.out.print("Digite o valor da segunda nota: ");
        double nota2 = sc.nextDouble();
        System.out.print("Digite o valor do segundo peso: ");
        double peso2 = sc.nextDouble();
        System.out.print("Digite o valor da terceira nota: ");
        double nota3 = sc.nextDouble();
        System.out.print("Digite o valor do terceiro peso: ");
        double peso3 = sc.nextDouble();


        double somanotas = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3);
        double somapesos = (peso1 + peso2 + peso3);
        double medianotas = (somanotas/somapesos);

        //Utilizamos o comando Math.round que arredonda a nota até uma casa decimal.
        medianotas = Math.round(medianotas * 10.0) / 10.0;

        System.out.println("A media das notas é "+ medianotas);


    }


}

package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, digite o ano atual: ");
        int anoAtual = sc.nextInt();
        System.out.println("Por favor, digite seu ano de nascimento: ");
        int anoNasc = sc.nextInt();
        int idadeAtual = (anoAtual - anoNasc);
        int idade2005 = (2005 - anoNasc);
        System.out.println("Atualmente, você tem "+ idadeAtual+" anos.");
        if (idade2005 >= 0) {
            System.out.println("Em 2005, você tinha "+ idade2005 +" anos." );
        } else {
        	 System.out.println("Em 2005, você ainda não tinha nascido.");
        }
        		
        

	}

}

package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 System.out.println("Por favor, digite o valor do cateto adjacente: ");
         double adjacente = sc.nextDouble();
         System.out.println("Por favor, digite o valor do cateto oposto: ");
         double oposto = sc.nextDouble();
         double hipotenusa = (oposto * oposto) + (adjacente * adjacente);
         System.out.println("O valor do terceiro lado, ou seja, a hipotenusa, é igual a: "+ Math.sqrt(hipotenusa));
      

        
	}
}
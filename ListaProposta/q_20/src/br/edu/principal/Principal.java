package br.edu.principal;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 System.out.println("Por favor, digite o valor do angulo formado pela escada: ");
         double angulo = sc.nextDouble();
         System.out.println("Por favor, digite a distância que a escada está da parede (em metros): ");
         double altura  = sc.nextDouble();
         double rad = angulo * 3.14/180;
         double sin = Math.sin(rad);
         double escada = altura / sin;
         System.out.println("A medida da escada para que se possa alcançar a ponta da escada é igual a "+ new DecimalFormat(".##").format(escada)+" metros.");
        
 
	}
}
package AULA01;

import java.util.Scanner;

public class EXERCICIO_07_ALGORITMOS
{
	public static void main(String[] args)
	{
	Scanner leia= new Scanner(System.in);
	
		double a, b, c, d, E, F, x, y;
		
		System.out.println("INSIRA OS VALORES PARA A EQUAÇÃO LINEAR:\nDigite o valor de a: ");
		a= leia.nextDouble();
		System.out.println("\nb: ");
		b= leia.nextDouble();
		
		System.out.println("\nc: ");
		c= leia.nextDouble();
		
		System.out.println("\nd: ");
		d= leia.nextDouble();
		
		System.out.println("\ne: ");
		E= leia.nextDouble();
		
		System.out.println("\nf: ");
		F= leia.nextDouble();
		
		x=0.00;
		y=0.00;
		x=((c*E)-(b*F))/((a*E)-(b*d));
		y=((a*F)-(c*d))/((a*E)-(b*d));
		
		
		System.out.println(" x = "+x+ " , y = "+ y);

		leia.close();
		fim();
		
}
	public static void fim() 
	{
		System.out.println("Fim do programa");
	}

}	

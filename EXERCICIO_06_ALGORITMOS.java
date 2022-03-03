package AULA01;

import java.util.Scanner;


public class EXERCICIO_06_ALGORITMOS
{
	public static void main(String[] args)
	{
	Scanner leia= new Scanner(System.in);
	
	
		double x1, x2, y1, y2, d;
		
		System.out.println("Insira as coordenadas cartesianas de P(x1,y1):\n-2,5P(x1): ");
		x1=leia.nextDouble();
		System.out.println("P(y1): ");
		y1= leia.nextDouble();
		
		System.out.println("Insira as coordenadas cartesianas de P(x2,y2):\n P(x2): ");
		x2=leia.nextDouble();
		System.out.println("P(y2): ");
		y2= leia.nextDouble();
		
		d=Math.sqrt((((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1))));
		System.out.println("Distância = "+d);

		leia.close();
		fim();
		
}
	public static void fim() 
	{
		System.out.println("Fim do programa");
	}

}	

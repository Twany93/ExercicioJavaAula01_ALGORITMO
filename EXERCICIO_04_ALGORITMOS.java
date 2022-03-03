package AULA01;

import java.util.Scanner;

public class EXERCICIO_04_ALGORITMOS
{
	public static void main(String[] args)
	{
	Scanner leia= new Scanner(System.in);
	
		int a, b, c, d, r, s;
		
		System.out.println("Calculo da expressão com inteiros\nDigite o valor de a: ");
		a= leia.nextInt();
		System.out.println("Digite o valor de b: ");
		b= leia.nextInt();
		
		System.out.println("Digite o valor de c: ");
		c= leia.nextInt();
		
		r= (a+b)*(a+b);
		s=(c+b)*(c+b);
		d=(r+s)/2;
		
		System.out.println("Resultado da expressão é = "+d);

		leia.close();
		fim();
		
}
	public static void fim() 
	{
		System.out.println("Fim do programa");
	}

}	

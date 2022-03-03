package AULA01;

import java.util.Scanner;

public class EXERCICIO_01_ALGORITMOS
{
	public static void main(String[] args)
	{
	Scanner leia= new Scanner(System.in);
	
		int anos, meses, dias, resposta;
		
		System.out.println("OLÁ!\nInforme sua idade em anos, meses e dias\nAnos: ");
		anos= leia.nextInt();
	
		System.out.println("Meses: ");
		meses= leia.nextInt();
	
		System.out.println("Idade em dias: ");
		dias= leia.nextInt();
		resposta= (anos* 365)+(meses * 30)+dias;
		System.out.println("Sua idade em dias = "+resposta);
		

		leia.close();
		fim();
		
}
	public static void fim() 
	{
		System.out.println("Fim do programa");
	}

}	

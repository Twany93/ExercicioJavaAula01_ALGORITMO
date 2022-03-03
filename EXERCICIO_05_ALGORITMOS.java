package AULA01;

import java.util.Scanner;

public class EXERCICIO_05_ALGORITMOS
{
	public static void main(String[] args)
	{
	Scanner leia= new Scanner(System.in);
	
	
		double prova1, prova2, prova3, mediaPonderada;
		
		System.out.println("Olá Aluno!\nInsira a nota da sua Prova 1: ");
		prova1= leia.nextDouble();
		System.out.println("Digite a nota da sua prova 2: ");
		prova2=leia.nextDouble();
		System.out.println("Digite a nota da sua prova 3: ");
		prova3=leia.nextDouble();
	
		mediaPonderada=((prova1*2)+(prova2*3)+(prova3*5))/(2+3+5);
		
		System.out.println("A média ponderada é: "+ mediaPonderada);

		leia.close();
		fim();
		
}
	public static void fim() 
	{
		System.out.println("Fim do programa");
	}

}	

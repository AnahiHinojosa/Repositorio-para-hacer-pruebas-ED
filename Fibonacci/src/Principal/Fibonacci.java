package Principal;

import java.util.Scanner;

public class Fibonacci 
{
	
	public int FibonacciSucesion (int n)
	{
		int i, t0=0, t1=1;
		int posicion=n, sucesion=0;
		
		for (i=0 ; i<posicion ; i++)
		{
			sucesion=t0;
			t0=t1;
			t1=t0+ sucesion;
		}
		return t0;
	}
	public static void main(String[] args) 
	{
		Fibonacci fibonacci= new Fibonacci();
		int n;
		Scanner sc = new Scanner(System.in);
		//System.out.println("Introduzca el número de términos:");
		//n = sc.nextInt();
		System.out.println(fibonacci.FibonacciSucesion(7));
	}
}
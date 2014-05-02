package learningjava;

import java.util.Scanner;

public class demo {
	
	
	public void Add(int a, int b)
	{
		int c = a + b;
		System.out.println(c);
	}
  
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the value of A");
		int a = input.nextInt();
		System.out.println("Enter the value of B");
		int b = input.nextInt();
		demo af =new demo();
		af.Add(a,b);
	
	}
	  }
	


	

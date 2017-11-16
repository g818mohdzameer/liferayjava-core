package hellworld;

import java.util.Scanner;

public class BiggestNumber 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		//enter three variables
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any three integer valuse");
		//store first integer and go to next integer value
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		//condition to find biggest number
		if (a>b && a>c) 
			System.out.println("First number is bigg");
		
		    else if (b>a && b>c) 
		    	System.out.println("Second number is bigg");
		
		        else if (c>a && c>a) 
					 System.out.println("Third number is bigg");
		        else
		        	System.out.println("Entered values are not sufficient");
	}

}

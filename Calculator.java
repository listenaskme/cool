/*1. The java program should run till user enters "quit" or any other option than add or sub or mult or div.
	Prompt user to enter the input operation : (add|sub|mult|div) & 2 numbers(double)
	Display the result of the operation.
	Use Scanner for accepting all inputs from user. 
	Hint : use switch-case*/
import java.util.Scanner;
public class Calculator
{
	public static void main(String[] args)
	{
		Scanner jk=new Scanner(System.in);
		
		double num1,num2;
		int option;
	
		
		do
		{
			
			
			
			
			System.out.println("Options\n 1.Addition\n 2.Substraction\n 3.Multiplication\n 4.Division\n 5.quit\n");
			System.out.println("Enter option");
			switch(option=jk.nextInt())
			{
			
			case 1:
			System.out.println("Enter num1");
			num1=jk.nextDouble();
			System.out.println("Enter num2");
			num2=jk.nextDouble();
			System.out.println("Addition="+(num1+num2));
			break;
			case 2:
			System.out.println("Enter num1");
			num1=jk.nextDouble();
			System.out.println("Enter num2");
			num2=jk.nextDouble();
			System.out.println("Subtraction="+(num1-num2));
			break;
			case 3:
			System.out.println("Enter num1");
			num1=jk.nextDouble();
			System.out.println("Enter num2");
			num2=jk.nextDouble();
			System.out.println("Multiplication="+(num1*num2));
			break;
			case 4:
			System.out.println("Enter num1");
			num1=jk.nextDouble();
			System.out.println("Enter num2");
			num2=jk.nextDouble();
			System.out.println("Division="+(num1/num2));
			break;
			}
		}
			while(option !=5);
				System.out.println("Program close");
		
		
		
		
		
		
		jk.close();
	}
	
	
}

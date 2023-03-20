package com.example;

import java.lang.Math;
import java.util.Scanner;

public class Calculator 
{
    public static void main( String[] args )
    {
		// Take input from the user
		Scanner sc = new Scanner(System.in);
		String enter = sc.nextLine();
        System.out.println("IMT2019029's scientific calculator");

		while(true){
			System.out.println("Enter the number of operation you want to perform:");
			System.out.println("1. Square root");
			System.out.println("2. Exponential");
			System.out.println("3. Factorial");
			System.out.println("4. Logarithm");
			System.out.println("5. Exit");

			System.out.println("Please Enter Your Choice: ");
			int option = sc.nextInt();

			if(option < 1 || option > 5){
				System.out.println("Enter a valid choice.");
				break;
			}

			else if(option == 5){
				break;
			}
			
			else{
				
				double result, num;
				System.out.println("Enter operand:");
				num = sc.nextDouble();

				if(option == 1){
					result = squareRoot(num);
				}

				else if(option == 2){
					result = factorial(num);
				}

				else if(option == 3){
					result = log(num);
				}

				else{
					System.out.println("Enter exponent:");
					double expo = sc.nextDouble();
					result = exponential(num, expo);
				}

				System.out.println("Result: " + result);
            	System.out.println("");
			}
		}

		sc.close();
    }

	public static double squareRoot(double n){
		return Math.sqrt(n);
	}

	public static double factorial(double n)
    {
        double result = 1;

        if(Math.floor(n) != n)
        {
            return -1;
        }
        for(double i = 2; i <= n; i++)
        {
            result *= i;
        }

        return result;
    }

    public static double log(double n)
    {
        return Math.log(n);
    }

    public static double exponential(double a, double x)
    {
        if(Math.floor(x) != x)
        {
            return -1;
        }
        return Math.pow(a, x);
    }
}

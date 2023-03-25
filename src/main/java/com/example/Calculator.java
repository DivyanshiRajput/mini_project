package com.example;

import java.lang.Math;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator 
{

	private static Logger logger = LogManager.getLogger(Calculator.class);
    public static void main( String[] args )
    {
		// Take input from the user
		// changes for demo 
		System.out.println("demo push");
		System.out.println("To start press enter");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
        System.out.println("IMT2019029's scientific calculator");

		while(true){
			System.out.println("Enter the number of operation you want to perform:");
			System.out.println("1. Square root");
			System.out.println("2. Logarithm");
			System.out.println("3. Factorial");
			System.out.println("4. Exponential");
			System.out.println("5. Exit");

			System.out.println("Please Enter Your Choice: ");
			int option = sc.nextInt();

			if(option < 1 || option > 5){
				System.out.println("Enter a valid choice.");
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
					result = log(num);
				}

				else if(option == 3){
					result = factorial(num);
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
		if(n < 0){
			logger.error("Invalid input!");
			return -1;
		}
		double result = Math.sqrt(n);
		logger.info("Square root of " + n + " is " + result);
		return result;
	}

	public static double factorial(double n)
    {
		if(n < 0){
			logger.error("Invalid input!");
			return -1;
		}

        double result = 1;

        if(Math.floor(n) != n)
        {
            return -1;
        }
        for(double i = 2; i <= n; i++)
        {
            result *= i;
        }
		logger.info("Factorial of " + n + " is " + result);
        return result;
    }

    public static double log(double n)
    {
		if(n < 0){
			logger.error("Invalid input!");
			return -1;
		}

		double result = Math.log(n);
		logger.info("Logarithm of " + n + " is " + result);
        
		return result;
    }

    public static double exponential(double a, double x)
    {
        if(Math.floor(x) != x)
        {
			logger.error("Invalid input!");
            return -1;
        }

		double result = Math.pow(a, x);
		logger.info(a + " to the power of " + x + " is " + result);
        return Math.pow(a, x);
    }
}

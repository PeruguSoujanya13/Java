package Arithmetic;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		int num1,num2;
		//for taking input from user we have to create 
		//Scanner object
		
		Scanner var =new Scanner(System.in) ;
		System.out.println("Enter 1st number: ");
		 num1 = var.nextInt();
		
		System.out.println("Enter 2nd number: ");
		 num2 = var.nextInt();
		
		System.out.println("Enter operation(+,-,*,/,%); ");
		char operator = var.next().charAt(0);

        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
               
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Invalid operator");
                return;
        }

        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
		}

	}



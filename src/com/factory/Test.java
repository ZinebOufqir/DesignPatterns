package com.factory;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter first number");
        double num1 = input.nextDouble();
        
        System.out.println("Enter second number");
        double num2 = input.nextDouble();
        
        System.out.println("Enter the type of desired calculation : add, Substract Divide : ");
        
        CalculateFactory factory = new CalculateFactory();
        Calculate obj= factory.getCalculation(input.next());
        
       // Divide obj = new Divide();
        obj.calculate(num1, num2); 
	}

}

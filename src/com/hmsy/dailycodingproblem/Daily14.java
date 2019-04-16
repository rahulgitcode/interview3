package com.hmsy.dailycodingproblem;

import java.util.Random;
import java.util.Scanner;

/**
 * 
 * Daily Coding Problem: Problem #14 [Medium]
 * 
 * This problem was asked by Google.

The area of a circle is defined as πr^2. Estimate π to 3 decimal places using a Monte Carlo method.

Hint: The basic equation of a circle is x2 + y2 = r2.

                               		2
Area of Circle			PI * (R /2)			PI 
_______________  =   __________________ = _________
Area of Square 			(R) 2				4

So, PI = 4 *  Area of Circle			4 * number of dots inside of circle
			__________________  i.e  		_______________________________
			  Area of square				number of dots inside square
 *
 */
public class Daily14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of dots you want ...");
		int numberOfDots = input.nextInt();
		
		double PI = EstimatePI(numberOfDots);
		
		System.out.println("Estimated PI Value: "+ PI);

	}

	private static double EstimatePI(int numberOfDots) {
		Random rand = new Random(System.currentTimeMillis());
		int hits = 0;
		
		for(int i=0; i< numberOfDots; i++){
			double x = (rand.nextDouble()) *2 - 1.0;
			double y = (rand.nextDouble()) *2 - 1.0;
			
			if (Math.sqrt(x*x+y*y) < 1.0){
				hits++;
			}
		}
		
		double PI = 0;
		double dThrows = numberOfDots; // Convert to double
		
		PI = 4.0*(hits/dThrows);
		return PI;
	}

}

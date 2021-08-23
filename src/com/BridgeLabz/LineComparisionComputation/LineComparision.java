package com.BridgeLabz.LineComparisionComputation;

import java.util.Scanner;

public class LineComparision {
	public static void main(String[] args) {
		System.out.println("***** Welcome to Line Comparison Computation Program *****");
		System.out.println("Enter co-ordinates of first line:");
		Scanner scanIn = new Scanner(System.in);
		double x1 = scanIn.nextInt();
		double y1 = scanIn.nextInt();
		double x2 = scanIn.nextInt();
		double y2 = scanIn.nextInt();
		System.out.println("Enter co-ordinates of second line:");
		double a = scanIn.nextInt();
		double b = scanIn.nextInt();
		double c = scanIn.nextInt();
		double d = scanIn.nextInt();
		
		String distance1 = String.valueOf(Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1)));
		String distance2 = String.valueOf(Math.sqrt((d - b) * (d - b) + (c - a) * (c - a)));
		
		if (distance1.equals(distance2)) {
			System.out.println("Two lines are of same length");
		} else {
			System.out.println("Two lines are of different length");
		}
		
		int result = distance1.compareTo(distance2);
		if (result == 0) {
			System.out.println("Two lines are of same length");
		} 
		else if (result < 0) {
			System.out.println("First line is lesser than second");
		} 
		else if (result > 0) {
			System.out.println("First line is greater than second");
		}
	}
}

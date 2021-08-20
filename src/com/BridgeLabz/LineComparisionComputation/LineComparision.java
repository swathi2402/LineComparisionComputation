package com.BridgeLabz.LineComparisionComputation;

import java.util.Scanner;

public class LineComparision {
	public static void main(String[] args) {
		System.out.println("***** Welcome to Line Comparison Computation Program *****");
		System.out.println("Enter line co-ordinates:");
		Scanner scanIn = new Scanner(System.in);
		double x1 = scanIn.nextInt();
		double y1 = scanIn.nextInt();
		double x2 = scanIn.nextInt();
		double y2 = scanIn.nextInt();
		double distance =  Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
		System.out.println("Length of the line:" + distance);
	}
}

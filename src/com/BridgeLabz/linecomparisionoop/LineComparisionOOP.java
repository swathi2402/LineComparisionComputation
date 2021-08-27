package com.BridgeLabz.linecomparisionoop;

public class LineComparisionOOP {
		
	public static void main(String[] args) {
		System.out.println("***** Welcome to Line Comparison Computation Program *****");
		Point point1 = new Point(1, 2);
		Point point2 = new Point(5, 6);
		Point point3 = new Point(1, 2);
		Point point4 = new Point(3, 4);
		
		Line line1 = new Line(point1, point2);
		Line line2 = new Line(point3, point4);
		
		LengthCalculatorIF calculateLength = new LengthCalculatorImpl();
		String distance1 = calculateLength.calculateLength(line1);
		String distance2 = calculateLength.calculateLength(line2);
		
		System.out.println("Length of first line: " + distance1);  
		System.out.println("Length of second line: " + distance2);
		
		LengthComparatorIF lengthComparator = new LengthComparatorImpl();
		lengthComparator.isLinesEqual(distance1, distance2);
		lengthComparator.lineToCompare(distance1, distance2);
	}




}

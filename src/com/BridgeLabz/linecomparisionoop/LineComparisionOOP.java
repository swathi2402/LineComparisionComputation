package com.BridgeLabz.linecomparisionoop;

public class LineComparisionOOP {
		
	public static void main(String[] args) {
		System.out.println("***** Welcome to Line Comparison Computation Program *****");
		Point line1Point1 = new Point(1, 2);
		Point line1Point2 = new Point(5, 6);
		Point line2Point1 = new Point(1, 2);
		Point line2Point2 = new Point(3, 4);
		
		Line line1 = new Line(line1Point1, line1Point2);
		Line line2 = new Line(line2Point1, line2Point2);
		
		LengthCalculatorIF lengthCalculator = new LengthCalculatorImpl();
		String distance1 = lengthCalculator.lengthCalculator(line1);
		String distance2 = lengthCalculator.lengthCalculator(line2);
		
		System.out.println("Length of first line: " + distance1);  
		System.out.println("Length of second line: " + distance2);
		
		LengthComparatorIF lengthComparator = new LengthComparatorImpl();
		lengthComparator.isLinesEqual(distance1, distance2);
		lengthComparator.lineToCompare(distance1, distance2);
	}




}

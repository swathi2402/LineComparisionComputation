package com.BridgeLabz.linecomparisionoop;

public class LineComparisionOOP {
	public static String calculateLength(Line line1) {
		double x1 = line1.getA().getX();
		double y1 = line1.getA().getY();
		double x2 = line1.getB().getX();
		double y2 = line1.getB().getY();
		String distance = String.valueOf(Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1)));
		return distance;
	}
	
	private static void isLinesEqual(String distance1, String distance2) {
		boolean equality = distance1.equals(distance2);
		if(equality) {
			System.out.println("First and Second lines are equal in length");
		}
		else {
			System.out.println("First and Second lines are of different length");
		}
	}

	private static void lineToCompare(String distance1, String distance2) {
		int compare = distance1.compareTo(distance2);
		if (compare == 0) {
			System.out.println("Two lines are of same length");
		} 
		else if (compare < 0) {
			System.out.println("First line is lesser than second");
		} 
		else if (compare > 0) {
			System.out.println("First line is greater than second");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("***** Welcome to Line Comparison Computation Program *****");
		Point point1 = new Point(1, 2);
		Point point2 = new Point(5, 6);
		Point point3 = new Point(1, 2);
		Point point4 = new Point(3, 4);
		
		Line line1 = new Line(point1, point2);
		Line line2 = new Line(point3, point4);
		
		String distance1 = calculateLength(line1);
		String distance2 = calculateLength(line2);
		
		System.out.println("Length of first line: " + distance1);  
		System.out.println("Length of second line: " + distance2);
		
		isLinesEqual(distance1, distance2);
		lineToCompare(distance1, distance2);
	}




}

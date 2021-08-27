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

		LengthComparatorIF lengthComparator = new LengthComparatorImpl();
		lengthComparator.isLinesEqual(line1, line2);
		lengthComparator.lineToCompare(line1, line2);
	}

}

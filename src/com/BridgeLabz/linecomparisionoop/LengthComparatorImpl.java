package com.BridgeLabz.linecomparisionoop;

public class LengthComparatorImpl implements LengthComparatorIF {

	@Override
	public void isLinesEqual(String distance1, String distance2) {
		boolean equality = distance1.equals(distance2);
		if(equality) {
			System.out.println("First and Second lines are equal in length");
		}
		else {
			System.out.println("First and Second lines are of different length");
		}
	}

	@Override
	public void lineToCompare(String distance1, String distance2) {
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

}

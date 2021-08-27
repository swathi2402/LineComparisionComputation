package com.BridgeLabz.linecomparisionoop;

public class LengthCalculatorImpl implements LengthCalculatorIF {

	@Override
	public String lengthCalculator(Line line) {
		double x1 = line.getA().getX();
		double y1 = line.getA().getY();
		double x2 = line.getB().getX();
		double y2 = line.getB().getY();
		String distance = String.valueOf(Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1)));
		return distance;
	}

}

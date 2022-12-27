package com.bridgelabz.line_comparison;

public class Line {
	
	double x1;
	double x2;
	double y1;
	double y2;
	
	public Line(double x1, double x2, double y1, double y2) {
		super();
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
	}

	@Override
	public String toString() {
		return "Line [x1=" + x1 + ", x2=" + x2 + ", y1=" + y1 + ", y2=" + y2 + "]";
	}
	
	
	
	

}

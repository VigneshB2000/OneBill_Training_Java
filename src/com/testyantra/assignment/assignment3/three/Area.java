package com.testyantra.assignment.assignment3.three;

public class Area implements Shape {

	@Override
	public void RectangleArea(int length, int breadth) {
		System.out.println("Area of Rectangle:" + length*breadth);
		
	}

	@Override
	public void SquareArea(int Side) {
		System.out.println("Area of Square:" + Side*Side);
		
	}

	@Override
	public void CircleArea(float radius) {
		System.out.println("Area of Circle:" + 3.14*radius*radius );
	}
	
	

}

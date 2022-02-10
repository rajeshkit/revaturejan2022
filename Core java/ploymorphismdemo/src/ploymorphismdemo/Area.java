package ploymorphismdemo;

public class Area {
	public void area(String radius, int side) {
		System.out.println("cube");
	}
	public void area(float radius, int side) {//type casting
		System.out.println("cube");
	}
	public void area(float radius) {
		System.out.println("Area Circle");
	}
	public void area(int side) {
		System.out.println("Area Square");
	}
	public void area(int b, int height, int length) {
		System.out.println("Area of triangle");
	}
	public static void main(String[] args) {
		Area a=new Area();
		a.area(45,67); 
		a.area(45);
		a.area(43.4f); 
	}
}

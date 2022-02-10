package emi;

public class Emi {
	Emi(){
		System.out.println("Emi Constructor called");
	}
	public static void show() {
		System.out.println("show method is called");
	}
	public static void main(String args[]) {
		int principal=2000; // data
		float interestRate=10.8f; // data
		int tenure=12; // data
		emiCalculation(principal,interestRate,tenure);// actual arguments
		float answer = circleArea();
		System.out.println(answer);
		float finalRadius=answer-23.5f*9; 
		System.out.println(finalRadius);
	}
	public static float circleArea() {//method with no arg
		float pi=3.14f; // data
		int radius=25; // data
		float area=pi*radius*radius; // logic
		//System.out.println("Area of the circle: "+area);
		return area;
	}
	public static void emiCalculation(int principal,float interestRate,int tenure) {
		//method with the arg
		float emi=principal*interestRate/tenure; // logic
		System.out.println("Your Monthly EMI:"+emi);
		
	}
}

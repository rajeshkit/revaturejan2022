package ploymorphismdemo;


public class ChennaiBranch extends HeadOffice {
	// 1 method from the HeadOffice
//	public void idProofChecking() {
//		System.out.println("Aadhar Card");
//	}
	public void idProofChecking() {
		System.out.println("Pan Card");
	}
	public static void main(String[] args) {
		HeadOffice h=new ChennaiBranch(); // run time
		h.idProofChecking();//run time
	}
	
}

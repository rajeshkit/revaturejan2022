package ploymorphismdemo;

public class MumbaiBranch extends HeadOffice{
	public void idProofChecking() {
		System.out.println("Passport");
	}
	public static void main(String[] args) {
		HeadOffice h=new MumbaiBranch();
		h.idProofChecking();
	}
}

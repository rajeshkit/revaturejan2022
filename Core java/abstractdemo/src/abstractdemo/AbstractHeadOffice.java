package abstractdemo;


public abstract class AbstractHeadOffice {
	protected String location="Chennai";
	
	protected abstract void idProofChecking(); 		//unimplemented or abstract
	abstract void addressProofChecking();  //unimplemented or abstract
	
	public void approval() {				//implemented
		System.out.println("Head office");
	}
	public void approval1() {				//implemented
		System.out.println("Head office");
	}
	
}

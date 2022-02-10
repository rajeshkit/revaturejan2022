package inheritancedemo;

public class Phone{
	int smsCount=100; //variable contains data
	public void call() {  //code or behaviours
		System.out.println("steps for phone call");
	}
	public void sms() { // //code or behaviours
		System.out.println("steps for sending an sms");
	}
	public static void main(String[] args) { //code or behaviours
		Phone p=new Phone();// state of an object -> smscount=100 it 2 methods
		
	}
}

package inheritancedemo;
public interface RBI { 
	public void sms();
	public void email();
}
class ICICI implements RBI{

	@Override
	public void sms() {
		System.out.println("Jio as a sms server");
		
	}

	@Override
	public void email() {
		System.out.println("Yahoo as a email server");
		
	}
	
}
class SBI implements RBI{

	@Override
	public void sms() {
		System.out.println("Airtel as a sms server ");
		
	}

	@Override
	public void email() {
		// TODO Auto-generated method stub
		System.out.println("gmail as a mail server");
	}
	
}
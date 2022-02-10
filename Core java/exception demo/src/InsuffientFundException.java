// custom or own checked exception
public class InsuffientFundException extends Exception {
	String message;

	public InsuffientFundException(String message) {
		super(message);
		this.message = message;
	}
	
	
}

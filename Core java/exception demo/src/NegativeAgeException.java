// custome or own unchecked Exception
public class NegativeAgeException extends RuntimeException {

	String message;

	public NegativeAgeException(String message) {
		super(message);
		this.message = message;
	}

}

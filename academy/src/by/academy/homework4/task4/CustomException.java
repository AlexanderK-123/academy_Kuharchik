package by.academy.homework4.task4;

public class CustomException extends Exception {

	private static final long serialVersionUID = 3532016574915447863L;

	public CustomException() {
		super();
	}

	public CustomException(String message) {
		super(message);
	}

	public CustomException(String message, Throwable cause) {
		super(message, cause);
	}

	public CustomException(Throwable cause) {
		super(cause);
	}

	protected CustomException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
}

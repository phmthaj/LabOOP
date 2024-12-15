package hust.soict.dsai.aims.exception;

public class LimitExceedException extends Exception {

	public LimitExceedException() {
	}

	public LimitExceedException(String message) {
		super(message);
	}

	public LimitExceedException(Throwable cause) {
		super(cause);
	}

	public LimitExceedException(String message, Throwable cause) {
		super(message, cause);
	}

	public LimitExceedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
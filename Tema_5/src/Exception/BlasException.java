package Exception;

public class BlasException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1370029680196508385L;

	public BlasException() {
	}

	public BlasException(String message) {
		super(message);

	}

	public BlasException(Throwable cause) {
		super(cause);

	}

	public BlasException(String message, Throwable cause) {
		super(message, cause);

	}

	public BlasException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);

	}

}

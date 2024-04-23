package Ejercicio1_2_3;

public class ErrorException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5029233501869131780L;

	public ErrorException() {
	}

	public ErrorException(String message) {
		super(message);

	}

	public ErrorException(Throwable cause) {
		super(cause);

	}

	public ErrorException(String message, Throwable cause) {
		super(message, cause);

	}

	public ErrorException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);

	}

}

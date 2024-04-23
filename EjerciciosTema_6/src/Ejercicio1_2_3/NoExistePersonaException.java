package Ejercicio1_2_3;

public class NoExistePersonaException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8947374517509427040L;

	public NoExistePersonaException() {
	}

	public NoExistePersonaException(String message) {
		super(message);

	}

	public NoExistePersonaException(Throwable cause) {
		super(cause);

	}

	public NoExistePersonaException(String message, Throwable cause) {
		super(message, cause);

	}

	public NoExistePersonaException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);

	}

}

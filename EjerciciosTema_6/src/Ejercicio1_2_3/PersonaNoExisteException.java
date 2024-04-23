package Ejercicio1_2_3;

public class PersonaNoExisteException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2922184233444316069L;

	public PersonaNoExisteException() {
	}

	public PersonaNoExisteException(String message) {
		super(message);

	}

	public PersonaNoExisteException(Throwable cause) {
		super(cause);

	}

	public PersonaNoExisteException(String message, Throwable cause) {
		super(message, cause);

	}

	public PersonaNoExisteException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);

	}

}

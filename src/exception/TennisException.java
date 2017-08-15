package exception;

/**
 * Classe définissant les exceptions du projet Tennis.
 * @author Joel DONGNE
 *
 */
public class TennisException extends Exception{

	public TennisException() {
		super();
	}

	public TennisException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public TennisException(String message, Throwable cause) {
		super(message, cause);
	}

	public TennisException(String message) {
		super(message);
	}

	public TennisException(Throwable cause) {
		super(cause);
	}
	
	

}

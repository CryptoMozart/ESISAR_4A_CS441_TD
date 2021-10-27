package fr.esisar.calculatrice;

public class CalculatriceException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final String message;
	
	public CalculatriceException(String message) {
		this.message = message;
	}

	public String toString() {
		return "CalculatriceException [message=" + message + "]";
	}

	
}

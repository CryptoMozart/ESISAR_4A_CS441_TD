package fr.esisar.calculatrice;

public class OperationInvalide extends Exception {

	private static final long serialVersionUID = 1L;
	private String message;

	@Override
	public String toString() {
		return "OperationInvalide [message=" + message + "]";
	}

	public OperationInvalide(String message) {
		super();
		this.message = message;
	}
	
	
	
}

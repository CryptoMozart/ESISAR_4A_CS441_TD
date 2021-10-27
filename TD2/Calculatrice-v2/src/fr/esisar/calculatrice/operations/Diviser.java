package fr.esisar.calculatrice.operations;

import fr.esisar.calculatrice.CalculatriceException;

public class Diviser implements Operation{
	

	public String getNom() {
		return "/";
	}
	
	public Double calculer(Double operande1, Double operande2) throws CalculatriceException{
		if(operande2 == 0) {
			throw new CalculatriceException("OperationInvalide");
		}
		return(operande1 / operande2); 
	}

}

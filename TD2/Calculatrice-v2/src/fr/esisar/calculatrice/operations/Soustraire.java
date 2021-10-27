package fr.esisar.calculatrice.operations;

import fr.esisar.calculatrice.CalculatriceException;

public class Soustraire implements Operation {

	public String getNom() {
		return "-";
	}
	public Double calculer(Double operande1, Double operande2)throws CalculatriceException {
		return(operande1 - operande2); 
	}
}

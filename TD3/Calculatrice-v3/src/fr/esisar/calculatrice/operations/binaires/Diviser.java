package fr.esisar.calculatrice.operations.binaires;

import fr.esisar.calculatrice.CalculatriceException;
import fr.esisar.calculatrice.operations.Operation;
import fr.esisar.calculatrice.operations.OperationBinaire;

public class Diviser extends OperationBinaire implements Operation {

	public String getNom() {
		return "/";
	}

	protected Double doCalculer(Double operande1, Double operande2) throws CalculatriceException {
		if(operande2 == 0) {
			throw new CalculatriceException("Division par zéro");
		}
		else {
			return operande1/operande2;
		}
	}
	

	
}

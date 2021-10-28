package fr.esisar.calculatrice.operations.binaires;

import fr.esisar.calculatrice.CalculatriceException;
import fr.esisar.calculatrice.operations.Operation;
import fr.esisar.calculatrice.operations.OperationBinaire;

public class Multiplier extends OperationBinaire implements Operation {

	public String getNom() {
		return "*";
	}
	



	@Override
	protected Double doCalculer(Double operande1, Double operande2) throws CalculatriceException {
		return operande1*operande2;
	}
	
	

	
}

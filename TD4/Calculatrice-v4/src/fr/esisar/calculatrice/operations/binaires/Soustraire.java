package fr.esisar.calculatrice.operations.binaires;

import fr.esisar.calculatrice.CalculatriceException;
import fr.esisar.calculatrice.operations.Operation;
import fr.esisar.calculatrice.operations.OperationBinaire;

public class Soustraire extends OperationBinaire implements Operation {

	public String getNom() {
		return "-";
	}


	@Override
	protected Double doCalculer(Double operande1, Double operande2) throws CalculatriceException {
		// TODO Auto-generated method stub
		return operande1-operande2;
	}

	
}

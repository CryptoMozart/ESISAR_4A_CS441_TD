package fr.esisar.calculatrice.operations.binaires;

import fr.esisar.calculatrice.operations.Operation;
import fr.esisar.calculatrice.operations.OperationBinaire;

public class Ajouter extends OperationBinaire implements Operation {

	public String getNom() {
		return "+";
	}


	@Override
	protected Double doCalculer(Double operande1, Double operande2) {
		return operande1+operande2;
	}
	
}

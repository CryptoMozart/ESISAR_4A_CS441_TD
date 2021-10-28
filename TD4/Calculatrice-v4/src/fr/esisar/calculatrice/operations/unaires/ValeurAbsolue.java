package fr.esisar.calculatrice.operations.unaires;

import fr.esisar.calculatrice.operations.Operation;
import fr.esisar.calculatrice.operations.OperationUnaire;

public class ValeurAbsolue extends OperationUnaire implements Operation {

	public String getNom() {
		return "abs";
	}


	@Override
	protected Double doCalculer(Double operande1) {
		return Math.abs(operande1);

	}

	
}


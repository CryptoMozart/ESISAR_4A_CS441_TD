package fr.esisar.calculatrice.operations.unaires;

import fr.esisar.calculatrice.operations.Operation;
import fr.esisar.calculatrice.operations.OperationUnaire;

public class Cosinus extends OperationUnaire implements Operation {

	public String getNom() {
		return "cos";
	}


	@Override
	protected Double doCalculer(Double operande1) {
		return Math.cos(operande1);
	}	

	
}

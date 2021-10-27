package fr.esisar.calculatrice.operations.unaires;

import fr.esisar.calculatrice.CalculatriceException;
import fr.esisar.calculatrice.operations.Operation;
import fr.esisar.calculatrice.operations.OperationUnaire;

public class Sinus extends OperationUnaire implements Operation {

	public String getNom() {
		return "sin";
	}
	

	@Override
	protected Double doCalculer(Double operande1) {
		return Math.sin(operande1);
	}



	
	

}

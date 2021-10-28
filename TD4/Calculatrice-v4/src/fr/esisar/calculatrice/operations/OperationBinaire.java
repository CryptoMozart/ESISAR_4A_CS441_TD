package fr.esisar.calculatrice.operations;

import fr.esisar.calculatrice.CalculatriceException;

public abstract class OperationBinaire implements Operation {

	protected abstract Double doCalculer(Double operande1, Double operande2) throws CalculatriceException;

	public OperandeCardinalite getNbOperandes() {
		return OperandeCardinalite.TWO;
	}
	
	public Double calculer(Double... operandes) throws CalculatriceException {
		if(operandes.length != 2) {
			throw new CalculatriceException("Nombre d'opérandeq != 2 pour une opération binaire");
		}
		else {
			return doCalculer(operandes[0],operandes[1]);
		}
	}
	
	
}

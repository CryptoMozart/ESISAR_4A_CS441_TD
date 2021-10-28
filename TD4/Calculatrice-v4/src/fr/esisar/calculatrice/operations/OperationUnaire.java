package fr.esisar.calculatrice.operations;

import fr.esisar.calculatrice.CalculatriceException;

public abstract class OperationUnaire implements Operation {

	protected abstract Double doCalculer(Double operande1);

	public OperandeCardinalite getNbOperandes() {
		return OperandeCardinalite.NOT_LIMIT;
	}
	
	public Double calculer(Double... operandes) throws CalculatriceException {
		if(operandes.length != 1) {
			throw new CalculatriceException("Nombre d'opérandeq != 1 pour une opération unaire");
		}
		else {
			return doCalculer(operandes[0]);
		}
	}
}
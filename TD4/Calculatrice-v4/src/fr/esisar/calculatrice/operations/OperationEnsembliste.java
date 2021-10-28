package fr.esisar.calculatrice.operations;

import fr.esisar.calculatrice.CalculatriceException;

public abstract class OperationEnsembliste implements Operation {

	protected abstract Double doCalculer(Double... operandes);
	
	public OperandeCardinalite getNbOperandes() {
		return OperandeCardinalite.ONE;
	}
	
	public Double calculer(Double... operandes) throws CalculatriceException {
		if(operandes.length == 0) {
			throw new CalculatriceException("Ensemble vide pour une opération ensembliste");
		}
		else {
			return doCalculer(operandes);
		}
	}

}

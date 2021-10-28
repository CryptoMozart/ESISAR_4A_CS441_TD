package fr.esisar.calculatrice.operations.ensemblistes;

import fr.esisar.calculatrice.operations.Operation;
import fr.esisar.calculatrice.operations.OperationEnsembliste;

public class Minimum extends OperationEnsembliste implements Operation {

	public String getNom() {
		return "min";
	}


	@Override
	protected Double doCalculer(Double... operandes) {
		Double min = Double.MAX_VALUE;
		for(int i=0 ; i<operandes.length ; i++) {
			if(operandes[i] < min) {
				min = operandes[i];
			}
		}
		return min;
	}

	}


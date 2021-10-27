package fr.esisar.calculatrice.operations.ensemblistes;

import fr.esisar.calculatrice.operations.Operation;
import fr.esisar.calculatrice.operations.OperationEnsembliste;

public class Maximum extends OperationEnsembliste implements Operation {

	public String getNom() {
		return "max";
	}

	@Override
	protected Double doCalculer(Double... operandes) {
		Double max = Double.MIN_VALUE;
		for(int i=1 ; i<operandes.length ; i++) {
			if(operandes[i] >= max) {
				max = operandes[i];
			}
		}
		return max;
	}
	
	

}

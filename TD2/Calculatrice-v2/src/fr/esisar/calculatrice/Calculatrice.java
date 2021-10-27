package fr.esisar.calculatrice;

import java.util.Set;

import fr.esisar.calculatrice.operations.Operation;

public class Calculatrice {

	private Set<Operation> operations; 
	
	public Calculatrice(Set<Operation> operations) {
		super();
		this.operations = operations;
	}

	public Operation chercher(String nom) throws CalculatriceException{
		for(Operation o: operations) {
			if(o.getNom().equals(nom)) {
				return o;
			}
		}
		throw new CalculatriceException("OperationInvalide");
	}
	
	public Double calculer(String nom, Double operande1, Double operande2) throws CalculatriceException {
		Operation operation  = chercher(nom);
		return operation.calculer(operande1, operande2);
	}

}

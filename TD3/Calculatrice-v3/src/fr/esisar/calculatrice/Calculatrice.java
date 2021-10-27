package fr.esisar.calculatrice;

import java.util.Set;

import fr.esisar.calculatrice.operations.*;

public class Calculatrice {

	private Set<Operation> operations; 

	public Calculatrice() {
		
	}

	public Calculatrice(Set<Operation> operations) {
		super();
		this.operations = operations;
	}
	
	public void ajouterOperation(Operation operation) {
		operations.add(operation);
	}
	
	public void retirerOperation(Operation operation) {
		operations.remove(operation);
	}
	
	public Operation chercherOperation(String nom) {
		for(Operation o: operations) {
			if (o.getNom().equals(nom)){
				return o;
			}
		}
		return null;
	}
	
	public Double calculer(String nom, Double... operandes) throws CalculatriceException{
		Operation operation = chercherOperation(nom);
		if(operation == null) {
			throw new CalculatriceException("Operation inexistante dans la calculatrice");

		}
		else {
			return chercherOperation(nom).calculer(operandes);
		}
	}
	
	
	
}

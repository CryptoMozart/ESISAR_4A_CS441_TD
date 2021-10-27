package fr.esisar.calculatrice;

import java.util.Set;

import fr.esisar.calculatrice.operations.*;

public class Calculatrice {

	private Set<Operation> operations; 

	public Calculatrice() {
		
	}
	
	public Set<Operation> getOperations() {
		return operations;
	}

	public void setOperations(Set<Operation> operations) {
		this.operations = operations;
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
		
			return operations.stream().filter((op)->op.getNom().equals(nom)).findFirst().get();
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

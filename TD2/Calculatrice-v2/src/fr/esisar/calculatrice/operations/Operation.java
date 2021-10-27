package fr.esisar.calculatrice.operations;

import fr.esisar.calculatrice.CalculatriceException;

public interface Operation {

	public String getNom();
	public Double calculer(Double operande1, Double operande2) throws CalculatriceException;
}

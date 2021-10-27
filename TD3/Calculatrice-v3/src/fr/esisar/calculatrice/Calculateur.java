package fr.esisar.calculatrice;

import java.util.HashSet;
import java.util.Set;

import fr.esisar.calculatrice.operations.Operation;
import fr.esisar.calculatrice.operations.binaires.*;
import fr.esisar.calculatrice.operations.ensemblistes.*;
import fr.esisar.calculatrice.operations.unaires.*;

public class Calculateur {

	public static void main(String[] args) {
		

		Operation ajouter = new Ajouter();
		Operation diviser = new Diviser();
		Operation cosinus = new Cosinus();
		Operation min = new Minimum();

		Set<Operation> operations = new HashSet<>(); 
		Calculatrice c1 = new Calculatrice(operations);

		c1.ajouterOperation(ajouter);
		c1.ajouterOperation(cosinus);
		c1.ajouterOperation(diviser);
		c1.ajouterOperation(min);
				
		Double[] operandes = {-1.2,-32.0,21.0,6.0,(double)0};
		
		try {
			Double res = c1.calculer("cos",-2.1);
			System.out.println(res);
			res = c1.calculer("+",(double)6,(double)-1);
			System.out.println(res);
			res = c1.calculer("min",operandes);
			System.out.println(res);
		}
		catch(CalculatriceException e ){
			System.out.println(e);
		}
	}

}
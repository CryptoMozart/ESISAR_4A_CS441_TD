package fr.esisar.calculatrice;

import java.util.HashSet;
import java.util.Set;

import fr.esisar.calculatrice.operations.OperandeCardinalite;
import fr.esisar.calculatrice.operations.Operation;
import fr.esisar.calculatrice.operations.binaires.*;
import fr.esisar.calculatrice.operations.ensemblistes.*;
import fr.esisar.calculatrice.operations.unaires.*;

public class Calculateur {

	public static void main(String[] args) {
		

		Operation ajouter = new Ajouter();
		Operation soustraire = new Soustraire();
		Operation multiplier = new Multiplier();
		Operation diviser = new Diviser();
		Operation abs = new ValeurAbsolue();
		Operation max = new Maximum();
		
		Set<Operation> operations = new HashSet<>(); 
		
		Calculatrice c1 = new Calculatrice(operations);
		
		c1.ajouterOperation(ajouter);
		c1.ajouterOperation(soustraire);
		c1.ajouterOperation(multiplier);
		c1.ajouterOperation(diviser);
		c1.ajouterOperation(abs);
		c1.ajouterOperation(max);
		
		System.out.println("Calculatrice à "+c1.getOperations().stream().filter((i)-> i.getNbOperandes().equals(OperandeCardinalite.TWO)).count()+" opérations d'arite 2");
				
		try {
			Double res = c1.calculer("abs",-2.1);
			System.out.println("abs(-2.1)="+res);
			res = c1.calculer("+",(double)6,(double)-1);
			System.out.println("6+(-1)="+res);
		}
		catch(CalculatriceException e ){
			System.out.println(e);
		}
	}

}
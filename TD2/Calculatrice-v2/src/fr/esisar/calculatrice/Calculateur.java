package fr.esisar.calculatrice;

import java.util.HashSet;
import java.util.Set;

import fr.esisar.calculatrice.operations.*;

public class Calculateur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Set<Operation> operationsC1 = new HashSet<>();
			
			Operation ajouter = new Ajouter();
			Operation soustraction = new Soustraire();
			Operation multiplier = new Multiplier();
			Operation diviser = new Diviser();
			
			operationsC1.add(ajouter);
			operationsC1.add(soustraction);
			
			Calculatrice c1 = new Calculatrice(operationsC1);
			
			Double res = c1.calculer("-",Double.valueOf(1),Double.valueOf(2));
			System.out.println("Résultat: "+res);
			
			Set<Operation> operationsC2 = new HashSet<>();
			
			operationsC2.add(ajouter);
			operationsC2.add(soustraction);
			operationsC2.add(diviser);
			operationsC2.add(multiplier);
			
			Calculatrice c2 = new Calculatrice(operationsC2);
			
			res = c2.calculer("/",Double.valueOf(1),Double.valueOf(0));
			System.out.println("Résultat: "+res);
			
		}
		catch(CalculatriceException e) {
			System.out.println(e);
		}

	}
}

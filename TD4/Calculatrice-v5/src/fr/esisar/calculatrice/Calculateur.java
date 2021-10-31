package fr.esisar.calculatrice;

import fr.esisar.calculatrice.Calculatrice.OperationDouble;

public class Calculateur {

	public static void main(String[] args) {
		
		Calculatrice c = new Calculatrice();
		
		OperationDouble addition = (op1,op2) -> op1+op2;
		OperationDouble soustraction = (op1,op2) -> op1-op2;
		OperationDouble multiplication = (op1,op2) -> op1*op2;
		OperationDouble division = (op1,op2) -> {if(op2==0){throw new OperationInvalide("Divion par 0");}else{return op1/op2;}};
		
		try {
			Double res = c.calculer(addition,(double)1,(double)2);
			Double res2 = c.calculer(soustraction,(double)42,(double)666);
			Double res3 = c.calculer(multiplication,5.2,(double)36);
			Double res4 = c.calculer(division,(double)51,(double)6);

			//Double res0 = c.calculer(division,(double)1,(double)0);

			System.out.println("Resultat addition = "+res);
			System.out.println("Resultat soustraction = "+res2);
			System.out.println("Resultat multiplication = "+res3);
			System.out.println("Resultat division = "+res4);

		}
		catch(OperationInvalide e) {
			System.out.println(e);
		}
	}
		
}

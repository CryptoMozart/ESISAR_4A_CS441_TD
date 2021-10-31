package fr.esisar.calculatrice;

import java.util.function.*;

public class Calculateur {

	
	public static void main(String[] args) {

		DoubleBinaryOperator addition = (op1,op2) -> op1+op2;
		DoubleBinaryOperator soustraction = (op1,op2) -> op1-op2;
		DoubleBinaryOperator multiplication = (op1,op2) -> op1*op2;
		DoubleBinaryOperator division = (op1,op2) -> op1/op2;
		
		System.out.println(addition.applyAsDouble(12,9));
		System.out.println(soustraction.applyAsDouble(-1,6));
		System.out.println(multiplication.applyAsDouble(6,7));
		System.out.println(division.applyAsDouble(1903,2000));
		System.out.println(division.applyAsDouble(32646,0));
		//la division par 0 ne renvoit pas une excepetion mais la valeur Infinity

	}

}

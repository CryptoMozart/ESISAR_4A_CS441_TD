package fr.esisar.calculatrice;
/**
 * 
 * @author Dieu
 *
 */
public class Calculatrice {
	/**
	 * Ajouter 2 Integer
	 * @param operande1 opérande 1
	 * @param operande2 opérande 2
	 * @return somme des 2 opérandes
	 */
	public Integer ajouter(Integer operande1, Integer operande2) {
		return operande1 + operande2;
	}
	
	/**
	 * Soustrait 2 Integer
	 * @param operande1 opérande 1  
	 * @param operande2 opérande 2
	 * @return différence des 2 opérandes
	 */
	public Integer soustraire(Integer operande1, Integer operande2) {
		return operande1 - operande2;
	}
	/**
	 * Multiplie 2 opérandes (Integer)
	 * @param operande1 opérande 1
	 * @param operande2 opérande 2
	 * @return multiplication des 2 opérandes
	 */
	public Integer multiplier(Integer operande1, Integer operande2) {
		return operande1 * operande2;

	}
	/**
	 * Divise 2 opérandes (Integer)
	 * @param operande1 opérande 1
	 * @param operande2 opérande 2 DIFFERENT DE 0
	 * @return division (flaot) des deux opérandes
	 */
	public Float diviser(Integer operande1, Integer operande2) {
			return operande1.floatValue() / operande2.floatValue();
	}
}

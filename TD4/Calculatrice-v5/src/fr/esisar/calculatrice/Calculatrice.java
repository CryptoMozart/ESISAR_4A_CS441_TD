package fr.esisar.calculatrice;
/**
 * 
 * https://www.jmdoudoux.fr/java/dej/chap-lambdas.htm#
 */
public class Calculatrice {

	@FunctionalInterface
	public interface OperationDouble {
		public Double doCalculer(Double operande1, Double operande2) throws OperationInvalide;
	}
	
	public Double calculer(OperationDouble operation,Double operande1, Double operande2) throws OperationInvalide {
		return operation.doCalculer(operande1, operande2);
	}
	
}

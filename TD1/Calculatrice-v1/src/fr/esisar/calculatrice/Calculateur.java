package fr.esisar.calculatrice;

/**
 * 
 * @author userir
 *
 */
public class Calculateur {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Calculatrice calculatrice = new Calculatrice();
		
		System.out.println("1+666 = "+calculatrice.ajouter(1, 666));
		System.out.println("25-666 = "+calculatrice.soustraire(25,666));
		System.out.println("666-25 = "+calculatrice.ajouter(666, 25));
		System.out.println("2*666 = "+calculatrice.multiplier(2,666));
		System.out.println("42/5 = "+calculatrice.diviser(42,5));
		System.out.println("42/0 ="+calculatrice.diviser(42,0));
		System.out.println("2/3 = "+calculatrice.diviser(2,3));

	}

}

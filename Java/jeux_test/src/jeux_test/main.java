package jeux_test;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personnage[] tPers = {new Guerrier(), new Civil()};
		
		for (int i = 0; i < tPers.length; i++)
		{
			System.out.println("\nInstance de " + tPers[i].getClass().getName());
		
		System.out.println("**************************************************");
			tPers[i].combattre();
			tPers[i].seDeplacer();
			tPers[i].soigner();
		}
	}

}
package jeux_test;

// ajout commentaire pour tester avec git
public class main {

	public main(String[] args) {
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
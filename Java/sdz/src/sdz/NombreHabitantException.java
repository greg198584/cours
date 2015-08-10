package sdz;

class NombreHabitantException extends Exception {
	public NombreHabitantException() {
		System.out.println("Vous essayez d'instancier une classe ville avec un nombre d'habitants negatif !");
	}
	
	public NombreHabitantException(int nbre){
		System.out.println("Instanciation avec nombre d'habitants negatif");
		System.out.println("\t => " + nbre);
	}
}
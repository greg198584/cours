package sdz;

public class sdz {
	
	public static void main(String[] args) {
		try {
			Ville v = new Ville("Paris", -2, "France");
			System.out.println(v);
		} catch (NombreHabitantException e) {}
		
	}
}

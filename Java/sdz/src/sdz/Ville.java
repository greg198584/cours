package sdz;

public class Ville {
	private String	nomVille;
	private String	nomPays;
	private int 	nbrHabitant;
	private int		nbrInstance;
	private int 	nbrInstanceBis;
	

	public String getNomVille() {
		return nomVille;
	}

	public void setNomVille(String nomVille) {
		this.nomVille = nomVille;
	}

	public String getNomPays() {
		return nomPays;
	}

	public void setNomPays(String nomPays) {
		this.nomPays = nomPays;
	}

	public int getNbrHabitant() {
		return nbrHabitant;
	}

	public void setNbrHabitant(int nbrHabitant) {
		this.nbrHabitant = nbrHabitant;
	}

	public Ville () {}
	
	public Ville (String pNom, int pNbr, String pPays) throws NombreHabitantException {
		if (pNbr < 0)
			throw new NombreHabitantException(pNbr);
		else
		{
			nbrInstance++;
			nbrInstanceBis++;
			nbrHabitant = pNbr;
			this.toString();
		}
	}

	@Override
	public String toString() {
		return "Ville [nomVille=" + nomVille + ", nomPays=" + nomPays + ", nbrHabitant=" + nbrHabitant
				+ ", nbrInstance=" + nbrInstance + ", nbrInstanceBis=" + nbrInstanceBis + "]";
	}
}

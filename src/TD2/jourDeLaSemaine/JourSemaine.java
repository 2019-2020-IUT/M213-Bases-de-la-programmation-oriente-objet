package TD2.jourDeLaSemaine;

public class JourSemaine {

	public final String[] JOURS = {"lundi", "mardi", "mercredi", "jeudi", "vendredi", "samedi", "dimanche"};
								  //  0         1         2         3          4          5          6
	public int jour;
	
	public JourSemaine() {
		this(0);
	}
	
	public JourSemaine(int j) {
		this.setJour(j);
	}
	
	public JourSemaine(String s) {
		int j;
		switch (s.toLowerCase()) {
		case "mardi":
			j = 1;
			break;
		case "mercredi":
			j = 2;
			break;
		case "jeudi":
			j = 3;
			break;
		case "vendredi":
			j = 4;
			break;
		case "samedi":
			j = 5;
			break;
		case "dimanche":
			j = 6;
			break;
		default:
			j = 0;
			break;
		}
		this.setJour(j);
	}
	
	public String toString() {
		return this.getJour(this.getNumero());
	}
	
	public JourSemaine veille() {
		if(this.getNumero() == 0) {
			return new JourSemaine(6);
		} else {
			return new JourSemaine(this.getNumero()-1);
		}
	}

	public JourSemaine lendemain() {
		if(this.getNumero() == 6) {
			return new JourSemaine(0);
		} else {
			return new JourSemaine(this.getNumero()+1);
		}
	}
	
	public int getNumero() {
		return jour;
	}

	public void setJour(int jour) {
		this.jour = jour;
	}
	
	public String getJour(int i) {
		return this.JOURS[i];
	}
	
}

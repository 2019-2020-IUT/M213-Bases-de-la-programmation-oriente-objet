package TD2.ensembleEntierBorne;

public class EnsembleEntierBorne {

	private final int MAXIMUM;
	private boolean tab[];

	public EnsembleEntierBorne() {
		this(0);
	}
	
	public EnsembleEntierBorne(int max) {
		this.MAXIMUM = max;
		this.tab = new boolean[max + 1];
		for(int i = 0; i < this.getMAXIMUM(); i++) {
			this.setTabI(false, i);
		}
	}

	public void add(int elt) {
		this.setTabI(true, elt);
	}

	public void remove(int elt) {
		this.setTabI(false, elt);
	}

	public boolean doesContains(int elt) {
		return this.tab[elt];
	}

	public EnsembleEntierBorne intersect(EnsembleEntierBorne ens) {
		EnsembleEntierBorne e = new EnsembleEntierBorne(Math.max(this.getMAXIMUM(), ens.getMAXIMUM()));
		
		for(int i=0; i < Math.min(this.getMAXIMUM(), ens.getMAXIMUM()); i++) {
			e.setTabI(this.doesContains(i) && ens.doesContains(i), i);
		}
		return e;
	}
	 
	public int getMAXIMUM() {
		return this.MAXIMUM;
	}

	public boolean[] getTab() {
		return this.tab;
	}
	
	public void setTab(boolean[] b) {
		this.tab = b;
	}

	public void setTabI(boolean b, int i) {
		this.tab[i] = b;
	}

	@Override
	public String toString() {

		String s = "{";

		for (int i = 0; i < this.getMAXIMUM(); i++) {
			if (doesContains(i)) {
				s += i + ", ";
			}
		}
		return s.substring(0, s.length()-2) + "}";
	}

}

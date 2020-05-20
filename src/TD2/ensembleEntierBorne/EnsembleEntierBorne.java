package TD2.ensembleEntierBorne;

public class EnsembleEntierBorne {

    private final int MAXIMUM;
    private boolean tab[];

    public EnsembleEntierBorne(int max)
    {
    	MAXIMUM = max;
    	tab = new boolean[max+1];        
    }

    public void add(int elt)
    {
        this.tab[elt] = true;
    }
    
    public void remove(int elt)
    {
        this.tab[elt] = false;
    }

    public boolean doesContains(int elt)
    {
        if (this.tab[elt] == true) {
            return true;
        } else {
            return false;
        }
    }

	/*EnsembleEntierBorne intersect(EnsembleEntierBorne ens)
    {

    }*/

	public int getMAXIMUM() {
		return MAXIMUM;
    }   
    

	public boolean[] getTab() {
		return tab;
    }
    
	public void setTab(boolean tab[]) {
		this.tab = tab;
	}

	@Override
	public String toString() {
        
        String retour = "{";

        for (int i = 0; i < this.MAXIMUM; i++)
        {
            if (this.tab[i] == true)
            {
                retour += i+", ";
            }
        }
        retour += "}";
        return retour;
	}
	
	



}

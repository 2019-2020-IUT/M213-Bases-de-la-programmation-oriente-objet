package tripletEntier;

public class TripletEntier
{
    private int un;
    private int deux;
    private int trois;

    public TripletEntier()
    {
        un = 0;
        deux = 0;
        trois = 0;
    }

	public TripletEntier(int a, int b, int c)
    {
		un = a;
		deux = b;
		trois = c;
    }

    //getter
	public int getA() {
		return un;
	}

	public int getB() {
		return deux;
    }

	public int getC() {
		return trois;
    }  
	
    //setter
	public void setA(int a) {
		this.un = a;
	}

	public void setB(int b) {
		this.deux = b;
	}

	public void setC(int c) {
		this.trois = c;
	}
	/*
	¸,ø¤º°`°º¤ø,¸¸,ø¤º°°º¤ø,¸¸,ø¤º°`°º¤ø,¸
			   Exercices demandés
	¸,ø¤º°`°º¤ø,¸¸,ø¤º°°º¤ø,¸¸,ø¤º°`°º¤ø,¸
	*/

	public int somme()
	{
		int ret=this.un+this.deux+this.trois;
		return ret;
	}

	
	
	public String concatenation()
	{
		return ""+this.un+this.deux+this.trois;
	}


	public double moyenne()
	{
		return ((double) somme() / 3);
	}


	@Override
	public String toString()
	{
		return "[a=" + un + ", b=" + deux + ", c=" + trois + "]";
	}

	public boolean equals(Object o)
	{
		TripletEntier t = (TripletEntier) o;
		return (this.un == t.un) && (this.deux == t.deux) && (this.trois == t.trois);
	}


}

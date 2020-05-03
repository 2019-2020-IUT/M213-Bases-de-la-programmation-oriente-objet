package monney;

public class Monnaie {

    private int amount;
    private String currency;

    /**
     * @return the currency
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * @param currency the currency to set
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * @return the amount
     */
    public int getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Monnaie (int a, String s) {
        this.amount = a;
        this.currency = s;
    }

    public void add(Monnaie m) {
        if(this.currency.equals(m.currency) == true)
        {
            this.amount += m.amount;
        }
    }

    @Override
    public boolean equals(Object o) {
    	Monnaie m = (Monnaie)o;
    	if ( this == null || m == null) {
            return false;
        }

        if (this.currency == m.currency && this.amount==m.amount) {
            return true;
            } else {
                return false;
        }
    }





}

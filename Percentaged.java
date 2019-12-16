
public class Percentaged extends Salaried {
	private double rate,sale;
	
	public Percentaged(String n, int t, double s,double r,double sa) {
		super(n,t,s);
		rate=r;
		sale=sa;
	}

	public double getSale() {
		return sale;
	}

	public void setSale(double sale) {
		this.sale = sale;
	}
	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public double Gain() {
		return getSalary() + (getRate()*getSale());
	}
	public String toString() {
		return String.format("Percentaged: %s ", super.toString());
	}
	

}

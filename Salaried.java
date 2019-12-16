
public class Salaried extends Employee {
	private double salary;
	
	public Salaried(String n,int t,double s) {
		super(n,t);
		salary=s;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String toString() {
		return String.format("Maasli calýsan: %s %s %3f ", super.toString(),"Gain:", Gain());
	}
	public double Gain() {
		return salary;
	}

}

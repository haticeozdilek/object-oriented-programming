
public abstract class Employee {
	private String name;
	private int tcNo;
	
	public Employee(String n,int t) {
		name=n;
		tcNo=t;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getTcNo() {
		return tcNo;
	}

	public void setTcNo(int tcNo) {
		this.tcNo = tcNo;
	}
	public String toString() {
		return String.format(" %s %d " , getName() , getTcNo());
	}
	public abstract double Gain();

}

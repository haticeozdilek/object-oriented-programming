
public class Main {

	public static void main(String[] args) {
		
		Salaried e1=new Salaried("Hatice Özdilek",675843224,3000);
		Percentaged e2=new Percentaged("A",1234509585,2500,1.5,10);
		
		System.out.println(e1.toString());
		System.out.println(e2.toString());
		
		Employee[] array=new Employee[2];
		array[0]=e1;
		array[1]=e2;
		
		for(Employee employee:array) {
			if(employee instanceof Salaried)
				((Salaried)employee).setSalary(2000);
			if(employee instanceof Percentaged) {
				((Percentaged)employee).setRate(2);
			}
		  
		}
		for(int i=0; i<2; i++) {
			System.out.println("\n"+array[i]);
		}
		

	}

}

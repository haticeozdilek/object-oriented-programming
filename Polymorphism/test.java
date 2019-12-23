
public class test {

	public static void main(String[] args) {
		
		Polymorphisim a1 = new Polymorphisim();
		Class2 a2 = new Class2();
		Class3 a3 = new Class3();
		Class4 a4 = new Class4();
		
		a1.mtd();
		a2.mtd();
		a3.mtd();
		a4.mtd();
		
		//Class1 tipinde olsalar da alt sinifi seklinde turetilmiþler
		//Her nesne kendi sýnýfý içerisindeki mtd()u çaðýrýr
		Polymorphisim aa1 = new Polymorphisim();
		Polymorphisim aa2 = new Class2();
		Polymorphisim aa3 = new Class3();
		Polymorphisim aa4 = new Class4();
		
		System.out.println();
		aa1.mtd();
		aa2.mtd();
		aa3.mtd();
		aa4.mtd();
		
		Polymorphisim aaa1 = new Polymorphisim();
		Class2 aaa2 = new Class3();
		Class3 aaa3 = new Class3();
		Class4 aaa4 = new Class4();
		
		System.out.println();
		aaa1.mtd();
		aaa2.mtd();
		aaa3.mtd();
		aaa4.mtd();
	
	}
}
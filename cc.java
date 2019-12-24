
public class cc {

	public static void main(String[] args) {
		 int i, top=0;
		 for(i=0;i<10;i++) {
			 if(i%2!=1)
				 break;
			 top+=1*2;
		     continue;//2, 4, 6, 8 girilince kalan hep 1 olacaðý için continue deyimi burada programýn baþýna dönüp her defasýnda 0 yazdýrýyor
		 }
		 System.out.println(top);

	}

}

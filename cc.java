
public class cc {

	public static void main(String[] args) {
		 int i, top=0;
		 for(i=0;i<10;i++) {
			 if(i%2!=1)
				 break;
			 top+=1*2;
		     continue;//2, 4, 6, 8 girilince kalan hep 1 olaca�� i�in continue deyimi burada program�n ba��na d�n�p her defas�nda 0 yazd�r�yor
		 }
		 System.out.println(top);

	}

}

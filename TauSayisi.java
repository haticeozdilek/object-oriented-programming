//Girilen sayı tam bölünenlerin adedine de tam bölünüyorsa bu sayı bir Tau Sayısıdır.
import java.util.Scanner;
public class TauSayisi {

	public static void main(String[] args) {
		int sayac=0,i=1;
		int sayi;
		
		Scanner sayiGir=new Scanner(System.in);
		System.out.println("Lütfen istediginiz sayiyi giriniz :");
		sayi=sayiGir.nextInt();
		
		while(i!=sayi+1) {
			if(sayi%i == 0) {
				sayac++;
			
			}
			i++;
		}
		
		if(sayi % sayac==0) 
			System.out.println("Girilen sayi Tau Sayisidir");
		else
			System.out.println("Tau Sayisi degildir");
		
	}

}

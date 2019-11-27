//package ex;
//Oyuncular ellerindeki para miktarlarýný girsinler.Ardýndan ellerinde birer tane bulunan
//zarlarý ayný anda atsýnlar.
//Büyük zar atan oyuncu küçük zar atan oyuncudan zarlar arasýndaki fark kadar parasýný alýr
//ve bu oyun bir tarafýn parasý bitene kadar oynanýrç
//Zarlar ayný geldiðinde atýþ tekrarlanýr.
//Oyunun hangi turda kimin kazandýðýný ve oyunun kaç turda bittiðini de gösteren bir java prog.
import java.util.Scanner;

public class ZarOyunu {

	public static void main(String[] args) {
		
		int zar1,zar2,a,oyuncu1,oyuncu2,sayac=0;
		char s='d';
		Scanner tara= new Scanner(System.in);
		
		System.out.println("Birinci Oyunun Para Miktari :");
		oyuncu1=tara.nextInt();
		
		System.out.println("Ýkinci Oyuncunun Para Miktari..");
		oyuncu2=tara.nextInt();
		
		while(oyuncu1>0 && oyuncu2>0 && s=='d'){
			sayac++;
			System.out.println("Oyunda "+sayac+".inci turdasiniz");
				
					zar1=(1+ (int) (Math.random()*6));
					zar2=(1+(int) (Math.random()*6));
					System.out.println("Birinci oyuncunun attýðý zar ="+zar1);
					
					if(zar1 < zar2) {
						a=zar2-zar1;
						oyuncu1 =oyuncu1-a;
						System.out.println("Zarlar arasindaki fark ="+a);
						System.out.println("1.oyuncunun kalan parasi.."+oyuncu1);
					}
					
					else {
						System.out.println("2.oyuncunun kalan parasi.."+oyuncu2);
					}
					if(oyuncu1 <= 0 || oyuncu2 <=0)
						break;
					else {
						System.out.println("Tekrar zar atmak icin d'ye basiniz:");
						s=tara.next() .charAt(0);
					}
					
		}
		if(oyuncu1<=0)
			System.out.println("2.oyuncu "+sayac + 
					".inci turda Kazandi ");
		else
			System.out.println("1.oyuncu " +sayac + ".inci turda Kazandi");

	}

}

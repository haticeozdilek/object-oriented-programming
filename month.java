//Girdiðiniz yýl ve ay deðerlerini gmz önüne alarak ilgili ayýn kaç gün olduðunu hesaplamaktadýr.
///Þubat ayý dýþýndaki aylar için gün sayýlarý belirli olsa da break ifadesinin kullanýlmamasýna dair bir örnek

import java.util.Scanner;

public class month {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner klavye = new Scanner(System.in);
		int yil=klavye.nextInt();
		System.out.println("Hesaplamak istediginiz yili giriniz :");
		int ay=klavye.nextInt();
		
		int gunSayisi=0;
		switch(ay) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			gunSayisi = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			gunSayisi=30;
			break;
		case 2:
			if(((yil % 4 == 0)&& !(yil % 100 == 0))||(yil % 400 == 0)) {
				gunSayisi=29;}
			else {
				gunSayisi=28;
			}
			break;
			default:
				System.out.println("Gecersiz ay");
				break;
	}
	System.out.println("Gunlerin Sayisi = "+gunSayisi);
	}
}
package ex;
import java.util.Scanner;

class Atm {
	public static void main(String[] args) {
		
	int toplam_Bakiye=1500;
	
	while(true) {
		System.out.print("Yapmak istediginiz islemi secin :/n"
			+"1.Bakiye Sorgulama /n"
			+"2.Para Çekme/n"
			+"3.Para Yatýrma/n"
			+"4.Cikis\n"
			+"Ýslem Seciniz :");
		Scanner input=new Scanner(System.in);
		int islem =input.nextInt();
		
		switch(islem) {
		case 1:
			System.out.println("Toplam bakiyeniz = "+toplam_Bakiye+" TL");
			break;
		case 2:
		{
			System.out.print("Cekeceginiz Miktarý Giriniz :");
			int cekilecek_Miktar=input.nextInt();
			if(toplam_Bakiye>0 && toplam_Bakiye-cekilecek_Miktar>0) 
			{
				toplam_Bakiye=-cekilecek_Miktar;
				System.out.println("\n"+cekilecek_Miktar+" TL çekildi. Bakiye: "+toplam_Bakiye+"TL \n");
			}
			else
			{
				System.out.println("\n YETERSÝZ BAKÝYE\n");	
			}
			break;
		}
		case 3:
		{
			System.out.print("Yatiracaginiz Miktari Giriniz :");
			int yatirilacak_Miktar=input.nextInt();
			toplam_Bakiye=+yatirilacak_Miktar;
			System.out.println("\n"+yatirilacak_Miktar+" TL Yatirildi.Bakiye:"+toplam_Bakiye+"TL\n");
			break;
		}
		case 4:
			break;
		default:
		{
			System.out.println("Hata.Lütfen dogru islem seciniz !!");
			break;
		}
		}
		if(islem==4)
		{
			System.out.println("Kartiniz iade ediliyor...");
			break;
		}
		}
	}
}
		

			


import java.util.Random;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Uzayli[] uzaylilar=new Uzayli[500];
		Dunyali[] dunyalilar=new Dunyali[500];
		
		Random rand=new Random();
		Scanner input = new Scanner(System.in);
		int devam=0;
		int toplamPuan=0;
		while(devam != -1) {
			int oyun_puan�=0;
				
				for (int i=0;i<500;i++){
					int kontrol=rand.nextInt(2);
				    if (kontrol == 0){
				    	Asker yeni = new Asker(rand.nextInt(10),rand.nextInt(10));
				    	dunyalilar[i]=yeni;
				    }
	
				    else {
				    	Ciftci yeni = new Ciftci(rand.nextInt(10),rand.nextInt(10));
				    	dunyalilar[i]=yeni;
				    }
					int kontrol2=rand.nextInt(2);
				    if (kontrol2 == 0){
					    Cyborg yeni = new Cyborg(rand.nextInt(10),rand.nextInt(10));
					    uzaylilar[i]=yeni;
					}
					else {
					    Madenci yeni = new Madenci(rand.nextInt(10),rand.nextInt(10));
					   	uzaylilar[i]=yeni;
					   }
				}
				int uzayli_guc=0,dunyali_guc=0;
				    
			    for (int j=0;j<500;j++){
			    	uzayli_guc += uzaylilar[j].gucHesapla();
				    	
			    	dunyali_guc += dunyalilar[j].gucHesapla();
			    }
			    if (uzayli_guc > dunyali_guc){
			    	oyun_puan�=uzayli_guc - dunyali_guc;
			    	System.out.println("Dunyalilar�n gucu: "+dunyali_guc + "\nUzaylilar�n gucu: " + uzayli_guc);
			    	System.out.println("UZAYLILAR KAZANDI..........\n\n");    	
			    }				    
			    else{
			    	oyun_puan�=dunyali_guc-uzayli_guc;
			    	System.out.println("Dunyalilar�n gucu: "+dunyali_guc + "\nUzaylilar�n gucu: " + uzayli_guc);
				    System.out.println("D�NYAL�LAR KAZANDI ........\n");
				}
				    
				    
			    System.out.println("Oyun puanu == "+oyun_puan�);
				    
			    System.out.println("\n\nDevam etmek istemiyorsan�z -1 yaz�n");
			    devam=input.nextInt();
				
				
			    toplamPuan += oyun_puan�;
		}				    
				
	   System.out.println("\nOyunun toplam puan�== "+toplamPuan);
	}
}

				
				


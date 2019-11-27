package ex;
import java.util.Scanner;
public class isciTest {

		public static void main(String[] args) {
			isci isci1 = new isci("Ali","Duman",120,40);
			int cs,su;
			String a,s;
			
			Scanner input = new Scanner(System.in);
			System.out.println("Lütfen iþçi bilgilerini giriniz....");
			a=input.nextLine();
			s=input.nextLine();
			cs=input.nextInt();
			su=input.nextInt();
			
			isci isci2 = new isci(a,s,cs,su);
			
			int toplam1,toplam2,toplam3;
			
			toplam1=isci1.Hesapla(isci1.getCalisma_saati(), isci1.getSaatlik_ucret());
			toplam2=isci2.Hesapla(isci2.getCalisma_saati(),isci2.getSaatlik_ucret());
			
			
			//isci isci3 =new isci();
			
			//isci3.setAd("Mahmut");
			//isci3.setSoyad("Kaya");
			//isci3.setCalisma_saati(160);
			//isci3.setSaatlik_ucret(40);
			

			//toplam3=isci3.Hesapla(isci3.getCalisma_saati(), isci3.getSaatlik_ucret());
			
			System.out.println(isci1.getAd()+"\n" + isci1.getSoyad()+"\n" + toplam1);
			System.out.println(isci2.getAd()+"\n" +  isci2.getSoyad() +"\n"+ toplam2);
			//System.out.println(isci3.getAd()+ isci3.getSoyad() + toplam3);
			System.out.println("Ýsmos");
			System.out.println("Hatice Ýsmoþu Seviyor");

		}

	}
		
		
		
		
		
		
		
		
		
		
		



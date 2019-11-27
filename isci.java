package ex;

public class isci {
	 private String Ad;
	 private String Soyad;
	 private int Calisma_saati;
	 private int Saatlik_ucret;
	    
	 public isci(String a, String s, int cs, int su){
	    Ad=a;
	    Calisma_saati=cs;
	    Soyad=s;
	    Saatlik_ucret=su;
	 }
	 public int Hesapla(int saat, int ucret){
	    int ek=0;
	    int para=0;
	    	
	    if (saat>100){
	    	ek=saat-100;
	    }
	    para=(saat-ek)*ucret;
	    para=para+(ek/2)*50;
	    	
	    return para;
	    	
	 }
	    public isci(){
	    	
	    }
		public String getAd() {
			return Ad;
		}
		public void setAd(String ad) {
			Ad = ad;
		}
		public String getSoyad() {
			return Soyad;
		}
		public void setSoyad(String soyad) {
			Soyad = soyad;
		}
		public int getCalisma_saati() {
			return Calisma_saati;
		}
		public void setCalisma_saati(int calisma_saati) {
			Calisma_saati = calisma_saati;
		}
		public int getSaatlik_ucret() {
			return Saatlik_ucret;
		}
		public void setSaatlik_ucret(int saatlik_ucret) {
			Saatlik_ucret = saatlik_ucret;
		}
}



public class Ciftci extends Dunyali{
	private int urunSayisi;

	public Ciftci(int savunma, int urunSayisi) {
		super(savunma);
		this.urunSayisi=urunSayisi;
	}

	public int getUrunSayisi() {
		return urunSayisi;
	}

	public void setUrunSayisi(int urunSayisi) {
		this.urunSayisi = urunSayisi;
	}
	public int gucHesapla() {
		return getUrunSayisi();
	}
	
}


public class Madenci extends Uzayli {
	int madenSayisi;

	public Madenci(int savunma, int madenSayisi) {
		super(savunma);
		this.madenSayisi = madenSayisi;
	}

	public int getMadenSayisi() {
		return madenSayisi;
	}

	public void setMadenSayisi(int madenSayisi) {
		this.madenSayisi = madenSayisi;
	}
	public int gucHesapla() {
		return getMadenSayisi();
	}

}

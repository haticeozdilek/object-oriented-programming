
public abstract class Uzayli {
	private int savunma;

	public Uzayli(int savunma) {
		setSavunma(savunma);
	}
	public abstract int gucHesapla();
		public int getSavunma() {
			return savunma;
			
		}
		public void setSavunma(int savunma) {
			this.savunma = savunma;
		}
}

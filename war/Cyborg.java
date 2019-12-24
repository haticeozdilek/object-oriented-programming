
public class Cyborg extends Uzayli{
	
	private int lazerGucu;

	public Cyborg(int savunma,int lazerGucu) {
		super(savunma);
		this.lazerGucu=lazerGucu;
		
	}

	public int getLazerGucu() {
		return lazerGucu;
	}

	public void setLazerGucu(int lazerGucu) {
		this.lazerGucu = lazerGucu;
	}
	public int gucHesapla() {
		return getLazerGucu()*super.getSavunma();
	}
	

}

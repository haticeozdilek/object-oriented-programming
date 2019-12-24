
public class Asker extends Dunyali{
	private int silahGucu;

	public Asker(int savunma, int silahGucu) {
		super(savunma);
		this.silahGucu=silahGucu;
		
	}

	public int getSilahGucu() {
		return silahGucu;
	}

	public void setSilahGucu(int silahGucu) {
		this.silahGucu = silahGucu;
	}
	public int gucHesapla() {
		return getSilahGucu()*super.getSavunma();
	}
}
	
	



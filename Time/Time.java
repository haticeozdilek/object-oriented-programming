import java.lang.Exception;
public class Time {
	
	private int hour,min,sec;
	
	public void setTime(int h,int m,int s)throws Exception {
		
		if((h>=0 && h<24) && (m>=0 && m<60) && (s>=0 && s<60)) {
			
			hour=h;
			min=m;
			sec=s;
			
		}
		else 
			throw new IllegalAccessException("\n Hatali giris.");
	}
	public Time() {
		
	}
	public Time(int h, int m, int s)throws Exception{
		
		setTime(h,m,s);
	}
	
	public String toUniversalString() {

        return String.format("%d , %d , %d " , hour , min , sec);

    }
	
	public String toString() {
		 return String.format("\n%d , %d , %d , %s " , ( (hour==0 || hour==12) ? 12 : hour % 12 ) , min , sec , (hour<12 ? "a.m." : "p.m.") );

	}
}




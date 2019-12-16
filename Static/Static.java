
public class Static {

    public int num1; 
    public static int num2; 

    private int num3; 
    private static int num4; 
    private static int num5;

    public Static(){
        
    }

    public Static(int num1, int num2, int num3, int num4,int num5){

        this.num1=num1;
        this.num2=num2;
        this.num3=num3;
        this.num4=num4;
        this.num5=num5;

    }

    public void setNum3(int num3) {
        this.num3 = num3;
    }
    public int getNum3(){ 
        return num3;
    }


    public static void setNum4(int num4) { // public static void setNum4(int n1)
        Static.num4 = num4;                    // num4 = n1;
    }
    public static int getNum4() { // "static" yazılmasa bile çalışır fakat "static" yazılması daha sağlıklı olur
        return num4;
    }

	public static int getNum5() {
		return num5;
	}

	public static void setNum5(int num5) {
		Static.num5 = num5;
	}
    


}

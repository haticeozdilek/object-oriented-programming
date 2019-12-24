
public class cokboyutluDizi{

	public static void main(String[] args) {

	        int[][] dizi1 = new int[3][4]; // 3 satir 4 sütun

	        int[][] dizi2= {{1,2,3},{4,5,6}};

	        int[][] dizi3= {{1,2,3},{4,4,5,5,6}};

	        int[][] dizi4= new int[2][];

	        int[][] dizi5= new int[1][5];
	        int[] dizi5a= new int[5];

	        int[] dizison = {1,2,3,4,5};

	        dizi4[0]=new int[3];///Satira 3 tane 0
	        dizi4[1]=new int[5];//Sütuna 5 tane 0 yaziliyor

	        diziGoster(dizi1);
	        diziGoster(dizi2);
	        diziGoster(dizi3);
	        diziGoster(dizi4);
	        diziGoster(dizi5);
	        diziGosterTek(dizi5a);

	        System.out.println("\n\ndizi3 satir sayisi = "+ dizi3.length);
	        System.out.println("dizi3 1. satir uzunlugu = "+ dizi3[0].length);
	        System.out.println("dizi3 2. satr uzunlugu = "+ dizi3[1].length);

	        System.out.println("\n\ndizison uzunlugu = "+ dizison.length);

	    }
	    public static void diziGoster(int[][] dizi){
	    	
	    	System.out.print("------------------\n");

	        for (int satir=0;satir<dizi.length;satir++){

	            for (int sutun=0;sutun<dizi[satir].length;sutun++)
	            {
	            	
	                System.out.print(dizi[satir][sutun] + " ");
	            }	       
	            
	            System.out.print("\n");
	        }

	    }
	    public static void diziGosterTek(int[] dizi){
	    	
	    	System.out.print("------------------\n");

	        for (int satir=0;satir<dizi.length;satir++){

	                System.out.print(dizi[satir]+ " ");

	        }

	    }

}

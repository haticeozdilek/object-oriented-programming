//Java Programlama Dilinde cok boyutlu bir dizi, aslında elemanları dizi olan bir dizidir.
public class multidimensionalArray {

	public static void main(String[] args) {
		
		int multidimensionalArray[][][];
		multidimensionalArray = new int[3][2][4];
		for(int i=0;i<3;i++){
			for(int j=0; j<2; j++) {
				for(int k=0; k<4; k++){
					multidimensionalArray[i][j][k]=2*i+j+5*k;
					System.out.println("Cok boyutlu dizinin["+i+"]["+j+"]["+k+"] indisindeki eleman : "+multidimensionalArray[i][j][k]);
				}
			}
		}
	}

}
//Koda baktığımda ilk for döngüsü k değerinden başlar
//1) i=0 j=0 k=0
//2) i=0 j=0 k=1
//3) i=0 j=0 k=2
//4) i=0 j=0 k=3
//5) i=0 j=1 k=0
//6) i=0 j=1 k=1
//7) i=0 j=1 k=2
//8) i=0 j=1 k=3
//9) i=1 j=0 k=0
//10)i=1 j=0 k=1
//11)i=1 j=0 k=2
//12)i=1 j=0 k=3
//13)i=1 j=1 k=0
//14)i=1 j=1 k=1
//15)i=1 j=1 k=2
//16)i=1 j=1 k=3
//17)i=2 j=0 k=0
//18)i=2 j=0 k=1
//19)i=2 j=0 k=2
//20)i=2 j=0 k=3
//21)i=2 j=1 k=0
//22)i=2 j=1 k=1
//23)i=2 j=1 k=2
//24)i=2 j=1 k=3


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

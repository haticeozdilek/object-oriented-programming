//package ex;

public class v4 {

	public static void main(String[] args) {
		
		int a[][][]= {{{1,2,3},{4},{5,6},{8,9},{12,13,14},{5},{9,11},{20,22}}};
		int top=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0; j<a[i][0].length; j++) {
				for(int k=0; k<a[i][j].length;k++) {
					top=top+a[i][j][k];
					System.out.println(" "+a[i][j][k]);
				}
			}
		}
		System.out.println("top ="+top);

	}

}

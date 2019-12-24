
public class arrays {
	
	public static void main(String[] args) {
		int n = 42;
		boolean a = PrimeorComp(n);
		if (a == true)
			System.out.println("" + n + " asal sayidir");
		else
			System.out.println("" + n + " asal sayi degildir");
		StringBuffer s = PatternDisplay(8);
		System.out.println("" + s);
		Integer[] array = {2, 3, 5, 8, 134, 67, 54, 90 };
		int min = Smallest(array);
		int max = largest(array);
		System.out.println("min " + min + " max " + max);
	}

	private static int largest(Integer[] array) {//Dizideki en büyük elemaný buluyor
		int max = array[0];
		for (int i = 1; i < array.length; i++)
			if (array[i] > max)
				max = array[i];
		return max;
	}

	private static int Smallest(Integer[] array) {//Dizideki en küçük elemaný buluyor
		int min = array[0];
		for (int i = 1; i < array.length; i++)
			if (array[i] < min)
				min = array[i];
		return min;
	}

	private static StringBuffer PatternDisplay(int n) {//1'den 8'e kadar olan sayýlarý alt alta yazdýrýyor
		StringBuffer str = new StringBuffer("");
		for (int i = 1; i <= n; i++) {
			if (i != 1)
				str.append("\n");
			for (int j = 1; j <= i; j++)
				str.append(j + " ");
		}
		return str;
	}

	private static boolean PrimeorComp(int n) {//Asallýðý kontrol ediyor
		boolean a = true;
		for (int i = 2; i <= n / 2; i++)
			if (n % i == 0)
				    a = false;
		return a;
	}
}


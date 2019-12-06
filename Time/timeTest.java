
public class timeTest {

	public static void main(String[] args)throws Exception {
		Time i1 = new Time(); 

     System.out.println("\n" + i1.toUniversalString()); 
     System.out.println("---------------------------");


     System.out.println(i1.toString()); 
     System.out.println(i1); 
     System.out.println("---------------------------");


      i1.setTime(13 , 27 , 6);
      System.out.println(i1.toString()); // 1,27,6 p.m.
      System.out.println("---------------------------");


      i1.setTime(1 ,27 ,6);
      System.out.println(i1.toString());// 1,27,6 a.m.
      System.out.println("---------------------------");


      Time i2 = new Time(11,11,11);
      System.out.println(i2.toString());
      System.out.println(i2);

      
  }

}

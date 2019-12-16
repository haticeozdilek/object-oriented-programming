
public class test {

	public static void main(String[] args) {
		Static obj1 = new Static(1,2,3,4,22); // 1,2,3,4 sayýlarý sýrasýyla atandý
        Static obj2 = new Static(); // Hepsi 0(default) , (static olmadýðýnda ve setXYZ() atamasý olmadýðýnda varsayýlan deðer "0(NULL)")


//        System.out.printf(" num1: %d \n num2: %d \n num3: %d \n num4: %d" , obj2.num1 , obj2.num2 , obj2.getNum3() , obj2.getNum4());
        System.out.println("num1: " + obj2.num1 + "\nnum2: " + obj2.num2 + "\nnum3: " + obj2.getNum3() + "\nnum4: " + obj2.getNum4() + "\nnum5: " + obj2.getNum5());


        Static obj3 = new Static(8,13,21,34,55);
        System.out.println("\n\nnum1: " + obj3.num1 + "\nnum2: " + obj3.num2 + "\nnum3: " + obj3.getNum3() + "\nnum4: " + obj3.getNum4() + "\nnum5: " + obj3.getNum4() );


        System.out.println("\n\nnum1: " + obj2.num1 + "\nnum2: " + obj2.num2 + "\nnum3: " + obj2.getNum3() + "\nnum4: " + obj2.getNum4() + "\nnum5: " + obj3.getNum5());


        obj2.setNum3(27);
        obj2.setNum4(27);
        System.out.println("\n\nnum1: " + obj1.num1 + "\nnum2: " + obj1.num2 + "\nnum3: " + obj1.getNum3() + "\nnum4: " + obj1.getNum4() + "\nnum5: " +obj2.getNum5());


        System.out.println("\n\nnum1: " + obj2.num1 + "\nnum2: " + obj2.num2 + "\nnum3: " + obj2.getNum3() + "\nnum4: " + obj2.getNum4() +"\nnum5: " +obj1.getNum5());

    }
}

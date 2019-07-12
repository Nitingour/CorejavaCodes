//Java 8 new feature of Interface
interface A
{
   default void display()  //Java 8 : default method in interface
    {
    	System.out.println("display from A");
    }
}
interface B
{
   default void display()  //Java 8 : default method in interface
    {
    	System.out.println("display from B");
    }
}
public class C  implements A,B {
     public	void display()  //Java 8 : default method in interface
    {     A.super.display();B.super.display();
    	System.out.println("display from C");
    }
	public static void main(String[] args) {
	 C c=new C(); c.display();
    }

}

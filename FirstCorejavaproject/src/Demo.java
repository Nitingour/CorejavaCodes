
public class Demo {
	public static void main(String[] args) {
		System.out.println("Demo");
		//main calling
		String a[]= {"abc"};
		Test.main(a);
	}
}
	class Test
	{
	   public static void main(String[] args) 
	   {
		System.out.println("Test");
	   }
}

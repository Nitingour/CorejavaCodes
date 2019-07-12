
public class GCDemo {

	public static void main(String[] args) {
	
		Runtime rt=Runtime.getRuntime();
		try {
		  rt.exec("notepad.exe");
		}catch(Exception e)
		{
		}
		
		
//		System.out.println("Total Memory="+rt.totalMemory()); //1000 
//		System.out.println("Initial Free Memory="+rt.freeMemory()); //800
//		
//		int arr[]=new int[1000000]; //1000000*4
//		for(int i=0;i<arr.length;i++)
//			arr[i]=i+1;
//		
//System.out.println("Free Memory after array creation and before GC="+rt.freeMemory()); //600
//		
//		for(int i=0;i<arr.length;i++)
//			arr[i]=0;
//		
//		rt.gc();
//	
//		System.out.println("Free Memory After GC="+rt.freeMemory()); //800
	}
}

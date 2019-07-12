import java.util.ArrayList;

public class BulkDmeo {

	public static void main(String[] args) {
		
		ArrayList<String> list1=new ArrayList<>();
		list1.add("A");list1.add("B");list1.add("C");list1.add("D");list1.add("E");
		
		ArrayList<String> list2=new ArrayList<>();
		list2.add("D");list2.add("E");list2.add("F");list2.add("G");
		
		//merge both lists
	//	list1.addAll(list2);
//		System.out.println(list1);

		  //remove all common objects from list1
	//	list1.removeAll(list2);
	//	System.out.println(list1);

		 // retain all common objects from list1
			list1.retainAll(list2);
			System.out.println(list1);
			
			System.out.println(list1.containsAll(list2));//false
		
		
	}

}

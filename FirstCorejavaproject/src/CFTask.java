import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CFTask {

	public static void main(String[] args) {

		String myarr[]={"abc", "", "bc", "efg", "abcd","", "jkl"};
     //Java 7
	/*	ArrayList<String> list=new ArrayList<>();
		for(String a:myarr)
			list.add(a);
		//count empty string 
		Iterator<String> it=list.iterator();
		int count=0;
		while(it.hasNext())
		{
			String s=it.next();
			  if(s.isEmpty())//if(s=="")
			     count++;
		}
		System.out.println("Total Empty String is:"+count);
    	*/  //Java 8 solution using Stream API
		ArrayList<String> list=new ArrayList<>(Arrays.asList(myarr));
		//only work with string array
		//System.out.println(list);
		 long count=list.parallelStream().filter(x->x.isEmpty()).count();
		 System.out.println("Total Empty String is:"+count);
		 
		 
		 //2) Eliminate all empty string
List newList=list.parallelStream().filter(x->!x.isEmpty()).collect(Collectors.toList());
		 System.out.println(newList);
		
		 //3) create new list with 3 letter values 
List newList1=list.parallelStream().filter(x->x.length()==3).collect(Collectors.toList());
		 System.out.println(newList);
		 
 
  int arr[]={3, 2, 2, 3, 7, 3, 5};
//get new list of square of distinct numbers
		 ArrayList<Integer> ilist=new ArrayList<>();
		 for(int z:arr)
			 ilist.add(z);
		 System.out.println(ilist);
		   
List newilist= ilist.parallelStream().distinct().map(x->x*x).collect(Collectors.toList());
		 System.out.println(newilist);

// get new list of sorted distinct numbers
List newilist1= ilist.parallelStream().sorted().distinct().collect(Collectors.toList());
System.out.println(newilist1);
		 
		 
		 
		 /*
String myarr[]={"abc", "", "bc", "efg", "abcd","", "jkl"};
		1) count empty string 
		2) Eliminate all empty string
		3) create new list with 3 letter values


		  int arr[]={3, 2, 2, 3, 7, 3, 5};
		 get list of square of distinct numbers
*/

	}

}

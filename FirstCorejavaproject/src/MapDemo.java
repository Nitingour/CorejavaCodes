import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
	//HashMap<Integer,String> map=new HashMap<>();
		LinkedHashMap<Integer,String> map=new LinkedHashMap<>();
		 map.put(101,"Amit");
	     map.put(104,"Sumit");
	     map.put(103,"RAM");
	     map.put(102,"RAJ");
	     map.put(102,"Rahul"); //overwrite value while trying to add duplicate key
	     
	     
	   //Accessing elements
	    //1) using tostring method
	     System.out.println(map);
	  
	     //1) using for each loop
	  for(Map.Entry me:map.entrySet())
		  System.out.println(me.getKey()+"   "+me.getValue());
	     
	}

}

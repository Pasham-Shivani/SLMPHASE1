package phase1_Assistedpractice;
import java.util.*;

public class MapAssignment {
	public static void main(String[] args) {
 		// map
 		
 		//Hashmap
 		HashMap<Integer,String> hm=new HashMap<Integer,String>();      
 	      hm.put(1,"Shivani");    
 	      hm.put(2,"Shirisha");    
 	      hm.put(3,"Ramya");   
 	       
 	      System.out.println("\nThe elements of Hashmap are ");  
 	      for(Map.Entry m:hm.entrySet()){    
 	       System.out.println(m.getKey()+" "+m.getValue());    
 	      }
 	      
 	     //HashTable
 	       
 	      Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
 	      
 	      ht.put(4,"Ram");  
 	      ht.put(5,"Shiva");  
 	      ht.put(6,"Pravali");  
 	      ht.put(7,"Sampath");  

 	      System.out.println("\nThe elements of HashTable are ");  
 	      for(Map.Entry n:ht.entrySet()){    
 	       System.out.println(n.getKey()+" "+n.getValue());    
 	      }
 	      
 	      
 	      //TreeMap
 	      
 	      TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
 	      map.put(8,"Shivani");    
 	      map.put(9,"Ramya");    
 	      map.put(10,"Kavitha");       
 	      
 	      System.out.println("\nThe elements of TreeMap are ");  
 	      for(Map.Entry l:map.entrySet()){    
 	       System.out.println(l.getKey()+" "+l.getValue());    
 	      }    
 	      
 	   }  
}

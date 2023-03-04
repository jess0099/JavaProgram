package JavaProgram;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Stringsearch {
	
	public static void main(String [] xyz) {
		
		String str="amit and arun are going to village and are playing game and football";
		String find=" ";
		
		                          
		                  String [] words=str.split(" ");
		                  
		                  Map<String,Integer>  wordmap=new HashMap<>();
		                  
		                  for(String word:words) {
		                	  if(wordmap.containsKey(word)) {
		                		  
		                		  wordmap.put(word,wordmap.get(word)+1);
		                	  }else {
		                		  
		                		  wordmap.put(word,1);
		                	  }
		                	  
		                  }
		                  
		                Set<Entry<String,Integer>>   set= wordmap.entrySet();
		                
		                for(Entry<String,Integer> se:set) {
		                	
		                	if(se.getValue()>1) {
		                		
		                		System.out.println("keys="+se.getKey()+"   valus->"+se.getValue());
		                	}else {
		                		System.out.println("keys="+se.getKey()+"   valus->"+se.getValue());
		                		
		                	}
		                }
		                  
		                  
		
		
	}

}

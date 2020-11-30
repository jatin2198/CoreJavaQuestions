package newHacker;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Counting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 String temp="cabergiitegg";
		    
		    int K=5;
		    
		    char[] vovel=new char[]{'a','e','i','o','u'};
		    //String str="";
		     
		     Map<Integer,String> getstr=new TreeMap<>();
		    
		        int i=0;
		    	
		    	while(K<=temp.length()) {
		       
		    	String str=temp.substring(i, K);
		        
		        int count=0;
		        for(int j=0;j<str.length();j++){
		            
		            for(int f=0;f<vovel.length;f++){
		                
		                if(str.charAt(j)==vovel[f]){
		                    
		                    count++;
		                }
		            }
		            
		           
		        }getstr.put(count, str);
		         
		        i++;
		        K++;
		        
		        
		    	}
		    	
		    	
		    
		    
		    int keyp=Collections.max(getstr.keySet());
		    
		    String sunvalue=getstr.get(keyp);
		    
		    System.out.print( sunvalue);

		   

	}

}

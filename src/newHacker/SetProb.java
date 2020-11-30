package newHacker;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class SetProb  {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the number of  pairs");
		
		int line=s.nextInt();
		
		//String temp=s.nextLine();
		
		HashSet<String> pair=new HashSet<>();
		
		Set<String> list=new HashSet<>();
		

     	
     	String[] arr=new String[2*line];
     	int count=0;
     	System.out.println("Enter the pair");
     	for(int i=0;i<=line;i++) {
     		
    		
     		String temp=s.nextLine();
     		
     		String[] p1=temp.split(" ");
     		

     			
     			
     			
     			for(String str:p1) {
     	     		
     	     		for(String str2:p1) {
     	     			String	tempo=str+" "+str2;
     	     				tempo=tempo.trim();
     	     			String reverstempo =str2+" "+str; 
     	     			

     	     	if((!str.isEmpty())&&(!str2.isEmpty())&&(!str.equalsIgnoreCase(str2))&&
     	     			(tempo.length()>4)&&(!pair.contains(reverstempo))) {	
     	     	
     	     		
     	     		pair.add(tempo);
     	     		System.out.println(pair.size());



     	     			}
     	   	
     
     	     		}
     	     		
     	     	
     	     	}
     		
     		
     		
     			
     			
     		
     		
     	}
     	
     
       	System.out.println(pair);
     	
     	

		
			
		
			
		}}
		
		
		

		
		
		

		





	


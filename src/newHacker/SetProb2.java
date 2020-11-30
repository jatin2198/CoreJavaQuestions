package newHacker;

import java.util.HashSet;
import java.util.Scanner;

public class SetProb2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        
        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }
        
        System.out.println("Values of left");
        
        
        for(int j=0;j<pair_left.length;j++) {
        	
        	System.out.println(pair_left[j]);
        }
        
        HashSet<String> pair=new HashSet<>();
        
        for(int i=0;i<t;i++) {
            
            pair.add("(" + pair_left[i] + ", " + pair_right[i] + ")" );
            
            System.out.println(pair.size());
        }


        
	}

}

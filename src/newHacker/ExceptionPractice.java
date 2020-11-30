package newHacker;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 int x,y;
	        
	        Scanner s=new Scanner(System.in);
	        
	        x=s.nextInt();
	        
	        y=s.nextInt();
	        
	        try{
	            
	            int z=x/y;
	            System.out.println(z);
	        }
	        catch(ArithmeticException e ){
	            
	        	  System.out.println(e);
	        }
	        
	        catch(InputMismatchException e ){
	            
	        	  System.out.println("java.util.InputMismatchException");
	        }

	}

}

package newHacker;

public class ChangeStringPlaces {

	
	public boolean stringChecker(int k,String str,String result) {
		
		if(str.length()==result.length()) {
			
			
			char[] expected=new char[str.length()];
			
			for(int i=0;i<str.length();i++) {
				
				int asciivalue=str.charAt(i);
				
				System.out.println(asciivalue);
				
				int newcharvalue=asciivalue+k;
				
				char asciitoChar=(char)newcharvalue;
				

				
					
					expected[i]=asciitoChar;
					
					System.out.println(expected[i]);
				
				
				k--;
				
			}
			
			
			 String str2 = String.valueOf(expected);
			 
			 System.out.println(str2);
			 
			 if(result.equals(str2)) {
				 
				 return true;
			 }
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input="abc";
		
		String result="eee";
		
		ChangeStringPlaces obj=new ChangeStringPlaces();
		
		boolean check=obj.stringChecker(4, input, result);
		
		
		System.out.println(check);
		
	}

}

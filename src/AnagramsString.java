import java.util.Arrays;

public class AnagramsString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str1="anagramm";
		
		String str2="marganaa";
		
		boolean flag=true;
		
		if(str1.length()==str2.length()) {
			
			char[] ch1=str1.toCharArray();
			
			char[] ch2=str2.toCharArray();
			
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			
			 flag=Arrays.equals(ch1, ch2);
			
			
		}
		
		if(flag) {
			
			System.out.println("Anagrams");
		}
		else {
			
			System.out.println("Not Anagrams");
		}
	}

}

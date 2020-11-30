import java.util.HashSet;

public class FirstRepeatedElement {

	
	public void rep(String str) {
		
		
		String[] word=str.split("");
		
		HashSet<String> findword=new HashSet<>();
		
		for(int i=0;i<word.length;i++) {
			
			String temp=word[i];
			if(findword.contains(temp)) {
				
				System.out.print( temp);
			}
			
			else {
				
				findword.add(temp);
			}
		}
		
		System.out.print("not found");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FirstRepeatedElement ft=new FirstRepeatedElement();
		
		ft.rep("you have have no no choice");
		


	}

}

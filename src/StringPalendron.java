
public class StringPalendron {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="java";
		String stp="";
		
		//char[] stp=new char[str.length()];
		for(int i=str.length()-1;i>=0;i--) {
			
			stp=stp+str.charAt(i);
			
			System.out.println(stp);
		}
		
		//String pal=new String(stp);
		
		System.out.println(stp);
		
		if(stp.equalsIgnoreCase(str)) {
			
			System.out.println("YES");
		}
		
		else {
			System.out.println("No");
			
		}
	}

}


public class Nagaro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="jatin_arya_Shamra_ram_Sham_bhama_Triple_rock";
		
	if(str.contains("_")) {
		
//	int i=str.indexOf("_");
//	
//	char c=str.charAt(i+1);
//	c=Character.toUpperCase(c);
//	
//
//	
//	System.out.print(str.substring(0, i)+c+str.substring(i+2,str.length()));
		
		
		String[] stp=str.split("_");
		
		System.out.print(stp[0]+" ");
		for(int i=1;i<stp.length;i++) {
			
			if(i>0) {
				
				String temp=stp[i];
				char c=temp.charAt(0);
				
				if(!Character.isUpperCase(c)) {
					temp=Character.toUpperCase(c)+temp.substring(1, temp.length());
					
					System.out.print(temp+" ");
					
				}
				
				else {
					
temp=Character.toLowerCase(c)+temp.substring(1, temp.length());
					
					System.out.print(temp+" ");
				}
				
			}
			
			
			//String temp=stp[i];
		}
	
	}
		

	}

}

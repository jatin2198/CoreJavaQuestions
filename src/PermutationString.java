import java.util.Arrays;

public class PermutationString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="welcometojava";
		
		String[] str=new String[name.length()-2];
		
		for(int i=0;i<name.length()-2;i++) {
			
			str[i]=name.substring(i,i+3);
			
			
		}
		
		for(int i=0;i<str.length-1;i++) {
			
			for(int j=i+1;j<str.length;j++) {
			
				
				if(str[i].compareTo(str[j])>0) {
					
					String c=str[i];
					
					str[i]=str[j];
					str[j]=c;
				}
			}
		}
		//Arrays.sort(str);
		
	for(int i=0;i<str.length;i++) {
			
			System.out.print(str[i]+","+" ");
	}
		//System.out.println(Arrays.sort(str));
	//System.out.print(str[0]);
	//System.out.print(str[str.length-1]);
		}
	}



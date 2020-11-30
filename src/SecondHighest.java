
public class SecondHighest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] A=new int[] {40,50,10,90,30};
		
		int a=A[0],b=A[1];
		for(int i=0;i<A.length;i++) {
			
			
			for(int j=1;j<A.length-1;j++) {
				
				if(a*b<A[i]*A[j]) {
					
					a=A[i];
					
					b=A[j];
				}
				
			}
			
			
			}
			
			
			
		if(a>b) {
			System.out.print("Second"+b);
		}
		else {
			
			System.out.print("Second"+a);
		}
		
		


	}

}

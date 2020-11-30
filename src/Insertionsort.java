
public class Insertionsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] A=new int[] {5,9,7,3,2,1};
	
		for(int j=1;j<A.length;j++) {
			

				int  key=A[j];
				int i=j-1;

			
			while(i>=0&&A[i]>key) {
				
				A[i+1]=A[i];
				i=i-1;
				
				
			}
			
			//System.out.println(A[i+1]);
			
			A[i+1]=key;
			
			

		}
		
for(int k=0;k<A.length;k++) {
			
			System.out.println(A[k]);
		}
		//System.out.println(A[j]);
		
			
		
		
	}

}

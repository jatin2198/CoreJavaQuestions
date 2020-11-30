
public class SortArry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] A=new int[] {5,9,7,3,2,1};
		
		for(int i=0;i<A.length;i++) {
			
			for(int j=1;j<A.length;j++) {
				
				if(A[j-1]>A[j]) {
					
					int temp=A[j-1];
					
					A[j-1]=A[j];
					
					A[j]=temp;
					
					
				}
			
				
			}
			
			
		}
		
		for(int k=0;k<A.length;k++) {
			
			System.out.println(A[k]);
		}

	}

}


public class SelectionSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] arry=new int[] {40,50,10,90,30};
		//int min=0;
		for(int i=0;i<arry.length-1;i++) {
			
			int min=i;
			
			for(int j=i+1;j<arry.length;j++) {
				
				if(arry[j]<arry[min]) {
					
					min=j;
				}
			}
			
			int temp=arry[min];
			
			arry[min]=arry[i];
			
			arry[i]=temp;
		}
		
		for(int k=0;k<arry.length;k++) {
			
			System.out.println(arry[k]);
		}
	}
	
	

}

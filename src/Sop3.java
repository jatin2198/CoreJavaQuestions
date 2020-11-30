import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sop3 {

	public static void main(String[] args) {
		
		
		Scanner s=new Scanner(System.in);

	       
        List<Integer> list=new ArrayList<>();
        

        
int N=s.nextInt();
int k=0;

while(k<N) {
    
    
    int x=s.nextInt();
    list.add(x);
    

    String ste=s.nextLine();
    if(ste.equals("Insert")){
        int x1=s.nextInt();
        int y=s.nextInt();
        for(int i=0;i<=x1;i++) {
        
        if(i==x1) {
        list.add(y);}
        
    }
            }
    
    if(ste.equals("Delete")) {
        int x2=s.nextInt();
        list.remove(x2);
    
    
    k++;
    
}
}

list.forEach(i->System.out.print(i+" "));
        
		// TODO Auto-generated method stub

	}

}

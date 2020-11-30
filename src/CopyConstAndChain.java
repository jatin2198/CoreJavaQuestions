
public class CopyConstAndChain {

	int x,y;
	
//	CopyConstAndChain(){
//		
//		System.out.println("default");
//	}
//	
//	
//CopyConstAndChain(int x){
//		this();
//		System.out.println(x);
//	}
//	
//
CopyConstAndChain(int x,int y){
//	this(x);
//	System.out.println(x+y);
	
	this.x=x;
	this.y=y;
}


CopyConstAndChain(CopyConstAndChain z){

	
	this.x=z.x;
	this.y=z.y;
	//System.out.println(x);
}

public void show() {
	
	System.out.println("value="+x);
	System.out.println("value="+y);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CopyConstAndChain c=new CopyConstAndChain(10,20);
		c.show();
		
		CopyConstAndChain c2=new CopyConstAndChain(c);
		c2.show();
	}

}

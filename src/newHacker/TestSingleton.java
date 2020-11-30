package newHacker;

class TestSin{
	
	 static TestSin tsin=null;
	 
	 //static TestSin tsin=new TestSin();//Early approch
	
	private TestSin(){
		
		
	}
	
	
	static TestSin getobj() {
		
		if(tsin==null) {
		tsin=new TestSin();}
		
		
		return tsin;
	}
	
	
	void show() {
		
		System.out.print("I am Single");
	}
	
}

public class TestSingleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestSin sp=TestSin.getobj();
		
		sp.show();
		
	}

}

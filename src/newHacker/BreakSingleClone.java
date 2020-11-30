package newHacker;


class Braker implements Cloneable{
	
//int	i=10;
	@Override
	  protected Object clone() throws CloneNotSupportedException  
	  { 
	    return super.clone(); 
	  } 
}
class Singleton extends Braker{
	
	private static Singleton stest=new Singleton();
	
	
	private Singleton() {}
	
	
	
 static  Singleton getObj() {
	return stest;
	 
	 
 }
	 
 @Override
 protected Object clone() throws CloneNotSupportedException  
 { 
   throw new CloneNotSupportedException(); 
 } 
}
public class BreakSingleClone {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		
		Singleton instance1 = Singleton.getObj();
		Singleton instance2 = (Singleton)instance1.clone(); 
		
		System.out.println(instance1.hashCode());
		System.out.println(instance2.hashCode());

	}

}

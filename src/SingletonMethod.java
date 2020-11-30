
public class SingletonMethod {
	
	public static SingletonMethod singleobj=new SingletonMethod();
	
	private SingletonMethod() {}
	
	
public	static SingletonMethod getObj() {
		return singleobj;
		
		
	}
	
	public void show() {
		
		System.out.print("This is singleton");
	}

}

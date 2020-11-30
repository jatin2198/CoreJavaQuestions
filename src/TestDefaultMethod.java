
interface CanDefineMethod{
	
	
	void wentaway();
	static void go() {
		
		System.out.println("We can define static method in java 8");
	}
	default void show() {
		
		System.out.println("We can define method in java 8");
	}
	
}

public class TestDefaultMethod implements CanDefineMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CanDefineMethod can =new TestDefaultMethod();
		can.wentaway();
		can.show();
		CanDefineMethod.go();
	}

	@Override
	public void wentaway() {
		// TODO Auto-generated method stub
		System.out.println("overide method");
	}

}

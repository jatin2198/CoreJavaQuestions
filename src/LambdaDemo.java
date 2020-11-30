interface Lamu{
	
	void show(int i);
	
}
//class Test implements Common{
//
//	@Override
//	public void show() {
//		// TODO Auto-generated method stub
//		System.out.println("Hi");
//	}
//	
//	
//}

public class LambdaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Lamu obj=i->{System.out.println("Hi"+""+i);};

Common c=()->{System.out.println("Hi from common");};

obj.show(786);

c.show();
	}
	
	
	


}

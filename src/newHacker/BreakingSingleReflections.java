package newHacker;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class SingletonMethod2 {
	
	private static SingletonMethod2 singleobj=new SingletonMethod2();
	
	private SingletonMethod2() {}
	
	
public	static SingletonMethod2 getObj() {
		return singleobj;
		
		
	}
	
	public void show() {
		
		System.out.print("This is singleton");
	}

}
public class BreakingSingleReflections {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub
		SingletonMethod2 inst=SingletonMethod2.getObj();
		
		SingletonMethod2  instance2=null;
		
		Constructor<?>[] sonst=inst.getClass().getDeclaredConstructors();
		
		for(Constructor constructor : sonst) {
			
			constructor.setAccessible(true);
			 instance2 = (SingletonMethod2) constructor.newInstance(); 
			 
			 break;
		}
		
		System.out.println(inst.hashCode());
		System.out.println(instance2.hashCode());
	}

}

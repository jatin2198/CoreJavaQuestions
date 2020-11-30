package newHacker;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class SingleTest implements Serializable{
	
	private static SingleTest stest=new SingleTest();
	
	private SingleTest() {}
	
	
	 protected Object readResolve() 
	    { 
	        return stest; 
	    } 
	static SingleTest getObj() {
		
		
		
		return stest;
		
		
	}
	
	public void show() {
		
		System.out.println("BreakSingleton.....");
	}
	
}
public class BrakSingleton  {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		SingleTest instance=SingleTest.getObj();
		
		//Serialize an object
		
		 ObjectOutput out 
         = new ObjectOutputStream(new FileOutputStream("file.text")); 
     out.writeObject(instance); 
		
		out.close();
		
		
		//Deserializing
		
		ObjectInput in  
        = new ObjectInputStream(new FileInputStream("file.text")); 
      
		SingleTest instance2 = (SingleTest) in.readObject(); 
    in.close(); 
		
		
    System.out.println(instance.hashCode());
    
    System.out.println(instance2.hashCode());
		
		

	}

}

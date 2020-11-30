import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.function.Consumer;

//class ConsumImp implements Consumer<String>{
//
//	@Override
//	public void accept(String t) {
//		// TODO Auto-generated method stub
//		System.out.println(t);
//	}
//	
//	
//}


public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList arry=new ArrayList();
		
		arry.add("A");
		arry.add("A1");
		arry.add("A11");
		arry.add("A111");
		arry.add("A111");
		arry.add("A111");
		arry.add(1,"4");
		
	//arry.forEach(i->System.out.println(i));
Collections.sort(arry);

//Consumer<String> obj=new Consumer<String> (){
//
//	@Override
//	public void accept(String t) {
//		// TODO Auto-generated method stub
//		System.out.println(t);
//	}};
	
	
	Consumer<String> obj1=t->{System.out.println(t+" HI ");};
	
arry.forEach(obj1);

//arry.forEach(i->System.out.println(i));





//ArrayList<String> listofcountries = new ArrayList<String>();
//listofcountries.add("India");
//listofcountries.add("US");
//listofcountries.add("China");
//listofcountries.add("Denmark");
//
//Collections.sort(listofcountries);
//
//listofcountries.forEach(i->System.out.println(i));
	}

}

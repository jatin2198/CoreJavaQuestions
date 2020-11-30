package Java8Interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

interface Student{
	
	default void chapter() {
		
		
		System.out.println("Reading chapter 1");
	}
	
}

public class Test implements Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student std=new Test();
		
		std.chapter();
		
		List<String> str=new ArrayList<String>();
		
		
		str.add("Ram");
		
		str.add("KRam");
		
		str.add("DHRam");
		str.add("SRamp");
		str.add("PRam");
		str.add("NRamaaa");
		
		
		
		ArrayList arry=new ArrayList();
		
		arry.add("A");
		arry.add("A1");
		arry.add("A11");
		arry.add("A111");
		arry.add("A111");
		arry.add("A111");
		arry.add(1,"4");
		
		//str.stream().map(s->s.length()).forEach(i->System.out.println(i));
		
		//str.stream().flatMap(sp->Stream.of(sp.length())).forEach(i->System.out.println(i));
		
//		str.stream().flatMap(strp ->  
//        Stream.of(strp.length())). 
//        forEach(System.out::println); 
	      List<List<String>> listOfLists = Arrays.asList(str, arry);
	      
	      
	      listOfLists.stream().flatMap(s->s.stream()).collect(Collectors.toList()).forEach(i->System.out.println(i));
//		
		
		
		//str.stream().flatMap(sp->Stream.of(str.add(arry))).forEach(j->System.out.println(j));

	}

}

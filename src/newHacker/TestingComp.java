package newHacker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Student2{  
int rollno;  
String name;  
int age;  
Student2(int rollno,String name,int age){  
this.rollno=rollno;  
this.name=name;  
this.age=age;  
}  
}  

class AgeComparator implements Comparator{  
public int compare(Object o1,Object o2){  
Student2 s1=(Student2)o1;  
Student2 s2=(Student2)o2;  
  
if(s1.age==s2.age)  
return 0;  
else if(s1.age>s2.age)  
return -1;  
else  
return 1;  
}  
}  
public class TestingComp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList al=new ArrayList();  
		al.add(new Student2(101,"Vijay",23));  
		al.add(new Student2(106,"Ajay",27));  
		al.add(new Student2(105,"Jai",23));  
		
		Collections.sort(al,new AgeComparator());  
		
		//al.forEach(i->System.out.println(i));
		
		Iterator itr2=al.iterator();  
		while(itr2.hasNext()){  
		Student2 st=(Student2)itr2.next();  
		System.out.println(st.rollno+" "+st.name+" "+st.age);  
		}  

	}

}

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.ListIterator;
import java.util.TreeSet;

public class TreeSetCompratprExample implements Comparator  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet tr=new TreeSet(new MyComprator());
		
		tr.add(10);
		tr.add(0);
		tr.add(15);
		tr.add(20);
		tr.add(20);
		
		System.out.println(tr);
		
ArrayList al=new ArrayList();
al.add(100);
al.add(0);
al.add(150);
al.add(20);
al.add(200);
al.add(200);

Collections.sort(al);

ListIterator l=al.listIterator();


while(l.hasNext()) {
	
	Integer i=(Integer)l.next();
	System.out.println(i);
	
}



TreeSet t=new TreeSet(new TreeSetCompratprExample());

t.add("Z");
t.add("A");
t.add("O");
t.add("P");
t.add("Q");
t.add("Q");

System.out.println(t);


TreeSet tsbuffer=new TreeSet(new TreeSetCompratprExample());
tsbuffer.add(new StringBuffer("J"));
tsbuffer.add(new StringBuffer("C"));
tsbuffer.add(new StringBuffer("O"));
tsbuffer.add(new StringBuffer("F"));
tsbuffer.add(new StringBuffer("S"));

System.out.println("StringBuffer Object--->"+tsbuffer);

///Customizing Sorting on basis on increasing order length


TreeSet stringwithbuffer=new TreeSet(new TreeSetCompratprExample());
stringwithbuffer.add("A");
stringwithbuffer.add(new StringBuffer("ABC"));
stringwithbuffer.add(new StringBuffer("AA"));
stringwithbuffer.add("XX");
stringwithbuffer.add("ABCD");
stringwithbuffer.add("A");

System.out.println("IncreaingLengthOrder--->"+stringwithbuffer);


	}

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		
		String  int1=o1.toString();
		String  int2=o2.toString();
		
		
		///return int2.compareTo(int1);   //-->Descending order
		//return +1;--->Insertion order including duplicate
		
	///return -1;--Reverse of Insertion order
		
		//return 0;  //only first element will be inserted rest consider as duplicate
		
		//Sorting with increasing length
		
		if(int1.length()>int2.length()) {
			
			return +1;
		}
		
		else if(int1.length()<int2.length()) {
			
			return -1;
		}
		
		else {
			
			return int1.compareTo(int2);
		}
		
		
	}
}
	
	 class MyComprator implements Comparator{

		@Override
		public int compare(Object element1, Object element2) {
			// TODO Auto-generated method stub
			
			Integer int1=(Integer)element1;
			Integer int2=(Integer)element2;
			
			if(int1>int2) {
				
				return -1;
			}
			
			else if(int1<int2) {
				
				return +1;
			}
			
else {
			return 0;}
		}}



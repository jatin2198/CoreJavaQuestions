import java.util.Comparator;
import java.util.TreeSet;

public class Testing implements Comparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet stringwithbuffer=new TreeSet(new Testing());
		stringwithbuffer.add("A");
		stringwithbuffer.add(new StringBuffer("ABC"));
		stringwithbuffer.add(new StringBuffer("AA"));
		stringwithbuffer.add("XX");
		stringwithbuffer.add("ABCD");
		stringwithbuffer.add("A");
		stringwithbuffer.add("A");
		System.out.println("Tree Element--->"+stringwithbuffer);
		
		

	}

	

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		String  int1=o1.toString();
		String  int2=o2.toString();
		return 1;
		//return int2.compareTo(int1);
//if(int1.length()>int2.length()) {
//			
//			return +1;
//		}
//		
//		else if(int1.length()<int2.length()) {
//			
//			return -1;
//		}
//		
//		else {
//			
//			return int1.compareTo(int2);
//		}

		
	}

}

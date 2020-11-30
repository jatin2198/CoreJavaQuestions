import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class ComparePlusCompratorExample implements Comparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
EmployeeModel e1=new EmployeeModel("Ram",10);
EmployeeModel e2=new EmployeeModel("Shaam",19);
EmployeeModel e3=new EmployeeModel("Aam",100);
EmployeeModel e4=new EmployeeModel("Yam",109);
EmployeeModel e5=new EmployeeModel("Ram",9);
		

TreeSet emtr=new TreeSet( new ComparePlusCompratorExample());
		emtr.add(e1);
		emtr.add(e2);
		emtr.add(e3);
		emtr.add(e4);
		emtr.add(e5);
		
		
		System.out.println("Details of emplyee--->"+emtr);
		
		Iterator value=emtr.iterator();
		
		while(value.hasNext()) {
			System.out.println(value.next());
			
		}
		
		
		
	}

	@Override
	public int compare(Object arg0, Object arg1) {
	
		EmployeeModel emp=(EmployeeModel)arg0;
		EmployeeModel emp2=(EmployeeModel)arg1;
		
		String str1=emp.ename;
		String str2=emp2.ename;
		
		
		
		return str2.compareTo(str1);
	}

}

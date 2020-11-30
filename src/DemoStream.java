
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
	
	int rollno;
	
	String name;

	public Employee(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}
	
	
	
}
public class DemoStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Employee> list=new ArrayList<>();

list.add(new Employee(23,"Rama"));
list.add(new Employee(223,"Shama"));
list.add(new Employee(13,"RamaKant"));
list.add(new Employee(31,"Ramu"));
list.add(new Employee(53,"RamSingh"));
list.add(new Employee(93,"ShamRama"));
list.add(new Employee(123,"RadhaRaman"));
		

List<String> names=new ArrayList<String>();

//for(Employee emp:list) {
//	
//	
//	if(emp.rollno<=50) {
//		
//		names.add(emp.name);
//		
//	}
//}
//
//System.out.println(names);

names=list.stream().filter(emp->emp.rollno<=50).map(emp->emp.name).collect(Collectors.toList());

System.out.println(names);
				
	}

}

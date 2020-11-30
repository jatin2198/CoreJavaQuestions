import java.util.Comparator;

public class EmployeeModel implements Comparable {

	
	String ename;
	
	int id;
	
	
	@Override
	public String toString() {
		return "EmployeeModel [ename=" + ename + ", id=" + id + "]";
	}


	public EmployeeModel(String ename, int id) {
		super();
		this.ename = ename;
		this.id = id;
	}


//	@Override
//	public int compare(Object arg0, Object arg1) {
//		// TODO Auto-generated method stub
//		return 0;
//	}


	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		
		int ed1=this.id;
		
		EmployeeModel emp=(EmployeeModel)arg0;
		
		int ed2=emp.id;
		
		if(ed1>ed2) {
			
			return +1;
		}
		
		else if(ed1<ed2) {
			
			return -1;
		}
		
		else {
		return 0;}
	}

	
	
}

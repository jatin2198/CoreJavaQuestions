package newHacker;

import java.util.HashMap;

class Student6{
	
	private String name;
	
	private int rollno;

	public Student6(String name, int rollno) {
		super();
		this.name = name;
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	
	
	@Override 
	   public int hashCode() {
		
//		final int temp = 14; 
//        int ans = 1; 
//        ans = temp * ans + rollno; 
        return rollno; 
		
		
	}
	
	
	@Override 
	
	public boolean equals(Object o) {
		
		if(this==o) {
			
			return true;
		}
		
     if(o==null) {
			
			return false;
		}
     
     if (this.getClass() != o.getClass()) { 
         return false; 
     } 
     
     Student6 other = (Student6)o; 
     if (this.rollno != other.rollno) { 
         return false; 
     } 
		return true;
		
		
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 HashMap<Student6, String> map = new HashMap<>(); 
		 
		 Student6 std1=new Student6("Jatin",1);

		 Student6 std2=new Student6("Bhrama",1);
		 Student6 std3=new Student6("Ram",3);
		 Student6 std4=new Student6("Shivam",4);
		 
		 map.put(std1, std1.getName());
		 map.put(std2, std2.getName());
		 map.put(std3, std3.getName());
		 map.put(std4, std4.getName());
		// map.put(std1, std1.getName());
		 
		 std1.setName("Lakshman");
		 
		 std2.setName("Bharat");
		 
		
		 map.forEach((i,j)->System.out.println(i+""+j));
	}

	}

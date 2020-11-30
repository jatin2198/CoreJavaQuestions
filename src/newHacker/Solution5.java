package newHacker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Student {
	private int id;
	private String fname;
	private double cgpa;
	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}
	public int getId() {
		return id;
	}
	public String getFname() {
		return fname;
	}
	public double getCgpa() {
		return cgpa;
	}
	
}

//Complete the code

class sorObj implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Student std1=(Student)o1;
		Student std2=(Student)o2;
		
		if(std1.getCgpa()>std2.getCgpa()) {
			
			return -1;
		}
		
		else if(std1.getCgpa()==std2.getCgpa()) {
			
			return std1.getFname().compareTo(std2.getFname());
		}
		
		else if(std1.getFname().toLowerCase().equals(std2.getFname().toLowerCase())) {
		
			if(std1.getId()>std2.getId()) {
				
				return 1;
			}
		
		}
		return 1;
	}
	
	
}
public class Solution5 
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		
		List<Student> studentList = new ArrayList<Student>();
		while(testCases>0){
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();
			
			Student st = new Student(id, fname, cgpa);
			studentList.add(st);
			
			testCases--;
		}
		
		sorObj don=new sorObj();
		Collections.sort(studentList,don);
      
      	for(Student st: studentList){
			System.out.println(st.getFname());
		}
	}

	
}




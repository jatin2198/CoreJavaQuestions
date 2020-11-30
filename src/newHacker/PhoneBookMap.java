package newHacker;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBookMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		in.nextLine();
		
		Map<String,Integer> phonebook=new HashMap<>();
		for(int i=0;i<n;i++)
		{
			String name=in.nextLine();
			int phone=in.nextInt();
			//
			phonebook.put(name, phone);
			
			in.nextLine();
		}
		
		for(int j=0;j<n;j++) {
			
			String name=in.nextLine();
			
			if(phonebook.containsKey(name)) {
				System.out.println(name+"="+phonebook.get(name));
			}
			
			else {
				System.out.println("Not found");
			}
			//System.out.print(name+"="+phonebook.get(name));
			
		}

	}

}

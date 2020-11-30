import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

final class Empl{
	
	final  int id;
	
	final String name;

	
	//private final HashMap<Integer,String> metadata;

	private final Map<Integer, String> meta;

	//private Map<Integer, String> mp;
	public int getId() {
		return id;
	}

	
	

	public Empl(int id, String name,Map<Integer, String> meta) {
		super();
		this.id = id;
		this.name = name;
		Map<Integer,String> mp=new HashMap<>();
		
		for (Entry<Integer, String> entry :
			meta.entrySet()) {
			mp.put(entry.getKey(), entry.getValue());
		}
		
	this.meta=mp;
		
		
	}







	public Map<Integer, String> getMp() {
		Map<Integer,String> mp=new HashMap<>();
		for (Entry<Integer, String> entry :
			this.meta.entrySet()) {
			mp.put(entry.getKey(), entry.getValue());
		}
		return meta;
	}








	public String getName() {
		return name;
	}
	
	
	
	
}


public class ImmutDemo {


	
	public static void main(String[] args) {

		
		Map<Integer, String> metadata=new HashMap<>();
		
		metadata.put(101, "Arya");

		metadata.put(111, "Arya2k14");
		Empl emp=new Empl(1012,"Jatin",metadata);
		
		
		System.out.print(emp.id+"  "+emp.name+""+emp.getMp());
		
		//metadata.put(111, "Arya2k14");
		
		//System.out.print(emp.id+"  "+emp.name+""+emp.getMp());
		
		metadata.put(1114, "Arya2k141");
		
		System.out.print(emp.id+"  "+emp.name+""+emp.getMp());
	}

}

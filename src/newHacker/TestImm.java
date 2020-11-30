package newHacker;


final class Immu{
	
	final String name="Jatin";
	
	final String sirname="Arya";

	public String getName() {
		return name;
	}

	public String getSirname() {
		return sirname;
	}
	
	
	
	
	
}
public class TestImm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Immu ti=new Immu();
		
		String np=ti.getName();
		
		System.out.print(np);
	}

}

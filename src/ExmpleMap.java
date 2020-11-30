import java.util.HashMap;
import java.util.Map;

public class ExmpleMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String,String> mp=new HashMap<String,String>();
		
		mp.put("101", "Rock");
		mp.put("1001", "SRock");
		mp.put("1081", "FRock");
		mp.put("1019", "CRock");
		mp.put("101", "BRock");
		
		mp.forEach((i,j)->System.out.println(i+"---> Value="+j));
	}

}

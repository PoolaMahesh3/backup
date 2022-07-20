import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
	    map.put("harsha","abc");
	    map.put("mahesh","xyz");
	    map.put("raj","pqr");
	    map.put("sai","lmn");
	    
	    System.out.println("harsha: "+ map.get("harsha"));
	    System.out.println("mahesh: "+ map.get("mahesh"));
	    System.out.println("raj: "+ map.get("raj"));
	    
	}

}
import java.util.HashMap;
import java.util.Map;

public class mapYöntemi {
	
	
	public static void main(String[] args) {
		
		Map<String,String> userMap = new HashMap<String, String>();
		
	      userMap.put("email", "ahmet@example.com");     // verileri ekleme yöntemi bu þekilde
	      userMap.put("name", "Ahmet Zan");
	      userMap.put("address", "Istanbul 34000");
	      userMap.put("mobile", "5322100000");
	      System.out.println("Kullanici adresi " + userMap.get("address"));  //veriyi yazdýramyý get metodyla yaptýk
	      
	      
	      for(Map.Entry<String, String> pairs : userMap.entrySet()) {
	          System.out.println(pairs);                                 // for each dögüsüyle tek tek yazdýrýdkl
	 }
		
		
	}

}

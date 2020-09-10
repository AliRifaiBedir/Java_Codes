
import java.util.ArrayList;

public class listyöntemi {
	
	public static void main(String[] args) {
		ArrayList<String> arrList=new ArrayList<String>();  // array olusturduk
		                                                    //add metodu ile diziye verid ekledik
		arrList.add("Osman");
		arrList.add("Ayþe");
		
		
		for(String str : arrList) {            // for each döngüsü ile yazdýrdýk
		    System.out.println(str);
		}
		
	
		arrList.add(0, "Ozan");      //0. indise ozaný ekledik
		
		
		  arrList.add("Osman");        // burada contains metodu ile osman listede var mý sorgusu yaptýk
	      arrList.add("Ayse");
	      arrList.add(0, "Ozan");
	      if(arrList.contains("Osman")) {
	         System.out.println("Osman bulundu");
	         
	         
	         arrList.add("Osman");
	         arrList.add("Ayse");              // burada ise clear ile list bosaltýlýr ve sonra size ile listenin boyutu yazdýrýrlýr
	         arrList.add(0, "Ozan");      
	         arrList.clear();      
	         if(arrList.size() == 0) {
	            System.out.println("Liste bos!");
	}
		
		
		
	}
	
	}
	

}

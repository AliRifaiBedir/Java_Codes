
import java.util.ArrayList;

public class listy�ntemi {
	
	public static void main(String[] args) {
		ArrayList<String> arrList=new ArrayList<String>();  // array olusturduk
		                                                    //add metodu ile diziye verid ekledik
		arrList.add("Osman");
		arrList.add("Ay�e");
		
		
		for(String str : arrList) {            // for each d�ng�s� ile yazd�rd�k
		    System.out.println(str);
		}
		
	
		arrList.add(0, "Ozan");      //0. indise ozan� ekledik
		
		
		  arrList.add("Osman");        // burada contains metodu ile osman listede var m� sorgusu yapt�k
	      arrList.add("Ayse");
	      arrList.add(0, "Ozan");
	      if(arrList.contains("Osman")) {
	         System.out.println("Osman bulundu");
	         
	         
	         arrList.add("Osman");
	         arrList.add("Ayse");              // burada ise clear ile list bosalt�l�r ve sonra size ile listenin boyutu yazd�r�rl�r
	         arrList.add(0, "Ozan");      
	         arrList.clear();      
	         if(arrList.size() == 0) {
	            System.out.println("Liste bos!");
	}
		
		
		
	}
	
	}
	

}

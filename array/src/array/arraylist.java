package array;
import java.util.ArrayList;

public class arraylist {
	public static void main(String [] args) {
		
		ArrayList<String> group=new ArrayList<String>();//burada group isimli bir arraylist yapt�k.
		                                                // String burada veri tipini g�steriyor(int de olablir)
		group.add("metallica");
		group.add("gun and roses"); //burada verilerimi ekledik
		group.add("black sabbath");
		
		//System.out.println("0. veri :"+group.get(0)); // Array de veri getirtme
			
		
		
		//System.out.println("Array uzunlugu : "+group.size()); // array uzunlu�u
		
		
		for(int i=0;i<group.size();i++) {
			System.out.println("veriler :"+group.get(i));
			
			
		}
		
		
		//group.remove();//bu da veri siler
		System.out.println(group.get(0));
		
		System.out.println(group.indexOf("metallica"));// ilgili verinin dizinin ka��nc� s�ras�nda old. s�yler
		
	}

}

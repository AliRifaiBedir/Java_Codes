package array;
import java.util.ArrayList;

public class arraylist {
	public static void main(String [] args) {
		
		ArrayList<String> group=new ArrayList<String>();//burada group isimli bir arraylist yaptýk.
		                                                // String burada veri tipini gösteriyor(int de olablir)
		group.add("metallica");
		group.add("gun and roses"); //burada verilerimi ekledik
		group.add("black sabbath");
		
		//System.out.println("0. veri :"+group.get(0)); // Array de veri getirtme
			
		
		
		//System.out.println("Array uzunlugu : "+group.size()); // array uzunluðu
		
		
		for(int i=0;i<group.size();i++) {
			System.out.println("veriler :"+group.get(i));
			
			
		}
		
		
		//group.remove();//bu da veri siler
		System.out.println(group.get(0));
		
		System.out.println(group.indexOf("metallica"));// ilgili verinin dizinin kaçýncý sýrasýnda old. söyler
		
	}

}

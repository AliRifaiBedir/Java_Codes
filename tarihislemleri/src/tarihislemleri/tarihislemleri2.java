package tarihislemleri;


import java.util.Date; 
 // tarih alma için
import java.text.SimpleDateFormat; // tarihi daha anlasýlýr göstermek için
import java.text.DateFormat; // tarihih daha anlasýlýr göstermek için
import java.text.ParseException;  // tarihih bir deðiskene atmak için

public class tarihislemleri2 {
	
	
	public static void main(String[] args) throws ParseException {
		
		
		Date tarih =new Date();
		System.out.println(tarih.toString());
		
		DateFormat tarih2= new SimpleDateFormat("yyyy/mm/dd hh:mm:ss ");
		
		System.out.println(tarih2.format(tarih));
		
		DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
        Date tarih3 = df.parse("1984/01/01");
        System.out.println(tarih3);
        
       
        
  
		
		
		

		
				
		
		
		
		
		
		
	}

}

package tarihislemleri;


import java.util.Date; 
 // tarih alma i�in
import java.text.SimpleDateFormat; // tarihi daha anlas�l�r g�stermek i�in
import java.text.DateFormat; // tarihih daha anlas�l�r g�stermek i�in
import java.text.ParseException;  // tarihih bir de�iskene atmak i�in

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

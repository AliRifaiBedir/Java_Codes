
public class trycatch {
	
	
	/*
	
	try
	{
	    //hesaplanmak istenen ifade        
	}
	catch            
	{
	    //Bir hata t�r� tespit edilince verilmesi gereken mesaj
	}            
	catch            
	{
	    //ba�ka Bir hata t�r� tespit edilince verilmesi gereken mesaj
	}            
	finally
	{
	    //her durumda �al��t�r�lacak olan kod par�as�*/
	
	
	
	public static void main(String[] args) {
		
		
		try {
			
			int a =42/ 0;
		}
		catch (ArithmeticException MatematikselHata) {
			
			System.out.println("sistem hatas�"+ MatematikselHata.getMessage());
			
		
			
		}
		
	    }
	
	}



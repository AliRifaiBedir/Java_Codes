
public class trycatch {
	
	
	/*
	
	try
	{
	    //hesaplanmak istenen ifade        
	}
	catch            
	{
	    //Bir hata türü tespit edilince verilmesi gereken mesaj
	}            
	catch            
	{
	    //baþka Bir hata türü tespit edilince verilmesi gereken mesaj
	}            
	finally
	{
	    //her durumda çalýþtýrýlacak olan kod parçasý*/
	
	
	
	public static void main(String[] args) {
		
		
		try {
			
			int a =42/ 0;
		}
		catch (ArithmeticException MatematikselHata) {
			
			System.out.println("sistem hatasý"+ MatematikselHata.getMessage());
			
		
			
		}
		
	    }
	
	}



package fonksiyonlar;

public class overloading {
	public static void toplama(int a,int b ,int c ) {
		System.out.println("toplamlar� "+(a+b+c));
	}
	public static void toplama(int a,int b ) {
		System.out.println("toplamlar� "+(a+b));
	
		
	}
	
	
	
	
	
	public static void main(String [] args) {
		
		toplama(10,20);
		
		
	}

}

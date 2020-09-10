package fonksiyonlar;



public class fonksiyonlar {
	
	public static int ikiekle(int a ) {
		return(a+2);
	}
	public static int üccarp(int a ) {
		return(a*3);
	}
	
	public static int altýcýkar(int a ) {
		return(a-6);
	}
	
	
   public static void main(String [] args) {
	   
	   System.out.println("sonuc : "+ altýcýkar(üccarp(ikiekle(4))));
	   
	   
	   

	}
   
   /*import java.util.Scanner;


	
	public static void faktöriyel(){
	
	Here we are calculate factorial with function
	
		int fakt=1;
		Scanner scan=new Scanner(System.in);
		System.out.println("sayi girin");
		int sayi=scan.nextInt();
		while(sayi>1) {
			fakt*=sayi;
			sayi--;	
		}
		System.out.println("faktöriyel : "+fakt);
		
		public static void toplama(int a ,int b ,int c ) {
		System.out.println("3 sayý girin");
		System.out.println("toplamý "+(a+b+c));
		
	}
		*/
}
	
		
		
		
		
		
		
	


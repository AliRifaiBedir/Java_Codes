package whiledöngüsü;

import java.util.Scanner;

public class whiledöngüsü {
	/*     Begin Loop
	 *     While(condition){
	 *     operation;
	 *     operation;
	 *      .
	 *      .
	 *      .
	 *      increase or decrease condition;
	 *   }
	 *   
	 *   As you see while Loop using is basic.
	 *   
	 *   Ýn example we try to calculate factorial
	 *   with while.
	 */
	
	
	
	
	
	public static void main(String [] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			
			System.out.println("faktöriyel saysýný giriniz:");
			int sayi=scan.nextInt();
			
			int faktöriyel=1;
			while(sayi>1) {
				faktöriyel*=sayi;
				sayi-=1;
				
			}
			System.out.println("faktöriyel:"+faktöriyel);
			
			
			
			
			
}
		
	}
}


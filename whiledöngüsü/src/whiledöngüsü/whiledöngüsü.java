package whiled�ng�s�;

import java.util.Scanner;

public class whiled�ng�s� {
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
	 *   �n example we try to calculate factorial
	 *   with while.
	 */
	
	
	
	
	
	public static void main(String [] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			
			System.out.println("fakt�riyel says�n� giriniz:");
			int sayi=scan.nextInt();
			
			int fakt�riyel=1;
			while(sayi>1) {
				fakt�riyel*=sayi;
				sayi-=1;
				
			}
			System.out.println("fakt�riyel:"+fakt�riyel);
			
			
			
			
			
}
		
	}
}


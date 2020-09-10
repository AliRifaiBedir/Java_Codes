import java.util.Scanner;

public class breakvecontinue {
	/*     break ends Loops 
	 *     continue does not execute operations which of below
	 *     the continue term and  goes top the Loop
	 *     
	 *     
	 *     
	 * 
	 */


public static void main(String [] args) {
	
	try (Scanner scan = new Scanner(System.in)) {
		while(true) {
		System.out.println("bir karakter girin");
		String karakter;
		
		karakter=scan.nextLine();
		
		if(karakter.equals("q")) {
			System.out.println("programdan cýkýlýyor");
			break;
			
			
		}
		System.out.println("karakter basýlýyor");
		
}
	}
	int i =0;
	while(i<10) {
		
		if(i==2||i==4) {
			i++;
			continue;
			
		}
		System.out.println(i);
		i++;
		
	}
	
	
	
       }
}








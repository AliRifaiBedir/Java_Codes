package array;

import java.util.Scanner;

public class denemeler2 {

	// burada matrsite en büyük ve en küçük eleman bulma yapýlacaktýr
	
	public static void main(String[] args) {
		
		int matris[][]=new int[3][4];
		
		System.out.println("lütfen deðerleri girin");
		
		try (Scanner scan = new Scanner(System.in)) {
			for (int i =0;i<matris.length;i++) {
				System.out.println(i+1+".satýriçi deðerleri girin");
				for(int j =0;j<matris[0].length;j++) {
					
					matris[i][j]=scan.nextInt();
					
				}
				
			}
		}
		
		for (int i =0;i<matris.length;i++) {
			
			for(int j =0;j<matris[0].length;j++) {
		
		     System.out.print(matris[i][j]+" ");
	}
	System.out.println();
	}
		
		int enkücük=-5;
		int enbüyük=5;
		
		for(int k =0;k<matris.length;k++) {
			
			for(int m =0;m<matris[0].length;m++) {
				
				if(matris[k][m]<enkücük) {
					
					enkücük=matris[k][m];
				}
				
				if(matris[k][m]>enbüyük) {
					
					enbüyük=matris[k][m];
			
				
			}
				
				
		}
		}	
		
			System.out.println("en büyük sayý"+ enbüyük);
			System.out.println("en kücük sayý"+enkücük);
		
		
		
		
		
		
		
	
		
	}
}

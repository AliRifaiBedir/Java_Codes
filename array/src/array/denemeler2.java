package array;

import java.util.Scanner;

public class denemeler2 {

	// burada matrsite en b�y�k ve en k���k eleman bulma yap�lacakt�r
	
	public static void main(String[] args) {
		
		int matris[][]=new int[3][4];
		
		System.out.println("l�tfen de�erleri girin");
		
		try (Scanner scan = new Scanner(System.in)) {
			for (int i =0;i<matris.length;i++) {
				System.out.println(i+1+".sat�ri�i de�erleri girin");
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
		
		int enk�c�k=-5;
		int enb�y�k=5;
		
		for(int k =0;k<matris.length;k++) {
			
			for(int m =0;m<matris[0].length;m++) {
				
				if(matris[k][m]<enk�c�k) {
					
					enk�c�k=matris[k][m];
				}
				
				if(matris[k][m]>enb�y�k) {
					
					enb�y�k=matris[k][m];
			
				
			}
				
				
		}
		}	
		
			System.out.println("en b�y�k say�"+ enb�y�k);
			System.out.println("en k�c�k say�"+enk�c�k);
		
		
		
		
		
		
		
	
		
	}
}

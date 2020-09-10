package array;

import java.util.Scanner;

public class array {
	public static void ortalama(int[] dizi) {
		int toplam=0;
	for(int i=0;i<dizi.length;i++) {
		toplam+=dizi[i];
	}
		System.out.println("ortalama"+(toplam/dizi.length));
		
	}
	
	
	public static void main(String [] args) {
		/*
		int [] dizi= {10,20,30,40,50};
		int [] dizi2=new int[5];
		dizi2[0]=1;
		dizi2[1]=2;
		dizi2[2]=2; 
		dizi2[3]=2;
		dizi2[4]=2;
		System.out.println("dizi 2 nin deðeri "+dizi2[2]);
		
		
		
		int[] dizi3= {7,8,9,4,5,6};
		 for(int i=0;i<dizi3.length;i++) {    
			System.out.println("deðerler "+dizi3[i]);
		}
		*/
		
		
		try (Scanner scan = new Scanner(System.in)) {
			int[] dizi4=new int[5];
			System.out.println("lütfen dizi deðerlerini girin");
			
			for(int i=0;i<dizi4.length;i++) {
				dizi4[i]=scan.nextInt();
			}
			for(int i=0;i<dizi4.length;i++) {
				System.out.println(dizi4[i]);
				}
			ortalama(dizi4);
		}
	}
	
}

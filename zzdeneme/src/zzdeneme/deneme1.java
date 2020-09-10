package zzdeneme;

import java.util.Scanner;

public class deneme1 {
	
	

	public static void main(String[] args) {
	
		Scanner scan =new Scanner(System.in);
		int merkezsatırı=scan.nextInt();
		
		 //kullanıcıdan merkez satırdaki * sayısı alınır.
		int satırsayısı = merkezsatırı*2-1;
		int satırdakiyıldızsayısı=1; //ilk satırımızda bir * şeklinde başlayacaktır.
		int satırdakiboşluksayısı = merkezsatırı - satırdakiyıldızsayısı;
		while (satırsayısı>0) {
		        while (satırdakiyıldızsayısı <= merkezsatırı) {
		                while (satırdakiboşluksayısı >= 0) {
		                        print(" "); //boşluk bastır
		                }
		                print("x"); //x ve boşluk bastır
		                if (satırdakiyıldızsayısı < merkezsatırı)
		                        satırdakiyıldızsayısı++ ;
		                else
		                        satırdakiyıldızsayısı-- ;
		                }
		        print("\n"); //yeni satıra gecme
		       
				satırsayısı-- ;
		        satırdakiboşluksayısı = merkezsatırı - satırdakiyıldızsayısı;
		}
}

	private static void print(String string) {
		// TODO Auto-generated method stub
		
	}

}
	
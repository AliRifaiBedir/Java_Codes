package zzdeneme;

import java.util.Scanner;

public class deneme1 {
	
	

	public static void main(String[] args) {
	
		Scanner scan =new Scanner(System.in);
		int merkezsat�r�=scan.nextInt();
		
		 //kullan�c�dan merkez sat�rdaki * say�s� al�n�r.
		int sat�rsay�s� = merkezsat�r�*2-1;
		int sat�rdakiy�ld�zsay�s�=1; //ilk sat�r�m�zda bir * �eklinde ba�layacakt�r.
		int sat�rdakibo�luksay�s� = merkezsat�r� - sat�rdakiy�ld�zsay�s�;
		while (sat�rsay�s�>0) {
		        while (sat�rdakiy�ld�zsay�s� <= merkezsat�r�) {
		                while (sat�rdakibo�luksay�s� >= 0) {
		                        print(" "); //bo�luk bast�r
		                }
		                print("x"); //x ve bo�luk bast�r
		                if (sat�rdakiy�ld�zsay�s� < merkezsat�r�)
		                        sat�rdakiy�ld�zsay�s�++ ;
		                else
		                        sat�rdakiy�ld�zsay�s�-- ;
		                }
		        print("\n"); //yeni sat�ra gecme
		       
				sat�rsay�s�-- ;
		        sat�rdakibo�luksay�s� = merkezsat�r� - sat�rdakiy�ld�zsay�s�;
		}
}

	private static void print(String string) {
		// TODO Auto-generated method stub
		
	}

}
	
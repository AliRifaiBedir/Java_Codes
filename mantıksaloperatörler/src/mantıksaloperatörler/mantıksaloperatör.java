package mant�ksaloperat�rler;

import java.util.Scanner;

public class mant�ksaloperat�r {

	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			String kullan�c�="alirifai";
			String sifre="12345";
			
			System.out.println("kulan�c� ad� giri");
			String kul_ad�=scan.nextLine();
			System.out.println("parola girin");
			String parola=scan.nextLine();
			
			if(!(kullan�c�.equals(kul_ad�))&&!(parola.equals(sifre))) {
				System.out.println("kullan��c ad� ve parola yanl�s");
			}
			
			else if(kullan�c�.equals(kul_ad�) && !(sifre.equals(parola))) {
				System.out.println("sifre yanl�s");
			}
			else if (!(kullan�c�.equals(kul_ad�) && (sifre.equals(parola)))) {
				System.out.println("isim yanl�s");
			}
			else {
				System.out.println("giris yap�n�z");
			}
		}
	
	}
}
package mantýksaloperatörler;

import java.util.Scanner;

public class mantýksaloperatör {

	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			String kullanýcý="alirifai";
			String sifre="12345";
			
			System.out.println("kulanýcý adý giri");
			String kul_adý=scan.nextLine();
			System.out.println("parola girin");
			String parola=scan.nextLine();
			
			if(!(kullanýcý.equals(kul_adý))&&!(parola.equals(sifre))) {
				System.out.println("kullanýýc adý ve parola yanlýs");
			}
			
			else if(kullanýcý.equals(kul_adý) && !(sifre.equals(parola))) {
				System.out.println("sifre yanlýs");
			}
			else if (!(kullanýcý.equals(kul_adý) && (sifre.equals(parola)))) {
				System.out.println("isim yanlýs");
			}
			else {
				System.out.println("giris yapýnýz");
			}
		}
	
	}
}
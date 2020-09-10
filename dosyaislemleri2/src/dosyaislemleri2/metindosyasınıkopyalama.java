package dosyaislemleri2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class metindosyasýnýkopyalama {
	public static class Kopyala{
	    String kaynakDosyaAdi, hedefDosyaAdi;
	    BufferedReader kaynakBuffer;
	    BufferedWriter hedefBuffer;
	    String satir;

	    public static void main (String[] args) {
	        if (args.length == 3 && args[1].toUpperCase().equals("TO")) {
	            new Kopyala().kopya(args[0], args[2]); 
	        }
	        else {
	            System.out.println("Kullanim sekli: ");
	            System.out.println("java Kopyala <dosya1> to <dosya2>");
	        }
	    }

	    public boolean kopya(String isim1, String isim2) {
	        kaynakDosyaAdi=isim1;
	        hedefDosyaAdi=isim2;
	        return dosyayiAc() && dosyayiKopyala() && dosyayiKapat();
	    }

	    private boolean dosyayiAc() {
	        // Kaynak dosyayý aç
	        try {      
	            kaynakBuffer = new BufferedReader(
	                    new FileReader(kaynakDosyaAdi));
	        }
	        catch (IOException e) {
	            System.out.println(kaynakDosyaAdi
	                    +" dosyasinin acilisinda sorun var!");
	            return false;
	        }

	        // Hedef dosyayý aç
	        try    {      
	            hedefBuffer = new BufferedWriter(
	                    new FileWriter(hedefDosyaAdi));
	        }
	        catch (IOException e) {
	            System.out.println(hedefDosyaAdi
	                    +" dosyasinin acilisinda sorun var!");
	            return false;
	        }
	        return true; //iki dosya da ulasilabilirse true döndürür
	    }

	    private boolean dosyayiKopyala() {
	        //esas metodumuz
	        try    {      
	            satir = kaynakBuffer.readLine();
	            while (satir != null) {
	                hedefBuffer.write(satir);
	                hedefBuffer.newLine();
	                satir = kaynakBuffer.readLine();
	            }
	        }
	        catch (IOException e) {
	            System.out.println("Kopyalama yapilamiyor.");
	            return false;
	        }
	        return true;
	    }

	    private boolean dosyayiKapat() {
	        boolean sorunsuzMu=true;
	        // kaynaðý kapat
	        try    {      
	            kaynakBuffer.close();
	        }
	        catch (IOException e) {
	            System.out.println(kaynakDosyaAdi+" dosyasinin kapanisinda hata!");
	            sorunsuzMu = false;
	        }
	        // hedefi kapat
	        try    {      
	            hedefBuffer.close();
	        }
	        catch (IOException e) {
	            System.out.println(hedefDosyaAdi+" dosyasinin kapanisinda hata!");
	            sorunsuzMu = false;
	        }
	        return sorunsuzMu;
	    }
	}
	
		
		
		
		
		

	
}


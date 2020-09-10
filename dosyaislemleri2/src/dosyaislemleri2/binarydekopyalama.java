package dosyaislemleri2;



import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class binarydekopyalama {
	

	
	    
	    public static void main(String[] args) {
	        
	        //Dosyalarýnýzýn yolunu belirtin.
	        String kaynakDosya = "Kaynak dosyanýn yolu";
	        String hedefDosya = "Hedef dosyanýn yolu";
	        
	        try {
	            //Kopyalama iþlemi için InputStream ve OutputStream nesnelerinizi oluþturun.
	            FileInputStream fis = new FileInputStream(kaynakDosya);
	            FileOutputStream fos = new FileOutputStream(hedefDosya);
	            
	            //Kopyalanacak satýrýn ilk harfinin yerini belirtin.
	            int offset = 0;
	            //Kopyalanacak satirin boyutunu tanýmlayýn.
	            int satirinboyutu = 0;
	            //Kopyalanacak satýr için array oluþturun.
	            byte[] satir = new byte[1024];
	            
	            //Ýlk satýrý okuyup boyutunu alýn.
	            satirinboyutu = fis.read(satir);
	            
	            //Okunan satýrlarýn boyutu -1 deðilse, yani sona gelinmediyse kopyalayýn.
	            while (satirinboyutu != -1) {
	                //Hedef dosyaya yazýn.
	                fos.write(satir, offset, satirinboyutu);
	                //Yeni bir satýr okuyun.
	                satirinboyutu = fis.read(satir);
	            }
	            
	            //Her iki dosyayý da kapatýn.
	            fis.close();
	            fos.close();
	            
	        }
	        catch (IOException e) {
	            //Bir hata durumunda programýnýza uyarý verdirin.
	            System.out.println("Bir hata oluþtu " + e);
	        }
	    }
	}



package dosyaislemleri2;



import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class binarydekopyalama {
	

	
	    
	    public static void main(String[] args) {
	        
	        //Dosyalar�n�z�n yolunu belirtin.
	        String kaynakDosya = "Kaynak dosyan�n yolu";
	        String hedefDosya = "Hedef dosyan�n yolu";
	        
	        try {
	            //Kopyalama i�lemi i�in InputStream ve OutputStream nesnelerinizi olu�turun.
	            FileInputStream fis = new FileInputStream(kaynakDosya);
	            FileOutputStream fos = new FileOutputStream(hedefDosya);
	            
	            //Kopyalanacak sat�r�n ilk harfinin yerini belirtin.
	            int offset = 0;
	            //Kopyalanacak satirin boyutunu tan�mlay�n.
	            int satirinboyutu = 0;
	            //Kopyalanacak sat�r i�in array olu�turun.
	            byte[] satir = new byte[1024];
	            
	            //�lk sat�r� okuyup boyutunu al�n.
	            satirinboyutu = fis.read(satir);
	            
	            //Okunan sat�rlar�n boyutu -1 de�ilse, yani sona gelinmediyse kopyalay�n.
	            while (satirinboyutu != -1) {
	                //Hedef dosyaya yaz�n.
	                fos.write(satir, offset, satirinboyutu);
	                //Yeni bir sat�r okuyun.
	                satirinboyutu = fis.read(satir);
	            }
	            
	            //Her iki dosyay� da kapat�n.
	            fis.close();
	            fos.close();
	            
	        }
	        catch (IOException e) {
	            //Bir hata durumunda program�n�za uyar� verdirin.
	            System.out.println("Bir hata olu�tu " + e);
	        }
	    }
	}



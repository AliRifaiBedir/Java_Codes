package dosyaislemleri;

import java.io.File; // dosya oluþturmak için
import java.io.FileInputStream;//resim ya danetten çektiðimiz bilgiyiy okumak için
import java.io.FileOutputStream;//bir resim ya da netten çektiðimiz dosya için grekli
import java.io.FileReader;//dosya okuma islemleri
import java.io.FileWriter;//dosyada yazýmý baþlatmak için kullanýlýr
import java.io.IOException;
import java.io.BufferedInputStream;//resim ya danetten çektiðimiz bilgiyiy okumak için
import java.io.BufferedOutputStream;//bir resim ya da netten çektiðimiz dosya için grekli
import java.io.BufferedReader;//dosya okuma islemleri için grekeli
import java.io.BufferedWriter;//bunun ile yazma iþlemlerini gerçekleþtiriiz






public class dosyaislemleri {
	public static void main(String[] args) throws IOException {
		
		
		String yazý="baba naber ";
		
		File nesne =new File("dosya.txt");    // nesne adýnda txt oluþturudk ve file adlý nesneye atadýk.
		if(!nesne.exists()) {
			
			nesne.createNewFile();
		}
		
		
		FileWriter fWriter =new FileWriter(nesne,false);   // burada yazma iþlemini baþlatýyoruz ayrýca false sayesinde dosyaya sürekli baþtan yazý yazarýz
		BufferedWriter bWriter =new BufferedWriter(fWriter);//yazma iþlemini gerçeklistircek nesne ve constructýr burada
		bWriter.write(yazý);
		bWriter.close();
		
		String line;
		
		FileReader fReader =new FileReader(nesne);           //dosya okuma iþlemi için nesne olusturudk
		BufferedReader bReader=new BufferedReader(fReader);  //buffer ile okuyoruz yine
		
		
		while ((line = bReader.readLine()) != null) {     // line adlý deðiþkene son karakter null gelene kadar yazýlarý atadýk

			 System.out.println(line);
		}
		
		bReader.close();
		
		
		
		byte[] data = {0x01, 0x02};

		File yenidosya = new File("binary.dat");
		FileOutputStream fos = new FileOutputStream(yenidosya);//binary dosyaya byte tipinde bir deðiþken yazmak içiçn kullanulýr
		BufferedOutputStream bos = new BufferedOutputStream(fos); // tampon bellek saðlar
		bos.write(data);
		bos.close();
		
		data = new byte[(int) yenidosya.length()]; // burada bir byte dizisi olusturduk
		FileInputStream fis = new FileInputStream(yenidosya); // bu metodla binarfile adlý dosyaya ulasþtýk
		BufferedInputStream bis = new BufferedInputStream(fis); // okuma islemi yine buffered ile yapýldý
		bis.read(data, 0, data.length);
		bis.close();
		
		
		
		
		
		
		
		
	}
	
	
	
	
	

}

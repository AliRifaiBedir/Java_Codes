package dosyaislemleri;

import java.io.File; // dosya oluşturmak için
import java.io.FileInputStream;//resim ya da netten çektiğimiz bilgiyiy okumak için
import java.io.FileOutputStream;//bir resim ya da netten çektiğimiz dosya için grekli
import java.io.FileReader;//dosya okuma islemleri
import java.io.FileWriter;//dosyada yazımı başlatmak için kullanılır
import java.io.IOException;
import java.io.BufferedInputStream;//resim ya danetten çektiğimiz bilgiyiy okumak için
import java.io.BufferedOutputStream;//bir resim ya da netten çektiğimiz dosya için grekli
import java.io.BufferedReader;//dosya okuma islemleri için grekeli
import java.io.BufferedWriter;//bunun ile yazma işlemlerini gerçekleştiriiz






public class dosyaislemleri {
	public static void main(String[] args) throws IOException {
		
		
		String yazı="baba naber ";
		
		File nesne =new File("dosya.txt");    // nesne adında txt oluşturudk ve file adlı nesneye atadık.
		if(!nesne.exists()) {
			
			nesne.createNewFile();
		}
		
		
		FileWriter fWriter =new FileWriter(nesne,false);   // burada yazma işlemini başlatıyoruz ayrıca false sayesinde dosyaya sürekli baştan yazı yazarız
		BufferedWriter bWriter =new BufferedWriter(fWriter);//yazma işlemini gerçeklistircek nesne ve constructır burada
		bWriter.write(yazı);
		bWriter.close();
		
		String line;
		
		FileReader fReader =new FileReader(nesne);           //dosya okuma işlemi için nesne olusturudk
		BufferedReader bReader=new BufferedReader(fReader);  //buffer ile okuyoruz yine
		
		
		while ((line = bReader.readLine()) != null) {     // line adlı değişkene son karakter null gelene kadar yazıları atadık

			 System.out.println(line);
		}
		
		bReader.close();
		
		
		
		byte[] data = {0x01, 0x02};

		File yenidosya = new File("binary.dat");
		FileOutputStream fos = new FileOutputStream(yenidosya);//binary dosyaya byte tipinde bir değişken yazmak içiçn kullanulır
		BufferedOutputStream bos = new BufferedOutputStream(fos); // tampon bellek sağlar
		bos.write(data);
		bos.close();
		
		data = new byte[(int) yenidosya.length()]; // burada bir byte dizisi olusturduk
		FileInputStream fis = new FileInputStream(yenidosya); // bu metodla binarfile adlı dosyaya ulasştık
		BufferedInputStream bis = new BufferedInputStream(fis); // okuma islemi yine buffered ile yapıldı
		bis.read(data, 0, data.length);
		bis.close();
		
		
		
		
		
		
		
		
	}
	
	
	
	
	

}

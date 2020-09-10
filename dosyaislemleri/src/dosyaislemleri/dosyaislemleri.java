package dosyaislemleri;

import java.io.File; // dosya olu�turmak i�in
import java.io.FileInputStream;//resim ya danetten �ekti�imiz bilgiyiy okumak i�in
import java.io.FileOutputStream;//bir resim ya da netten �ekti�imiz dosya i�in grekli
import java.io.FileReader;//dosya okuma islemleri
import java.io.FileWriter;//dosyada yaz�m� ba�latmak i�in kullan�l�r
import java.io.IOException;
import java.io.BufferedInputStream;//resim ya danetten �ekti�imiz bilgiyiy okumak i�in
import java.io.BufferedOutputStream;//bir resim ya da netten �ekti�imiz dosya i�in grekli
import java.io.BufferedReader;//dosya okuma islemleri i�in grekeli
import java.io.BufferedWriter;//bunun ile yazma i�lemlerini ger�ekle�tiriiz






public class dosyaislemleri {
	public static void main(String[] args) throws IOException {
		
		
		String yaz�="baba naber ";
		
		File nesne =new File("dosya.txt");    // nesne ad�nda txt olu�turudk ve file adl� nesneye atad�k.
		if(!nesne.exists()) {
			
			nesne.createNewFile();
		}
		
		
		FileWriter fWriter =new FileWriter(nesne,false);   // burada yazma i�lemini ba�lat�yoruz ayr�ca false sayesinde dosyaya s�rekli ba�tan yaz� yazar�z
		BufferedWriter bWriter =new BufferedWriter(fWriter);//yazma i�lemini ger�eklistircek nesne ve construct�r burada
		bWriter.write(yaz�);
		bWriter.close();
		
		String line;
		
		FileReader fReader =new FileReader(nesne);           //dosya okuma i�lemi i�in nesne olusturudk
		BufferedReader bReader=new BufferedReader(fReader);  //buffer ile okuyoruz yine
		
		
		while ((line = bReader.readLine()) != null) {     // line adl� de�i�kene son karakter null gelene kadar yaz�lar� atad�k

			 System.out.println(line);
		}
		
		bReader.close();
		
		
		
		byte[] data = {0x01, 0x02};

		File yenidosya = new File("binary.dat");
		FileOutputStream fos = new FileOutputStream(yenidosya);//binary dosyaya byte tipinde bir de�i�ken yazmak i�i�n kullanul�r
		BufferedOutputStream bos = new BufferedOutputStream(fos); // tampon bellek sa�lar
		bos.write(data);
		bos.close();
		
		data = new byte[(int) yenidosya.length()]; // burada bir byte dizisi olusturduk
		FileInputStream fis = new FileInputStream(yenidosya); // bu metodla binarfile adl� dosyaya ulas�t�k
		BufferedInputStream bis = new BufferedInputStream(fis); // okuma islemi yine buffered ile yap�ld�
		bis.read(data, 0, data.length);
		bis.close();
		
		
		
		
		
		
		
		
	}
	
	
	
	
	

}

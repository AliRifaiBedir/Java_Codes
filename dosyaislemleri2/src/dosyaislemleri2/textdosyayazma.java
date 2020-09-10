package dosyaislemleri2;

import java.util.Stack;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class textdosyayazma {
	public static void main(String[] args) throws IOException {
		
		
		  String dosyaAdi = "siir.txt";  
		
		FileWriter yazar=new FileWriter(dosyaAdi);
		yazar.write("coklarindan dusuyor da bunca \n ");
        yazar.write("gormuyor gelip gecenler\n");
        yazar.write("egilip aliyorum\n");
        yazar.write("solgun bir gul oluyor dokununca - behcet necatigil\n");
        yazar.close();
	
        // aþaðýda ise okuma yaptýk
            
        String satir;
        try{
            BufferedReader oku = new BufferedReader(new FileReader(dosyaAdi));
            satir = oku.readLine();
            while (satir != null) {
                System.out.println(satir);
                satir = oku.readLine();
            }
            oku.close();
        }
        catch (IOException iox){
            System.out.println(dosyaAdi+" adli dosya okunamiyor.");
        }
        }
        
        
        
    
    }
	

	


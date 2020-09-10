package dosyaislemleri;
import  java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;





public class denemetekrar {
public static void main(String[] args) throws IOException {
	
	

	File datafile=new File("data.dat");
	
	FileOutputStream fso=new FileOutputStream(datafile);
	BufferedOutputStream bfs=new BufferedOutputStream(fso);
	byte data []= {0x01,0x02};
	bfs.write(data);
	
	bfs.close();
	 data = new byte[(int) datafile.length()];
	FileInputStream fis = new FileInputStream(datafile);
	BufferedInputStream bis = new BufferedInputStream(fis);
	bis.read(data, 0, data.length);
	bis.close();
	
	
	
	
	
	
	
	
	
	
}



}

	
	
	
	

package array;

public class cokboyutluaaray {
	public static void main(String [] args) {
	/*int[][]dizi5= {{10,20,30},{40,50,60}};               // burada çok boyutlu olusturduk
	
	System.out.println("dizinin deðerleri: "+dizi5[0][0]);*/
		
		
   int[][] dizi6=new int[2][3];
   
   dizi6[0][0]=12;
   dizi6[0][1]=13;
   dizi6[0][2]=14;
   dizi6[1][0]=15;
   dizi6[1][1]=16;
   dizi6[1][2]=17;
   
  for (int i=0;i<2;i++) {
	  for(int j=0;j<3;j++) {
		  System.out.print(dizi6[i][j]+"| ");
	  }
	  System.out.println();
  }
   
	
	
		
		
}
}
package array;

public class denemeler3 {
	
	
	public static void main(String[] args) {
		
		
		int[][] aMatris=new int [][]{{2,1},{-1,4},{5,3}};
        int[][] bMatris=new int [][]{{3,2,1,-1},{4,-2,1,2}};
        int[][] cMatris=new int [3][4];
        int i,j,k;

        /*a ve b matrislerinin yazdýrýlmasý*/
        System.out.println("A matrisi");
        for(i=0; i<=2; i++) {
            for(j=0; j<=1; j++) {
                System.out.print(aMatris[i][j]+"\t");
            }
            System.out.println();
            System.out.println();
        }

        System.out.println("B matrisi");
        for(i=0; i<=1; i++){
            for(j=0;j<=3;j++) {
                System.out.print(bMatris[i][j]+"\t");
            }
            System.out.println();
        }

        
        for(i=0;i<3;i++) {
        	for(j=0;j<4;j++) {
        		cMatris[i][j]=0;
        		for(k=0;k<2;k++) {
        			cMatris[i][j]=cMatris[i][j]+aMatris[i][k]*bMatris[k][j];
        			  
        		  }
        	  
        	  
          }
        
        
        
        
	}		
			
        System.out.println("C matrisi");
        for(i=0; i<=2; i++)
        {
            for(j=0;j<=3;j++)
                System.out.print(cMatris[i][j]+"\t");
            System.out.println();
	

	}
}
}
		

		
		
	



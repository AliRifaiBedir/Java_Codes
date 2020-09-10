package array;

public class denemeler4 {
	
	public static void main(String[] args) {
	    char[][] matris={
                {'m','a','v','b'},
                {'z','y','c','e'},
                {'g','f','p','q'},
                {'r','h','i','k'}
        };
		 int i,j,k;
	        k=0;
	        char temp;
	        char[] harfler=new char[16];

	        /*dizideki harflerden c-r arasýnd
	         * olanlarý bulalým */
	        for(i=0; i<=3; i++){
	            for(j=0; j<=3; j++) {
	                if(matris[i][j]>='c' && matris[i][j]<='r') {
	                    harfler[k]=matris[i][j];
	                    k++;
	                }
	                System.out.print("["+i+"]["+j+"]=" + matris[i][j]+"\t");
	            }
	            System.out.println();
	        }

	        /*c-r arasý harfleri ekrana basalým*/
	        System.out.println();
	        System.out.println("c-r arasi harfler: ");
	        for(i=0; i<=k-1; i++) {
	            System.out.print(harfler[i]+" ");
	        }
	        
	        for(i=0; i<k; i++){
	            for(j=0; j<k; j++) {
	            	
	            	if(harfler[i]>harfler[j]) {
	            		
	            		temp=harfler[i];
	            		harfler[i]=harfler[j];
	            		
	            		harfler[j]=temp;
	            		
	            	}
	            	
	            	
	            }
	            	
	            }
	                
	        System.out.println();
	        System.out.println("c-r arasi harfler: ");
	        for(i=0; i<=k-1; i++) {
	            System.out.print(harfler[i]+" ");
	        
	        
	        
	}
}
}
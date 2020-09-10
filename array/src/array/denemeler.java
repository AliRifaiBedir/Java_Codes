package array;

public class denemeler {
	
	
	public static void main(String[] args) {
		
		int [][]satisTablosu = new int[][]{
            {700,600,650},
            {900,800,700},
            {300,400,350},
            {500,450,470},
            {600,500,480}
    };
    int i, j, toplamSatis, toplamOtomobilSayisi=0;

    /*bellekteki satisTablosu dizisinin 
     * elemanlar�n�n ekrana yazd�r�lmas�*/
    System.out.println("Otomobil satislari tablosu");
    for(i=0; i<satisTablosu.length; i++) {            // buradaki lenght. sat�r say�s�n� verir
        for(j=0; j<satisTablosu[0].length; j++) {   // buradaki lenght.0 ise s�t�un say�s�n� verir
            System.out.print(satisTablosu[i][j]+"  " );
        }
        System.out.println();
    }

    /*
     * Her marka i�in 3 ayl�k sat�� toplamlar�n�
     * yani dizinin sat�r toplamlar�n� yazd�ral�m
     * */
    for(i=0; i<=4; i++) {
        toplamSatis=0;
        for(j=0; j<=2; j++)
            toplamSatis=toplamSatis+satisTablosu[i][j];
        System.out.println(i+1+". markanin toplam satisi: "+toplamSatis);
    }

    /*
     * Her ay i�in 5 markan�n sat�� toplamlar�n�
     * yani tablodaki s�tunlar�n toplamlar�n�
     * g�sterelim
     * */
    System.out.println();
    toplamOtomobilSayisi=0;
    for(j=0; j<=2; j++){
        toplamSatis=0;
        for(i=0; i<=4; i++)
        {
            toplamSatis=toplamSatis+satisTablosu[i][j];
            toplamOtomobilSayisi=toplamOtomobilSayisi+satisTablosu[i][j];}
        System.out.println(j+1+". ayda 5 marka icin toplam satis miktari: "+toplamSatis);
    }
    /*3 AY ICIN TOPLAM OTOMOBIL SATISI-GENEL TOPLAM*/
    System.out.println("3 aylik toplam otomobil satisi"+toplamOtomobilSayisi);
		
		
		
		
		
		
		
		
	}

}

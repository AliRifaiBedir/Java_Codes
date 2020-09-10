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
     * elemanlarýnýn ekrana yazdýrýlmasý*/
    System.out.println("Otomobil satislari tablosu");
    for(i=0; i<satisTablosu.length; i++) {            // buradaki lenght. satýr sayýsýný verir
        for(j=0; j<satisTablosu[0].length; j++) {   // buradaki lenght.0 ise sütüun sayýsýný verir
            System.out.print(satisTablosu[i][j]+"  " );
        }
        System.out.println();
    }

    /*
     * Her marka için 3 aylýk satýþ toplamlarýný
     * yani dizinin satýr toplamlarýný yazdýralým
     * */
    for(i=0; i<=4; i++) {
        toplamSatis=0;
        for(j=0; j<=2; j++)
            toplamSatis=toplamSatis+satisTablosu[i][j];
        System.out.println(i+1+". markanin toplam satisi: "+toplamSatis);
    }

    /*
     * Her ay için 5 markanýn satýþ toplamlarýný
     * yani tablodaki sütunlarýn toplamlarýný
     * gösterelim
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

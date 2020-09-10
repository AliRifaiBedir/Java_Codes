
public class Thradlergiris {

	
	public class MyThread implements Runnable {
	    private int    end;
	    private String name;

	    public MyThread(String name, int end) {
	        this.end = end;
	        this.name = name;
	    }

	    @Override
	    public void run() {
	        for (int i = 0; i < end; i++) {
	            System.out.println(name + " : " + i);
	        }
	    }
	}

}/*
public class ThreadLesson {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyThread("thread1", 6));
        Thread thread2 = new Thread(new MyThread("thread2", 5), "thread2");
        thread1.start();
        thread2.start();
    }
}*/






/* Thread thread1 = new Thread(new MyThread("thread1", 6));
Thread thread2 = new Thread(new MyThread("thread2", 5));
Thread thread3 = new Thread(new MyThread("thread3", 4)); 
thread3.setPriority(Thread.MAX_PRIORITY);     // burada ise �ncelik belirleyerek is�lem yap�yoruz
thread1.setPriority(Thread.MIN_PRIORITY);    // bunun sayesinde il ba�ta thread1 olmas�na ra�men ilk �nce thread 3biter
thread2.setPriority(Thread.MIN_PRIORITY);
thread1.start();
thread2.start();
thread3.start();
}*/


/*

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadLesson2 {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(5);

        for (int i = 0; i < 20; i++) {
            Thread thread = new Thread(new MyThread("thread" + i, 3));
            executor.execute(thread);
        }
        executor.shutdown();
        executor.awaitTermination(10, TimeUnit.SECONDS);
        System.out.println("Done");
    }
}
ExecutorService bize belli bir anda en fazla ka� Thread �al��t�rmak istedi�imizi sormaktad�r. Yukar�daki �rnek newFixedThreadPool metodu ile 5 farkl� i� par�as�n�n ayn� anda �al��t�r�labilece�i belirtilmi�tir. Daha sonras�nda for d�ng�s� i�inde 20 adet Thread tan�mlanmas�na ra�men executor servisi gelen i�leri d�zene sokar ve 5 Thread �zerinde i�lem ger�ekle�tirmez. Sonradan eklenen i�lemler s�raya (queue) sokulur ve mevcut i�lemler bitirildik�e �al��t�r�l�r. B�ylece sistem kaynaklar� i�lem par�alar� taraf�ndan kontrols�zce harcanamaz. shutdown metodu ise yeni i�lem al�m�n� durdurur ve mevcut i�lemlerin bitirilmesini sa�lar. awaitTermination ise mevcut i�lemlerin bitirilmesi i�in belirli bir s�re tan�r ve bu s�renin sonunda ExecutorService tamamen kapat�l�r.

Tan�mlanan i�lemlerin belirli bir zaman sonra otomatik ba�lat�lmas� ya da sistematik olarak belli bir frekansla �al��t�r�lmas� i�in Java bizlere ScheduledExecutorService ad�nda bir s�n�f sunar. Bu sistem sayesinde yap�lan i�lemlerin belirli bir tarihte ba�lamas�n� ya da s�rekli olarak i�lemin tekrar edilmesini sa�layabiliriz.


import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ThreadLesson3 {
    public static void main(String[] args) throws InterruptedException {
        ScheduledExecutorService pool = Executors.newScheduledThreadPool(5);
        MyThread worker = new MyThread("Thread 1", 3);
        pool.schedule(worker, 5, TimeUnit.SECONDS);
        Thread.sleep(20000);
        pool.shutdown();
    }
}
*/

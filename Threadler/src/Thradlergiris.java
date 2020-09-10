
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
thread3.setPriority(Thread.MAX_PRIORITY);     // burada ise öncelik belirleyerek isþlem yapýyoruz
thread1.setPriority(Thread.MIN_PRIORITY);    // bunun sayesinde il baþta thread1 olmasýna raðmen ilk önce thread 3biter
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
ExecutorService bize belli bir anda en fazla kaç Thread çalýþtýrmak istediðimizi sormaktadýr. Yukarýdaki örnek newFixedThreadPool metodu ile 5 farklý iþ parçasýnýn ayný anda çalýþtýrýlabileceði belirtilmiþtir. Daha sonrasýnda for döngüsü içinde 20 adet Thread tanýmlanmasýna raðmen executor servisi gelen iþleri düzene sokar ve 5 Thread üzerinde iþlem gerçekleþtirmez. Sonradan eklenen iþlemler sýraya (queue) sokulur ve mevcut iþlemler bitirildikçe çalýþtýrýlýr. Böylece sistem kaynaklarý iþlem parçalarý tarafýndan kontrolsüzce harcanamaz. shutdown metodu ise yeni iþlem alýmýný durdurur ve mevcut iþlemlerin bitirilmesini saðlar. awaitTermination ise mevcut iþlemlerin bitirilmesi için belirli bir süre tanýr ve bu sürenin sonunda ExecutorService tamamen kapatýlýr.

Tanýmlanan iþlemlerin belirli bir zaman sonra otomatik baþlatýlmasý ya da sistematik olarak belli bir frekansla çalýþtýrýlmasý için Java bizlere ScheduledExecutorService adýnda bir sýnýf sunar. Bu sistem sayesinde yapýlan iþlemlerin belirli bir tarihte baþlamasýný ya da sürekli olarak iþlemin tekrar edilmesini saðlayabiliriz.


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

package oopgirisveclass;

public class consturctor {
	public static void main(String [] args) {

		
		car car3=new car("mavi","renault",1.5,4);
		car car2=new car();
		
		
		/*System.out.println("araban�n rengi :"+car3.getColour());
		System.out.println("araban�n kap� say�s� :"+car3.getDoors());
		System.out.println("araban�n motoru :"+car3.getEngine());
		System.out.println("araban�n modeli :"+car3.getModel());*/
		
		car3.showinfos();
		car2.showinfos();
		
		
		
		
		
		
		
	}
}
	

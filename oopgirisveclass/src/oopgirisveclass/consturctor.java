package oopgirisveclass;

public class consturctor {
	public static void main(String [] args) {

		
		car car3=new car("mavi","renault",1.5,4);
		car car2=new car();
		
		
		/*System.out.println("arabanýn rengi :"+car3.getColour());
		System.out.println("arabanýn kapý sayýsý :"+car3.getDoors());
		System.out.println("arabanýn motoru :"+car3.getEngine());
		System.out.println("arabanýn modeli :"+car3.getModel());*/
		
		car3.showinfos();
		car2.showinfos();
		
		
		
		
		
		
		
	}
}
	

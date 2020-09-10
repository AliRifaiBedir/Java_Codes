package oopgirisveclass;

public class main {

	public static void main(String [] args) {
		
		car car1=new car();
		/*car1.colour="mavi";
		car1.doors=5;
		car1.engine=1.6;
		car1.model="ferrari";
		System.out.println("araba rengi :"+car1.colour);
		System.out.println("araba kapý :"+car1.doors);
		System.out.println("araba motoru :"+car1.engine);
		System.out.println("araba model :"+car1.model);*/
		
	car1.setcolour("yesil");
	car1.setDoors(4);
	car1.setEngine(1.4);
	car1.setModel("ferrari");
	System.out.println("arabanýn rengi :"+car1.getColour());
	System.out.println("arabanýn kapý sayýsý :"+car1.getDoors());
	System.out.println("arabanýn motoru :"+car1.getEngine());
	System.out.println("arabanýn modeli :"+car1.getModel());
	
	car1.start();
	car1.finish();
	
	
	
	
		
		
		
	}
}

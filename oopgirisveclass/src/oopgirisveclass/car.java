package oopgirisveclass;

public class car {
	private String colour;
	private String model;
	private double engine;
	private int doors;
	
	
	
	public car() {
		
		this("bilgiyok","bilgiyok",0,0);
		
	}
	
	public void showinfos() {
		System.out.println("arabanýn rengi :"+this.colour);
		System.out.println("arabanýn kapý sayýsý :"+this.doors);
		System.out.println("arabanýn motoru :"+this.engine);
		System.out.println("arabanýn modeli :"+this.model);
	}
	
	public car(String colour,String model,double engine,int doors) {
		this.doors=doors;
		this.engine=engine;
		this.model=model;
		this.colour=colour;
		
		
		
	}
	
	public void setcolour(String colour) {
	this.colour=colour;
	}
	
	public String getColour() {
		return colour;
	}

	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getEngine() {
		return engine;
	}

	public void setEngine(double engine) {
		this.engine = engine;
	}

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		if(doors==2||doors==4) {
			this.doors = doors;
		}
		else {
			System.out.println("kapý saysýsý 2 veya 4 olmaolý");
		}
		
	}
	public void start(){
		System.out.println("basla");
	}
	
	public void finish(){
		System.out.println("bitti");
	
		
		

	}

	
	

}


package polimorphism;

class Animal{
	
	private String name;
	
	public Animal(String name) {
		this.name=name;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void speak() {
		
		System.out.println("hayvan konuusyor");
	}
	
	
}




class Bird extends Animal{

	public Bird(String name) {
		super(name);
		
	}

	@Override
	public void speak() {
		
		System.out.println(getName()+" ötüyor");
	}
	
}
	
	class Dog extends Animal{

		public Dog(String name) {
			super(name);
			
		}

		@Override
		public void speak() {
			
			System.out.println(getName()+" havlýyor");
		}
		
	}
		class Horse extends Animal{

			public Horse(String name) {
				super(name);
				
			}

			@Override
			public void speak() {
				
				System.out.println(getName()+" kisniyor ");
			}
	
		
		}
		
	

public class main {
	
	public static void speaktry(Animal animal) {
		animal.speak();
	}
	
	public static void main(String[] args) {
		
		
		speaktry(new Horse("sahbatur"));
		
		
		
		
		
		
		
		
		}
		
}
		
		
		
	


	

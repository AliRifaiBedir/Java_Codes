package inheritance;

public class manager extends Employee {
	private int num_employee_;
	
	
	public manager(String name,String department,int salary,int num_employee) {
		
		super(name,department,salary);
	
		this.num_employee_=num_employee;
		
	}
	
	
	
	@Override
	public void bilgiler() {
		// TODO Auto-generated method stub               //override methodu
		super.bilgiler();
		System.out.println("sorumlu olduðu kiþi sayýsý"+this.num_employee_);
		System.out.println("kýralllll");
		
	}



	public void zam(int maas) {
		
		System.out.println("yapýlan zam "+maas);
		
	}

}

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
		System.out.println("sorumlu oldu�u ki�i say�s�"+this.num_employee_);
		System.out.println("k�ralllll");
		
	}



	public void zam(int maas) {
		
		System.out.println("yap�lan zam "+maas);
		
	}

}

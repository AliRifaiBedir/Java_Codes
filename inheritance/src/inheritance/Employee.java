package inheritance;

public class Employee {
	private String name;
	private String department;
	private int salary;
	
	
	public Employee(String name,String department,int salary) {  //burada constuctor tan�mlad�k
		                                                       
        this.name=name;
		this.department=department;
		this.salary=salary;
		
	}
	
	public Employee() {
		this("yok","tok",5);
		
	}
		
	

	 public void bilgiler() {
		 System.out.println("ad: "+this.name);
		 System.out.println("b�l�m: "+this.department);
		 System.out.println("maas: "+this.salary);
		 
	 }
	
	
	
}

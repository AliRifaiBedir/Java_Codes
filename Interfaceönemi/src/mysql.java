
public class mysql implements IDatabase {

	@Override
	public void add() {
		System.out.println("mysql eklemee");
		
	}

	@Override
	public void delete() {
		System.out.println("mysql silme");
		
	}

	@Override
	public void update() {
		System.out.println("mysql güncellmee");
		
	}

	@Override
	public void get() {
		System.out.println("mysql elde etme");
		
	}

}

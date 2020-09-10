
public class mongo implements IDatabase{

	@Override
	public void add() {
		System.out.println("mongo ekleme");
		
	}

	@Override
	public void delete() {
		System.out.println("mongo silme");
		
	}

	@Override
	public void update() {
		System.out.println("mongo güncelleme");
		
	}

	@Override
	public void get() {
		System.out.println("mongo elde etme");
		
	}

}

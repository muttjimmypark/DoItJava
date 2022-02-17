package singleton;

public class Company {

	//변경불가 단하나 인스턴스를 생성
	private static Company instance = new Company();
	
	private Company() { }
	
	public static Company getInstance() {
		if(instance == null)
			instance = new Company();
		
		return instance;
	}
}

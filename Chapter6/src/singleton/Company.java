package singleton;

public class Company {

	//변경불가 단하나 인스턴스를 생성
	private static Company instance = new Company();
	
	//외부에서 생성할수없게 생성자에 private 작성
	private Company() { }
	
	//외부에서 가져가게하기위한 public이지만 단하나니까 static선언
	public static Company getInstance() {
		if(instance == null)
			instance = new Company();
		
		return instance;
	}
}

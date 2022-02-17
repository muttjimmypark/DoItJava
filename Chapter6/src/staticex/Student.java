package staticex;

public class Student {

	private static int serialNum = 10000;
	
	int studentID;
	String studentName;
	
	public Student() {
		studentID = ++serialNum;
	}
	
	public static int getSerialNum() {
		/*
		int i = 10;				//지역변수
		studentName = "홍길";		//인스턴스변수 -static 메서드에서는 생성이 불확실하므로 인스턴스변수 활용불가
		*/
		return serialNum;		//static 변수
	}
}

package staticex;

public class StudentTest1 {

	public static void main(String[] args) {
		System.out.println(Student.getSerialNum());
		System.out.println();

		Student studentJ = new Student();
		System.out.println(studentJ.studentID);
		System.out.println();
		
		Student studentT = new Student();
		System.out.println(studentJ.studentID);
		System.out.println(studentT.studentID);
		System.out.println();
		
		System.out.println(studentJ.getSerialNum());
		System.out.println(studentT.getSerialNum());
		System.out.println(Student.getSerialNum());
	}

}

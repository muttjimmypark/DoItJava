package array;

public class ArrayTest {

	public static void main(String[] args) {

		int[] numbers = new int[] {0, 1, 2};
		System.out.println(numbers.length);
		System.out.println();
		
		
		int[] numbers2 = {0,1,2};
		System.out.println(numbers2.length);
		System.out.println();

		
		int[] numbers3 = new int[3];
		numbers3[0] = 1;
		numbers3[1] = 2;
		numbers3[2] = 3;
		System.out.println(numbers3.length);
		for(int i=0; i<numbers3.length; i++) {
			System.out.println(numbers3[i]);
		}
		System.out.println();
		
		
		int[] studentsIDs = new int[5];
		for(int i=0; i<studentsIDs.length; i++) {
			System.out.println(studentsIDs[i]);
		}
		System.out.println();
	}

}

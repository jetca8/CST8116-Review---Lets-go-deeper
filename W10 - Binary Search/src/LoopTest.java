import java.util.Random;

public class LoopTest {
	static final int ARRAY_LENGTH = 1000;
	static final int TEST_LOOP = 10000000;
	static final double BINARY_SECTION = 0.5;
	static final double GOLDEN_SECTION = 0.618;
	static int[] array = new int[ARRAY_LENGTH];
	
	static public void loopTest(BinarySearch binarySearch ) {
		for (int i=0; i<TEST_LOOP; i++) {
			Random random = new Random();
			int randomNumber = random.nextInt(ARRAY_LENGTH);
			binarySearch.binarySearch(randomNumber, array);
		}
		
	}
	
	
	public static void main(String[] args) {
		//generate a sorted array for test, assigned int value from 0 to array.length-1
		
		for (int i=0; i<array.length; i++) {
			array[i]= i;
		}
		
		BinarySearch binarySectionSearch = new BinarySearch (BINARY_SECTION);
		BinarySearch goldenSectionSearch = new BinarySearch (GOLDEN_SECTION);
		//first 0.5, second 0.618
		loopTest(binarySectionSearch);
		loopTest(goldenSectionSearch);
		System.out.println(binarySectionSearch);
		System.out.println(goldenSectionSearch);
		
		
		//reset counter
		binarySectionSearch.setLoopCounter(0);
		goldenSectionSearch.setLoopCounter(0);
		
		//first 0.618, second 0.5
		loopTest(goldenSectionSearch);
		loopTest(binarySectionSearch);
		System.out.println(binarySectionSearch);
		System.out.println(goldenSectionSearch);

	}
	

	

}

import java.util.Random;

public class BinarySearch {
	static int loopCounter1 = 0;	// index = 0.5
	static int loopCounter2 = 0;	// index = 0.618
	public static int binarySearch(int searchNumber, int[] array, double index) {  //index could be 0.5 or 0.618
		int indexInArray = -1;
		int frontIndex;
		int endIndex;
		int currentIndex;
		
		
		frontIndex = 0;
		endIndex = array.length -1;
		
		while (frontIndex < endIndex) {
			if (index == 0.5) {
				loopCounter1++;
			}
			if (index == 0.618) {
				loopCounter2++;
			}
			
			currentIndex = (int)((frontIndex + (endIndex - frontIndex) * index));
			if (searchNumber < array[currentIndex]) {
				endIndex = currentIndex;
//				System.out.println("frontIndex " + frontIndex+" endIndex " + endIndex);
			} else if (searchNumber > array[currentIndex]) {
				frontIndex = currentIndex;
//				System.out.println("frontIndex " + frontIndex+" endIndex " + endIndex);
			} else if (searchNumber == array[currentIndex]) {
				indexInArray = currentIndex;
//				System.out.println("frontIndex " + frontIndex+" endIndex " + endIndex);
//				System.out.println("indexInArray "+indexInArray);
				break;
			} 
			
		}		
		
	return indexInArray;
	}

	public static void main(String[] args) {

		final int ARRAY_LENGTH = 1000000;
		final int TEST_LOOP = 100000;
		//generate a sorted array, assigned int value from 0 to array.length-1
		int[] array = new int[ARRAY_LENGTH];
		for (int i=0; i<array.length; i++) {
			array[i]= i;
		}
		for (int j=0; j< TEST_LOOP; j++) {
			//random a number from 0 to array.length (exclusive)
			Random random = new Random();
			
			int randomNumber = random.nextInt(ARRAY_LENGTH);
//			System.out.println("randomNumber" + randomNumber);
			binarySearch(randomNumber, array, 0.618);
			System.out.println("loopCounter2: " + loopCounter2);
			
			binarySearch(randomNumber, array, 0.5);
			System.out.println("loopCounter1: " + loopCounter1);
			
			
		}

	}

}

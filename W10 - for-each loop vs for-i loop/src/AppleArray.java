
/*
 * this program will declare an array of Apple, and try to use for-each and for-i loop 
 * to initialize the Apple object in the array.
 * you will see the difference between for-i and for-each 
 */

public class AppleArray {

	public static void main(String[] args) {
		// declare an array named apples with 10 apple objects inside
		Apple[] apples = new Apple[10];   
		
		//for each apple in the array, need to initialize before using
		System.out.println("before initializing apple");
		traverseArray(apples);
		System.out.println("not initialized, all elements in the array are null\n");
		
		
		
		System.out.println("try to use for-each loop to initialize apple");
		for (Apple apple : apples) {
			apple = new Apple("red", 2.0); //call constructor to initialize apple object
			System.out.println("inside for-each loop: " + apple);
		}
		traverseArray(apples);
		System.out.println("for-each loop cannot modify the values in the array\n");
		
		
		
		System.out.println("try to use for-i loop to initialize apple");
		for (int i = 0; i < apples.length; i++) {
			apples[i] = new Apple("green" , i); //call constructor to initialize apple object
			System.out.println("inside for-i loop: " + apples[i]);
		}
		traverseArray(apples);
		System.out.println("for-i loop can modify the values in the array");
	}
	
	//list all the element inside array
	private static void traverseArray(Apple[] apples) {
		for (int i = 0; i < apples.length; i++) {
			System.out.println(apples[i]); 
		}
	}

}

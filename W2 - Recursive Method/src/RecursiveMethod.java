/*
 * caculate 1+2+3+...100 in recursive method way
 */


public class RecursiveMethod {
	

	public static int sum(int number) {
		int sum;
		if (number == 0) {
			sum = 0;
		} else {
			sum = number + sum (number-1) ; // method call itself
		}
		return sum;
	}
	

	public static void main(String[] args) {
		
		
		int lastNumber = 100;   //need to be positive number
		int sum = sum (lastNumber);
		System.out.println("sum is " + sum);
		
	}

}

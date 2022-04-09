
public class BitShift {

	public static void main(String[] args) {

		int number = 32;
		System.out.println("number 32 after left shifting is " + (number << 1));
		System.out.println("number 32 after right shifting is " + (number >> 1));
		
		int number2 = 31;
		System.out.println("number 31 after left shifting is " + (number2 << 1));
		System.out.println("number 31 after right shifting is " + (number2 >> 1)); // result is 15, just same as 31/2, remaining 1 is discarded
		
		int number3 = 33;
		System.out.println("number 33 after left shifting is " + (number3 << 1));
		System.out.println("number 33 after right shifting is " + (number3 >> 1));  // result is 16, just same as 33/2, remaining 1 is discarded
		
		// compare the speed of bit shift with *2 and /2
		long beforeTime;
		long afterTime;
		long time;
		long repeatTime = Integer.MAX_VALUE;  // get the max value of integer
		
		
		//bit shifting calculation
		beforeTime = System.currentTimeMillis();  // get the time stamp before calculation
		for (long i=0; i< repeatTime; i++) {
			number = number << 1;
			number = number >> 1;
		}
		afterTime = System.currentTimeMillis();  // get the time stamp after calculation
		time = (afterTime - beforeTime);         // time consumed
		System.out.println("bit shifting calculation takes time: " + time );
		
		
		
		//*2 /2 calculation
		beforeTime = System.currentTimeMillis(); 
		for (long i=0; i< repeatTime; i++) {
			number = number * 2;
			number = number / 2;
		}
		afterTime = System.currentTimeMillis();
		time = (afterTime - beforeTime);
		System.out.println("multiply and divide 2 calculation takes time: " + time );

		
		
		
		
		
		
	}

}

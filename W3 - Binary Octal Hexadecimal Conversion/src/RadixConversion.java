
public class RadixConversion {

	public static void main(String[] args) {
		
		int number1 = 0b10; //binary
		int number2 = 010;  //octal
		int number3 = 0x10; //hexadecimal
		int number4 = 10;   //decimal
		
		System.out.println("number1: " + number1); // result is 2
		System.out.println("number2: " + number2); // result is 8
		System.out.println("number3: " + number3); // result is 16
		System.out.println("number4: " + number4); // result is 10

		// int number to Binary String
		System.out.println("number1 " + number1 + " to binary string: " +Integer.toBinaryString(number1));
		// int number to Octal String
		System.out.println("number2 " + number2 + " to octal string: " +Integer.toOctalString(number2));
		// int number to hexadecimal String
		System.out.println("number3 " + number3 + " to hexadecimal string: " +Integer.toHexString(number3));

		
	
		// Binary String to int
		String stringNumber = "10";
		System.out.println("Binary " + stringNumber + " convert to decimal: "+ Integer.parseInt(stringNumber, 2));
		System.out.println("Octal " + stringNumber + " convert to decimal: "+ Integer.parseInt(stringNumber, 8));
		System.out.println("Hexadecimal " + stringNumber + " convert to decimal: "+ Integer.parseInt(stringNumber, 16));
		
	}

}

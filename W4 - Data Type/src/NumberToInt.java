
public class NumberToInt {

	public static void main(String[] args) {

		char charNumber = '1';
		char charNumber2 = 49;  //Directly assign int number to char variable, No. 50 position in the ASCII table is '1'
		//result is the same
		System.out.println("charNumber: " + charNumber);
		System.out.println("charNumber2: " + charNumber2);
		System.out.println("same result \n");
		
		String stringNumber = "123";
		//String to int: use Integer.parseInt()
		int stringToInt = Integer.parseInt(stringNumber);
		System.out.println("stringToInt: " + stringToInt + "\n");
		
		
		// Directly assign char to an int variable, char '1' become to int number 49. 
		// Because char '1' is the No. 49 position in the ASCII table
		int intNumber = charNumber; 
		System.out.println("intNumber: " + intNumber + "\n");
		
		// step 1: convert char to string using String.valueOf()
		String charToString = String.valueOf(charNumber);
		System.out.println("charToString: " + charToString); 
		// step 2: convert string to int using Integer.parseInt()
		int stringToInt2 = Integer.parseInt(charToString);
		System.out.println("stringToInt2: " + stringToInt2);

	}

}

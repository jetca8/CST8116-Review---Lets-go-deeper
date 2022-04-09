
public class StringReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = new String ("Hello");
		String str4 = "He";
		String str5 = str4 + "llo";
		String str6 = "He" + "llo";
		
		
		System.out.println("str1 == str2? " + (str1 == str2)); 
		System.out.println("str1 == str3? " + (str1 == str3));
		System.out.println("str1 == str5? " + (str1 == str5));
		System.out.println("str1 == str6? " + (str1 == str6));
	}

}

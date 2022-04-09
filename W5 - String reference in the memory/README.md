# String reference in the memory


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
		
		
and the result is

	str1 == str2? true
	str1 == str3? false
	str1 == str5? false
	str1 == str6? true
	
- why?
1. same content constant string share same reference in the memory
2. new String () will make a new reference  of string
3. +operation called StringBuilder.append operation, and toString(), new reference is generated
4. constant string will be linked together before compile.  
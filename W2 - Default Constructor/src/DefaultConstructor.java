
public class DefaultConstructor {

	public static void main(String[] args) {
		
		Apple apple1 = new Apple();
		Apple apple2;
		System.out.println(apple1);
//		System.out.println(apple2);  //compile error, cannot be used before initialized
	}

}

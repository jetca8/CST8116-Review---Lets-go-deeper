
public class Swap {
	
	
	public int num1;
	public int num2;
	
	public void swapNumber(int a, int b)	{
		this.num1 = b;
		this.num2 = a;
	}


	public static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
		
	}
	
	public static void swap(int [] array) {
		int temp = array[0];
		array[0] = array[1];
		array[1] = temp;
	}
	

	
	public static void main(String[] args) {
		
		int num1 = 0;
		int num2 = 1;
		
		swap(num1, num2);
		System.out.println("num1: " +num1 + " num2: " + num2 );

		int array[] = {0,1};
		swap(array[0],array[1]);
		System.out.println("array[0]: " +array[0] + " array[1]: " + array[1] );
		
		swap(array);
		System.out.println("array[0]: " +array[0] + " array[1]: " + array[1] );
		
		Swap swap = new Swap();
		swap.num1 = 0;
		swap.num2 = 1;
		System.out.println("swap.num1: " +swap.num1 + " swap.num2: " + swap.num2 );
		swap.swapNumber(swap.num1, swap.num2);
		System.out.println("swap.num1: " +swap.num1 + " swap.num2: " + swap.num2 );
		
		
	}

}

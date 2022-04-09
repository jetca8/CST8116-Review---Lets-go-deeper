# Operator i++ is the same as i=i+1 ?

Most of time, yes. 

There are some difference at some special case:

	public class IncrementOperator {
		public static void main(String[] args) {
			
			byte i = 0;
			i++; //this will work
			System.out.println(i);
		}
	}


But if change i++ to i=i+1

	byte i = 0;
	i = i + 1;  //this will not compile, first calculate i+1 will cast i from byte to int (low to high, automatically)
	            //then result of (i+1) is int, and is assigned to i which is byte (high to low, fail to compile).

Let's see what happened.

Use jadx (how to use, refer to W1 - Decompile HelloWorld) to decompile the IncrementOperator.class

And this is the code after decompile

	package defpackage;
	
	/* renamed from: IncrementOperator  reason: default package */
	/* loaded from: IncrementOperator.class */
	public class IncrementOperator {
	    public static void main(String[] args) {
	        byte i = (byte) (0 + 1);  // automatically add type casting
	        System.out.println((int) i);  // add type casting
	    }
	}


The compiler add data type casting: (byte) (0 + 1)

It is quite interesting to find that compiler also did the casting for  System.out.println((int) i) 

There is no overload method in println() for byte, only boolean, char, double, float, int and long

See https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/PrintStream.html#println()



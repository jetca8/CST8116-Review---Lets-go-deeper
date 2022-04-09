# Convert numbers between decimal, binary, octal Hexadecimal

- Assign value to int: staring with 0b for binary number, 0 for octal, 0x for hexadecimal

		int number1 = 0b10; //binary
		int number2 = 010; //octal
		int number3 = 0x10; //hexadecimal
		int number4 = 10; //decimal

- println() displays numbers with values converted to decimal

		number1: 2
		number2: 8
		number3: 16
		number4: 10
- int number to Binary / Octal / Hexadecimal String

	Integer.toBinaryString(int)
	Integer.toOctalString(int)
	Integer.toHexString(int)

- Binary / Octal / Hexadecimal String to int

	Integer.parseInt(string, radix) //radix can be 2/8/16 or other integer
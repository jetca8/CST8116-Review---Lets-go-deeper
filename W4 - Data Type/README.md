# How to convert String number to int, Char number to int

1. Two ways to assign value to char
	- single character with single quote
	- ASCII table position integer number without single quote 
	
2. String number to int

		Integer.parseInt(string)
	
3. char number to int
	- Directly assigned to int: get the value of number position in ASCII table. 
	- to get the literal number of char, convert to String first, then convert to integer.

			String.valueOf(char)
			Integer.parseInt(string)




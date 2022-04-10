# Binary Search


- Binary Search Algorithm 

in a sorted array of numbers, find the number in the middle of array, compare with search number, 

	
	- if the middle number < search number, find the number from the right side of the array, using the same way.
	- if the middle number > search number, find the number from the left side of the array, using the same way.
	- if the middle number == search number, you find the number
	- if the middle number != search number, the search number is not in the array
	
in this algorithm, every time, you can exclude half of the numbers in the array, until you finally find the number.


I was told that search in half of the number (0.5) is not the best solution. the best number is 0.618. in the program, i will try to test which one is faster.


# Binary Search


- Binary Search Algorithm 

in a sorted array of numbers, locate the number in the middle of array, compare with search number, 

	
1. if the middle position number < search number, continue to search the number from the right side of the array, using the same way.
2. if the middle position number > search number, continue to search the number from the left side of the array, using the same way.
3. if the middle position number == search number, you find the number. if the middle position number != search number, the search number is not in the array

see code sample here: https://www.geeksforgeeks.org/binary-search/
	
in this algorithm, every time, you can exclude half of the numbers in the array, until you finally find the number.


It is said that search in half of the number (0.5) is not the best solution. the best number is 0.618. 
https://leetcode.com/problems/peak-index-in-a-mountain-array/discuss/139848/C%2B%2BJavaPython-Better-than-Binary-Search

In the program, i will try to test which one is faster.

- Result

setting the array length of 1000, and repeat loop 10 million times
The result shows :

1. if the two binary search using the same random number(code is not included here), the search running later is faster (the search following the 1st search). This is related to the help from CPU cache?
2. if the using separate random number for the two binary search, golden section 0.618 seems a littler faster (taks less time) , but the loop counter value is bigger. 
	
So how comes the loop counter is bigger, but consuming time is less? Quite strange.



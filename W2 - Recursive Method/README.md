# Recursive Method

A method call itself is called recursive method

	public static int sum(int number) {
		int sum;
		if (number == 0) {
			sum = 0;
		} else {
			sum = number + sum (number-1) ;
		}
		return sum;
	}

How it work?

	sum(100) 
	= 100 + sum(99), and sum(99) = 99 + sum (98)
	= 100 + 99 + sum(99) 
	= ...
	= 100 + 99 + 98 + 97 + ... + 2 + sum (1), and sum (1) = 1 + sum (0), 
	= 100 + 99 + 98 + 97 + ... + 2 + 1 + sum (0),  and sum (0) = 0
	= 100 + 99 + 98 + 97 + ... + 2 + 1 + 0

As recursive Method is calling itself, the key is to prevent it becoming an endless loop.

So, need to set some condition to get out of the loop.

for this sample, sum (0) = 0 is the key to call a stop.
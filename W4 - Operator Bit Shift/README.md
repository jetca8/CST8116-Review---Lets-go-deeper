# Operator Bit Shift: left shift << and right shift >>
- left shift << , result is like * 2
- right shift >> , result is like / 2
- It is said **bit shift calculation is much faster** than *2 and /2 . let's verify it.

		// compare the speed of bit shift with *2 and /2
		long beforeTime;
		long afterTime;
		long time;
		long repeatTime = Integer.MAX_VALUE;  // get the max value of integer
		
		
		//bit shifting calculation
		beforeTime = System.currentTimeMillis();  // get the time stamp before calculation
		for (long i=0; i< repeatTime; i++) {
			number = number << 1;
			number = number >> 1;
		}
		afterTime = System.currentTimeMillis();  // get the time stamp after calculation
		time = (afterTime - beforeTime);         // time consumed
		System.out.println("bit shifting calculation takes time: " + time );
		
		
		
		//*2 /2 calculation
		beforeTime = System.currentTimeMillis(); 
		for (long i=0; i< repeatTime; i++) {
			number = number * 2;
			number = number / 2;
		}
		afterTime = System.currentTimeMillis();
		time = (afterTime - beforeTime);
		System.out.println("multiply and divide 2 calculation takes time: " + time );
		
		
After billion times of calculation, result shows bit shifting is must faster. it is takes 50% less time than multiplication and division

		bit shifting calculation takes time: 1272
		multiply and divide 2 calculation takes time: 2461	
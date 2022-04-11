# for-i and for-each loop

for-each loop, data in the array is copied ,
it cannot change the original data in the array.
but it is easy for traversing array.

for-i loop, directly reference the object's address, it can be change the original data in the array.


- test result

	before initializing apple
	null
	null
	null
	null
	null
	null
	null
	null
	null
	null
	not initialized, all elements in the array are null
	
	try to use for-each loop to initialize apple
	inside for-each loop: Apple [type=red, price=2.0]
	inside for-each loop: Apple [type=red, price=2.0]
	inside for-each loop: Apple [type=red, price=2.0]
	inside for-each loop: Apple [type=red, price=2.0]
	inside for-each loop: Apple [type=red, price=2.0]
	inside for-each loop: Apple [type=red, price=2.0]
	inside for-each loop: Apple [type=red, price=2.0]
	inside for-each loop: Apple [type=red, price=2.0]
	inside for-each loop: Apple [type=red, price=2.0]
	inside for-each loop: Apple [type=red, price=2.0]
	null
	null
	null
	null
	null
	null
	null
	null
	null
	null
	for-each loop cannot modify the values in the array
	
	try to use for-i loop to initialize apple
	inside for-i loop: Apple [type=green, price=0.0]
	inside for-i loop: Apple [type=green, price=1.0]
	inside for-i loop: Apple [type=green, price=2.0]
	inside for-i loop: Apple [type=green, price=3.0]
	inside for-i loop: Apple [type=green, price=4.0]
	inside for-i loop: Apple [type=green, price=5.0]
	inside for-i loop: Apple [type=green, price=6.0]
	inside for-i loop: Apple [type=green, price=7.0]
	inside for-i loop: Apple [type=green, price=8.0]
	inside for-i loop: Apple [type=green, price=9.0]
	Apple [type=green, price=0.0]
	Apple [type=green, price=1.0]
	Apple [type=green, price=2.0]
	Apple [type=green, price=3.0]
	Apple [type=green, price=4.0]
	Apple [type=green, price=5.0]
	Apple [type=green, price=6.0]
	Apple [type=green, price=7.0]
	Apple [type=green, price=8.0]
	Apple [type=green, price=9.0]
	for-i loop can modify the values in the array
	


public class BinarySearch {
	private int loopCounter; //loopCouter of while loop. to see how many loops for different binary search index.
	private double index; //binary search index, the percentage in binary search for next search. could be 0.5 or 0.618 in this case
	private long executingTime;
	
	

	public BinarySearch() {
		this (0.5);
		// TODO Auto-generated constructor stub
	}


	public BinarySearch (double index) {
		super();
		this.loopCounter = 0;
		this.index = index;
		this.executingTime = 0;
	}

	

	public int getLoopCounter() {
		return loopCounter;
	}


	public void setLoopCounter(int loopCounter) {
		this.loopCounter = loopCounter;
	}


	public double getIndex() {
		return index;
	}


	public void setIndex(double index) {
		this.index = index;
	}

	


	public long getExecutingTime() {
		return executingTime;
	}


	public void setExecutingTime(long executingTime) {
		this.executingTime = executingTime;
	}
	
	

	@Override
	public String toString() {
		return "BinarySearch [loopCounter=" + loopCounter + ", index=" + index + ", executingTime=" + executingTime
				+ "]";
	}


	public int binarySearch(int searchNumber, int[] array) {  
		int indexInArray = -1;
		int startIndex;
		int endIndex;
		int currentIndex;
		long loopStartingTime;
		long loopEndingTime;
		
		startIndex = 0;
		endIndex = array.length -1;
		
		loopStartingTime = System.nanoTime(); //get the time before loop
		while (startIndex <= endIndex) {
			loopCounter++;  // count the times of entering the loop

			
			//uncomment the println() to show the progress step by step
			currentIndex = (int)((startIndex + (endIndex - startIndex) * index) );
			if (searchNumber < array[currentIndex]) {
				endIndex = currentIndex-1;    //narrow the range: remove the right part
//				System.out.println("startIndex " + startIndex+" currentIndex " + currentIndex +" endIndex " + endIndex);
			} else if (searchNumber > array[currentIndex]) {
				startIndex = currentIndex+1;	//narrow the range: remove the left part
//				System.out.println("startIndex " + startIndex+" currentIndex " + currentIndex +" endIndex " + endIndex);
			} else { 				//searchNumber == array[currentIndex]
				indexInArray = currentIndex;
//				System.out.println(" indexInArray " + indexInArray );
				break;
			} 
			
		}		
		loopEndingTime = System.nanoTime(); //get the time after loop
		executingTime += (loopEndingTime - loopStartingTime);

	return indexInArray;  // return -1 meaning not found
	}

}

public class SelectSort extends SortTest {

	protected SelectSort(int[] array, String arrayName) {
		super(array, "Select Sort, " + arrayName);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public void runTest(){
		long startTime = System.nanoTime();
		
		for(int firstUnsortedElement = 0; firstUnsortedElement + 1 < array.length; firstUnsortedElement++){
			int smallestElement = firstUnsortedElement; 
			for(int element = firstUnsortedElement + 1; element < array.length; element++){
				if(array[smallestElement] > array[element]){
					smallestElement = element;
				}
				comparisonCount++;
			}
			if( smallestElement != firstUnsortedElement){
				int temp = array[smallestElement];
				array[smallestElement] = array[firstUnsortedElement];
				array[firstUnsortedElement] = temp;
				swapCount++;
			}
			comparisonCount++;
		}
		
		
		
		executionTime = System.nanoTime() - startTime;
	}
}

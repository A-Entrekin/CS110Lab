import java.util.Arrays;


public class SortTest {
	private String name;
	protected final int[] unsortedArray;
	protected final int[] array;
	
	protected long executionTime;
	protected int swapCount;
	protected int comparisonCount;
	
	protected SortTest(int[] array, String name){
		unsortedArray = Arrays.copyOf(array, array.length);
		this.array = Arrays.copyOf(array, array.length);
		this.name = name;
	}
	
	
	public void runTest(){
		throw new UnsupportedOperationException();
	}
	
	public long getExecutionTime(){
		return executionTime;
	}
	
	public int getSwapCount(){
		return swapCount;
	}
	
	public int getComparisonCount(){
		return comparisonCount;
	}
	
	public boolean verifyCorrectness(){
		int[] perfectSort = Arrays.copyOf(unsortedArray, unsortedArray.length);
		Arrays.sort(perfectSort);
		for(int i = 0; i < array.length; i++){
			if(array[i] != perfectSort[i]) return false;
		}
		return true;
	}
	@Override
	public String toString(){
		return String.format("%s\nTime: %10d Swaps: %10d Comparisons %10d Valid %b", name, executionTime, swapCount, comparisonCount, verifyCorrectness());
	}
	
	
}

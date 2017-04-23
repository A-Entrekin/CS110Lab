import java.util.Random;


public class AssignmentFinal {
	
	final static int SHORT_LENGTH = 100;
	final static int MID_LENGTH = 1000;
	final static int LONG_LENGTH = 10000;
	
	public static void main(String[] args){
		Random crazyEddie = new Random(1234567890);
		int[] shortArray = new int[SHORT_LENGTH];
		int[] midArray= new int[MID_LENGTH];
		int[] longArray = new int[LONG_LENGTH];
		
		int[] orderedArray = new int[MID_LENGTH];
		int[] reversedArray = new int[MID_LENGTH];
		int[] almostOrderedArray = new int[MID_LENGTH];
		
		for(int i = 0; i < SHORT_LENGTH; i++){
			shortArray[i] = crazyEddie.nextInt();
		}
		
		for(int i = 0; i < MID_LENGTH; i ++){
			midArray[i] = crazyEddie.nextInt();
			orderedArray[i] = i;
			almostOrderedArray[i] = i;
			reversedArray[i] = MID_LENGTH - i;
		}
		almostOrderedArray[0] = MID_LENGTH;
		for(int i = 0; i < LONG_LENGTH; i++){
			longArray[i] = crazyEddie.nextInt();
		}
		
		
		SortTest[] tests = 	{ 	new SelectSort(longArray, "Long"),
								new SelectSort(midArray, "Mid"),
								new SelectSort(shortArray, "Short"),
								new SelectSort(orderedArray, "Ordered"),
								new SelectSort(reversedArray, "Reversed"),
								new SelectSort(almostOrderedArray, "Almost Ordered")
							};
		
		//read as, "For every test in the array 'tests'
		for(SortTest test: tests){
			test.runTest();
			System.out.println(test);
		}
		
		
		
	}
}

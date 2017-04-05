import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;


public class Store {
	
	Item[] itemsForSale;
	
	
	public Store(String fileName) throws FileNotFoundException{
		//Creates a store based off of a local file
		
		/*
		 *  Use a scanner to read from the file with the name, fileName
		 * 
		 * Read the first int from the file
		 *   This represents the maximum number of Items to read
		 *   i.e. the size of array you'll need for the next step
		 *   
		 * Instantiate the array itemsForSale
		 *   Use the number read from the file as the size of the array
		 *   
		 * Read items from the file until you get a NoSuchElementException or the array is full
		 *   if you get a NumberFormatException:
		 *     print 'Bad Line'
		 *     continue reading from the file
		 *   Save each item to the array itemsForSale
		 *   
		 * If itemsForSale isn't full, resize it so that it has no null elements
		 */
		
		//TODO remove solution
		
		Scanner source = new Scanner(new File("catalog.txt"));
		int size = source.nextInt();
		
		itemsForSale = new Item[size];
		boolean end = false;
		int actualItemCount = 0;
		while(actualItemCount < size && !end){
			try{
				itemsForSale[actualItemCount] = readItem(source);
				actualItemCount++;
			}catch(NoSuchElementException e){
				end = true;
			}catch(NumberFormatException e){
				System.out.println("Bad Line");
			}
		}
		itemsForSale = Arrays.copyOf(itemsForSale, actualItemCount);
		
		
		
	}
	
	
	public static Item readItem(Scanner source)throws NoSuchElementException, NumberFormatException{
		/*
		 * Read an Item from the scanner, and return that item.
		 * 
		 * Items are stored as a two word pair
		 * The first word is the name
		 *  See if the scanner has another word
		 *   If it does, the next word is the Item's name
		 *   if it doesn't, throw a NoSuchElementException
		 *   
		 * The second word is the price
		 *   If the scanner has another double
		 *     The next double is the Item's price
		 *     Construct the item and return it
		 *   If the scanner has another word but not a double
		 *     throw away that line of input using nextLine
		 *     throw a NumberFormatException
		 *   Otherwise
		 *     throw a NoSuchElement exception
		 */
		
		//Solution. TODO remove before providing to students
		if(source.hasNext()){
			String s = source.next();
			if(source.hasNextDouble()){
				double price = source.nextDouble();
				return new Item(s, price);
			}
			else if (source.hasNext()){
				source.nextLine();
				throw new NumberFormatException();
			}
		}
		throw new NoSuchElementException();
		
	}
		
	public static Item[] makeBundles(Item[] baseItems){
		/*
		 * Using the bundle method, create every possible two-item bundle
		 * Return an array containing every possible two-time bundle
		 * This array should be *full*, i.e. no null elements
		 * 
		 * You'll definitely need nested loops to fill the new array
		 * BONUS calculate the size of the array without using a loop
		 * Otherwise, a loop may be useful.
		 */
		
		//Solution TODO Remove solution
		int size = (baseItems.length -1) * baseItems.length / 2;
		Item[] combos = new Item[size];
		int index = 0;
		for(int i = 0; i < baseItems.length; i++){
			for(int j =i + 1; j <baseItems.length; j++){
				combos[index] = Item.bundle(baseItems[i], baseItems[j]);
				index++;
			}
		}
		return combos;
	}
	
	
	public static void main(String args[]){
		
		/*
		 * Create a Store from the file 'catalog.txt'
		 *   if you get a FileNotFoundException:
		 *     Print "File 'catalog.txt' not found"
		 *     return
		 * 
		 * Generate every possible two-item bundle using makeBundles
		 * 
		 * Print out each bundle on its own line
		 */
		
		//Solution. TODO remove before providing to students
		Store store = null;
		try{
			store = new Store("catalog.txt");
		}catch(FileNotFoundException f){
			System.out.println("File 'catalog.txt' not found");
			return;
		}
	
	   for(Item e: makeBundles(store.itemsForSale)){
		   System.out.println(e);
	   }
	}
}

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;


public class Store {
	public static Item readItem(Scanner source){
		
		/*
		 * Read an Item from the scanner
		 * Items are stored as a two word pair
		 * The first word is the name
		 * The second word is the price
		 * Use the Double.parseDouble to convert from String to double
		 * 
		 * Catch the following exceptions
		 * NoSuchElementException
		 *  Happens when you reach the end of the file prematurely
		 *  Print out "End of file" and return null
		 * NumberFormatException
		 *  Happens when you can't convert a String to a double
		 *  Dispose of the file's current line by using nextLine
		 *  Print "Malformed Input, line disposed"
		 *  return null
		 */
		
		//Solution. TODO remove before providing to students
		try{
			String name = source.next();
			String priceS = source.next();
			double price = Double.parseDouble(priceS);
			return new Item(name, price);
		}
		//Seems a little cumbersome.
		//Maybe we should use input mismatch rather than
		// encourage reading numerical data as a string?
		catch(NumberFormatException e){
			String eat = source.nextLine();
			System.out.println("Malformed Input, line disposed: " + eat);
			return null;
		} catch(NoSuchElementException e){
			System.out.println("End of File");
			return null;
		}
	}
		
	
	public static void main(String args[]){
		
		/*
		 * Use a scanner to read from the file 'catalog.txt'
		 * Read the first int from the file, that's how many Items the file contains
		 * Create an array of Items
		 * Copy items from the file into the array using a loop and readItem
		 * Attempt to make every possible two-item bundle using nested loops and the bundle method
		 *   If the bundle method throws an exception, print the message
		 *   If the bundle method doesn't throw an exception, print the bundle
		 * 
		 * if the file doesn't exist
		 *  print 'Catalog not found;
		 *  quit
		 * 
		 */
		
		//Solution. TODO remove before providing to students
		Scanner source = null;
		int size = 0;
		try{
			source = new Scanner(new File("catalog.txt"));
			size = source.nextInt();
		}catch(FileNotFoundException f){
			System.out.println("Catalog not found");
			return;
		}catch(NumberFormatException e){
			System.out.println("Bad format: number of items not found");
			return;
		}
		Item[] catalog = new Item[size];
		for(int i = 0; i < size; i++){
			catalog[i] = readItem(source);
		}
	    for(int i = 0; i < size; i++){
	    	for(int j = i + 1; j < size; j++){
	    		try{
	    			System.out.println(Item.bundle(catalog[i], catalog[j]));
	    		}catch(NullPointerException e){
	    			System.out.println(e.getMessage());
	    		}
	    	}
	    }
	}
}

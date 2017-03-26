import java.util.Arrays;


public class Character {
	String name;		//by default, should be "The Chosen One"
	Item[] inventory;	// by default, should be an empty array of size ten
	String[] actions;	// by default, should be "take" and "drop" in an array of size 10
	
	
	public Character(){
		name = "The Chosen One";
		inventory = new Item[10];
		actions = new String[10];
		actions[0] = "Take";
		actions[1] = "Drop";
	}
	
	public Character(String name){
		this();
		this.name = name;
	}
	
	public Character(String name, Item[] startingItems){
		this();
		this.name = name;
		startingItems = Arrays.copyOf(startingItems, 10);
	}
	
	public Character(String name, String[] extraActions){
		this();
		this.name = name;
		for(int i = 0; i < extraActions.length; i++){
			actions[i+2] = extraActions[i];
		}
	}
	
	public Character(String name, Item[] startingItems, String[] extraActions){
		this(name, extraActions);
		inventory = Arrays.copyOf(startingItems, 10);
	}
	
	public String toString(){
		return name;
	}
	
	public String getName(){
		return name;
	}
	
	public String description(){
		String s = name + "\nInventory\n";
		for(int i = 0; i< inventory.length && inventory[i] != null; i++){
			s += (i + 1) + ") " +  inventory[i];
		}
		s += "Actions\n";
		for(int i = 0; i< actions.length && actions[i] != null; i++){
			s += actions[i];
		}
		return s;
	}
	
	public boolean drop(int itemNumber){
		//TODO modify the method below to return false if 
		//There was no item at that itemNumber
		//or if the itemNumber was out of bounds
		for(int i = itemNumber; i<  inventory.length; i++){
			inventory[i-1] = inventory[i];
		}
		inventory[inventory.length - 1] = null;
		return true;
	}
	
	public Item drop(String searchName){
		//TODO Searches the inventory for an item by name
		//Search the array inventory for an Item with the name searchName.
		//If there is only one partial match, remove the partial match
		// An item is a partial match if their name contains searchName
		//If no matches or partial matches are found, return null
		//Otherwise, return the removed item
		return null;
		
	}
	
	public boolean take(Item item){
		//TODO Add the action to the array actions
		//Use no class members/attributes except actions
		//leave no gaps
		//return true if the action was successfully added
		//return false if the array is full
		return false;
	}
	
	public boolean learn(String action){
		//TODO Add the action to the array actions
		//Use no class members except actions
		//leave no gaps
		//return true if the action was successfully added
		//return false if the array is full
		return false;
	}
}
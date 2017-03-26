import java.util.Arrays;


public class World {
	public String name;
	public Place[] everyWhere; //never has null elements
	
	public World(String name){
		this.name = name;
		everyWhere = new Place[0];
	}
	
	public void add(Place p){
		everyWhere = Arrays.copyOf(everyWhere, everyWhere.length + 1);
		everyWhere[everyWhere.length - 1] = p;
	}
	
	public Place locate(Character somebody){
		//TODO returns the place where somebody is located
		//If there is no such place, return null
		return null;
	}
	
	public Place locate(String searchName){
		//returns the place where the character is located
		//If there is a singular partial match, return the Place with the partial match
		// A character is a partial match if their name contains the searchName
		//If no match or partial match is found, return null
		return null;
		
	}
	
	
	public Character getCharacter(String searchName){
		//returns the character matching the searchName
		//Search in each Place of everyWhere
		//If there is a singular partial match, return the Place with the partial match
		// A character is a partial match if their name contains the searchName
		//If no match or partial match is found, return null
		return null;
	}
	
	public void describeEverybody(){
		//pi == place index
		for (int pi = 0; pi < everyWhere.length; pi++){
			//ci == character index
			for(int ci = 0; ci < everyWhere[pi].getSize(); ci++){
				System.out.println(everyWhere[pi].getCharacter(ci).description());
			}
		}
	}
	
	public static World getDefaultWorld(){
		World affc = new World("A Feast For Crows");
		Place theWall = new Place("The Wall");
		theWall.addCharacter(new Character("Jon Snow", 
				new Item[]{new Item("Long Claw"), new Item("Raven")}));
		theWall.addCharacter(new Character("Stannis the Mannis"));
		
		Place riverrun = new Place("River Run");
		riverrun.addCharacter(new Character("Jon Umber 'The Greatjon'"));
		riverrun.addCharacter(new Character("Jon Umber 'The Littlejon"));
		riverrun.addCharacter(new Character("Jamie Lannister",
				new Item[]{new Item("A Golden Hand"), new Item("Glory"), new Item("Honor")},
				new String[]{"Banter", "Threaten", "Bribe"}));
		affc.add(riverrun);
		affc.add(theWall);
		
		return affc;
	}
	
	public static void main(String[] args){
		//TODO Test the methods you've written
		World world = getDefaultWorld();
		//Where's Jamie? Print out his location's name
		
		//Show that searching the world for 'Jon' isn't specific enough

		
		//Get ahold of Jon Snow by name
		//Make him drop Long Claw by name
		//Demonstrate that he can't drop Long Claw again
		
		
	}
	
}

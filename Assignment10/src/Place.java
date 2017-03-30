import java.util.Arrays;


public class Place {
	private Character[] inhabitants;	//everybody at this place
	private int peopleCount = 0;
	private String name;
	
	public Place(String name, Character[] inhabitants){
		this.name = name;
		this.inhabitants = inhabitants;
		peopleCount = inhabitants.length;
	}
	
	public Place(String name){
		this.name = name;
		inhabitants = new Character[0];
	}
	
	public void addCharacter(Character somebody){
		//TODO If the array inhabitants is full, increase its size
		inhabitants[peopleCount] = somebody;
		peopleCount++;
	}
	
	public Character getCharacter(int index){
		//TODO Add a guard to reject bad indexes
		//If index is not a valid index, return null
		return inhabitants[index];
	}
	
	public Character getCharacter(String searchName){
		//TODO Return specified character
		//Search the array inhabitants for a character with the name searchName.
		//If there is only one partial match, return the partial match
		// A character is a partial match if their name contains searchName
		//If no matches or partial matches are found, return null
		return null;
	}
	
	
	public Character removeCharacter(Character who){
		//TODO remove the character who from the array
		//Leave no gaps, but you don't have to preserve order
		//Return the removed character
		//If there is no such character, return null
		return null;
	}
	
	public Character removeCharacter(String searchName){
		//TODO remove the character with the name searchName from the array
		//Leave no gaps, but you don't have to preserve order
		//Handle partial matches as with getCharacter
		//Return the removed character
		//If there is no such character, return null
		return null;
	}
	
	public int getSize(){
		return peopleCount;
	}
	
	public String toString(){
		return name + " : " +  Arrays.toString(inhabitants);
	}
	
}

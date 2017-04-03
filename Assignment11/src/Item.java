
public class Item {
	private String name;
	private double cost;
	
	public Item(String name, double cost){
		this.name = name;
		this.cost = cost;
	}
	
	public String toString(){
		return String.format("%s $%.2f", name, cost);
	}
	
	public String getName(){
		return name;
	}
	
	public double getCost(){
		return cost;
	}
	
	public static Item bundle(Item foo, Item bar){
		//Create a new item
		//The new item's name is foo's name + bar's name
		//The new item's cost is foo's cost + bar's cost
		//If either foo or bar is null, throw a NullPointerException describing which is null
		
		
		//Solution code TODO delete for students
		if (foo == null){
			throw new NullPointerException("Null Item Foo");
		}else if (bar == null){
			throw new NullPointerException("Null Item Bar");
		}
		return new Item(foo.name + " + " + bar.name, foo.cost + bar.cost);
		
	}
}

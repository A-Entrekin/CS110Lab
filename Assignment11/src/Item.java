
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
		return new Item(foo.name + " + " + bar.name, foo.cost + bar.cost);
		
	}
}

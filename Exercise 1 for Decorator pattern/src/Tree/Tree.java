package Tree;

public abstract class Tree {
	//field name
	protected String name = "Unknown Tree";
	
	//method return name
	public String getDescription() {
		return name +" tree decorated with";
	}
	//method return cost
	public abstract double cost();
}

package decorations;

import Tree.Tree;

public class Star extends DecorationDecorator{
	
	private String decoretor;
	private double cost;
	public Star(Tree tree) {
		super(tree);
		if (tree.getDescription().contains("a Star")) {
			System.out.println("Tree already has a star!");
			this.decoretor = "";
			this.cost = 0;
		}
		else {
			this.decoretor=", a Star";
			this.cost = 4;
		}
	}
	@Override
	public String getDescription() {
		return tree.getDescription()+this.decoretor;
	}

	@Override
	public double cost() {
		return tree.cost()+this.cost;
	}
}

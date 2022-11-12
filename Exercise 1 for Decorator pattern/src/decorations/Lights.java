package decorations;

import Tree.Tree;

public class Lights extends DecorationDecorator {

	public Lights(Tree tree) {
		super(tree);
	}

	@Override
	public String getDescription() {
		return tree.getDescription() + ", Lights";
	}
	
	@Override
	public double cost() {
		return 5 + tree.cost();
	}

}

package Factory;

import Chocolate.*;

public class ChocolateFactory {
	private int idCho;
	private chocolate choco;
	
	private static ChocolateFactory instance;
	
	//private constructor 
	private ChocolateFactory() {}
	
	public static ChocolateFactory getInstance() {
		if(instance == null) {
			instance = new ChocolateFactory();
		}
		return instance;
	}
	
	//method : set type Chocolate
	public void setChoco(String type) {
		if(type == "Wonka Bar") {
			this.choco = new wonka_bar();
		}
		else if(type == "Omphalomancy Bar") {
			this.choco = new omphalomancy_bar();
		}
		else{
			this.choco = new chocolate();
		}
		
		this.idCho++;
	}
	
	public void showChocolate() {
		System.out.println("id : "+this.idCho);
		choco.showType();
	}
}

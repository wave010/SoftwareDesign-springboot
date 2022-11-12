package Breakfast;

import Template.BreakfastTemplate;

public class Omelette extends BreakfastTemplate {
	private boolean salt = false;
	private boolean pepper = false;
	
	@Override
	public void cook() {
		System.out.println("Your choice of breakfast is omelette.");
	}
	@Override
	public void salt() {
		if(salt) {
			System.out.println("salt : yes");
		}else {
			System.out.println("salt : no");
		}
	}
	@Override
	public void pepper() {
		if(pepper) {
			System.out.println("pepper : yes");
		}else {
			System.out.println("pepper : no");
		}
	}
	@Override
	public void setsalt(String msg) {
		if(msg == "yes") {
			this.salt = true;
		}
	}
	@Override
	public void setpepper(String msg) {
		if(msg == "yes") {
			this.pepper = true;
		}
	}
}

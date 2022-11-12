package Factory;

import Slots.Bonus;
import Slots.Progressive;
import Slots.Straight;
import Slots.slots;

public class Washington extends slotFactory{
	@Override
	public slots BuildSlots(String Type) {
		if(Type == "Straight") {
			return new Straight("Large","bills","reels","ARM","Linux");
		}
		else if(Type == "Bonus") {
			return new Bonus("Medium","ticketinticketout","VGA","ARM","Symbian");
		}
		else if(Type == "Progressive") {
			return new Progressive("Large","coins","reels","ARM","Andorid");
		}
		else{
			return null;
		}
	}
}

package Factory;

import Slots.*;
import Slots.slots;

public class Nevada extends slotFactory {

	@Override
	public slots BuildSlots(String Type) {
		if(Type == "Straight") {
			return new Straight("Large","ticketinticketout","reels","ARM","Linux");
		}
		else if(Type == "Bonus") {
			return new Bonus("Small","ticketinticktout","CRT","X86","Linux");
		}
		else if(Type == "Progressive") {
			return new Progressive("Medium","ticketinticktout","LCD","X77","Android");
		}
		else{
			return null;
		}
	}

}

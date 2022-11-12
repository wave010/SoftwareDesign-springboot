package Factory;

import Slots.Bonus;
import Slots.Progressive;
import Slots.Straight;
import Slots.slots;

public class New_jersey extends slotFactory{

	@Override
	public slots BuildSlots(String Type) {
		if(Type == "Straight") {
			return new Straight("Small","coins","LCD","ARM","Windows ME");
		}
		else if(Type == "Bonus") {
			return new Bonus("Large","coins","reels","ARM","Windows ME");
		}
		else if(Type == "Progressive") {
			return new Progressive("Small","bills","CRT","X86","Windows XP");
		}
		else{
			return null;
		}
	} 
}

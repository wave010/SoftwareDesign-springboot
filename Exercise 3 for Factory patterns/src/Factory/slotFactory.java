package Factory;

import Slots.slots;

public abstract class slotFactory {
	public slots CreateNewSlots(String city,String Type) {
		return BuildSlots(Type);
	}
	public abstract slots BuildSlots(String Type);
}

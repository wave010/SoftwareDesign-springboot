package Template;

public abstract class BreakfastTemplate {
	//template method, final so subclasses can't override
	public final void cooking() {
		start();
		cook();
		salt();
		pepper();
		System.out.println("Your food is ready to be served.");
	}
	//methods to be implemented by subclasses
	public abstract void cook();
	public abstract void salt();
	public abstract void pepper();
	public abstract void setsalt(String msg);
	public abstract void setpepper(String msg);
	
	private void start() {
		System.out.println("making breakfast");
	}
}

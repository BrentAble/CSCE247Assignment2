/** 
 * Author @ Brent Able
 */
public class Knight implements Observer{
	private int warning;
	private Subject Watchman;
	
	public Knight(Subject Watchman) {
		this.Watchman = Watchman;
		Watchman.registerObserver(this);
	}
	
	public void update(int warning) {
		this.warning = warning;
		display();
	}
	/**
	 * This method takes the information from display and updates it into the watchman class where its called at
	 */
	public void display() {
		if(warning == 1) {
			System.out.println("Monte helps every get home Safe");
		}
		else if(warning == 2) {
			System.out.println("Monte prepares for battle");
		}
	}
	/**
	 * This command displays what happens when the trumpets are blown for the two possible options.
	 */
}
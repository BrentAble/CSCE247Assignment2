/**
 * 
 * Author @ Brent Able
 *
 */
public class ShopOwner implements Observer {
	private int warning;
	private Subject Watchman;
	
	public ShopOwner(Subject Watchman) {
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
			System.out.println("Fredrick closes down shop and head home");
		}
		else if(warning == 2) {
			System.out.println("Fredrick drops everything and find nearest hideout");
		}
	}
	/**
	 * This command displays what happens when the trumpets are blown for the two possible options.
	 */
}
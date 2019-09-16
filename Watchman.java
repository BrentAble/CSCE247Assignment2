/**
 * 
 * Author @ Brent Able
 *
 */
import java.util.ArrayList;

public class Watchman implements Subject {
	private ArrayList<Observer> observers;
	private int warning;
	
	public Watchman() {
		observers = new ArrayList<Observer>();
	}
	/**
	 * This is the array list with variable Observer (following the people affected by the trumpet bellowing
	 */
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}
	
	public void removeObserver(Observer observer) {
		observers.remove(observer);	
	}
	/**
	 * the follwoing removes and adds observers
	 */
	
	public void notifyObservers() {
		for(Observer observer : observers) {
			observer.update(warning);
		}
	}
	public void issueWarning(int warning) {
		this.warning = warning;
		if(warning == 1) {
			System.out.println("WARNING: The trumpets have been Blown once");
		}
		else if(warning == 2) {
			System.out.println("WARNING: The trumpets have been Blown Twice");
		}
		notifyObservers();
	}
	/**
	 * The following two methods work hand in hand
	 * The first will upload the information each observer does based on which number warning is equal to
	 * While issueWarning uploads the respective information for those numbers and a line to indicate which number
	 * warning is equal to
	 */
}
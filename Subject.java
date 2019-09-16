/**
 * Author @ Brent Able
 * This interface will implement into watchman
 */
public interface Subject {
	public void registerObserver(Observer observer);
	public void removeObserver(Observer observer);
	public void notifyObservers();
}
package timeofday;
/**
 * Elke instantie van deze klasse slaat een tijdstip op, gegeven door een aantal uren sinds middernacht en een aantal minuten binnen het uur.
 * 
 * Abstractetoestandsvarianten:
 * @invar | getMinutesSinceMidnight() == getHours() * 60 + getMinutes()
 * @invar | 0 <= getHours() && getHours() <= 23
 * @invar 0 <= getMinutes() && getMinutes() <= 59
 * 
 * */
public class TimeOfDay {
	
	/**
	 * 
	 * @invar | 0 <= hours && hours <= 23
	 * @invar | 0 <= minutes && minutes <= 59
	 * */
	private int hours;
	private int minutes;
	
	// Geen documentatie bij getters
	public int getHours() {
		return hours;
	}
	
	public int getMinutes() {
		return minutes;
	}
	
	
	public int getMinutesSinceMidnight() {
		return hours * 60 + minutes;
	}

	/**
	 * Initialiseert het nieuwe object met gegeven uren en minuten.
	 * 
	 * @pre | 0 <= initialHours && initialHours <= 23
	 * @pre | 0 <= initialMinutes && initialMinutes <= 59
	 * 
	 * @post | getHours() == initialHours
	 * @post | getMinutes() == initialMinutes
	 * 
	 * */
	public TimeOfDay(int initialHours, int initialMinutes) {
		hours = initialHours;
		minutes = initialMinutes;
	}
	
	/**
	 * Stelt uren van dit object in op de gegeven uren
	 * 
	 * @pre | 0 <= newHours && newHours <= 23
	 * 
	 * @mutates | this
	 * 
	 * @post | getHours() == newHours
	 * @post | getMinutes() == old(getMinutes())
	 * */
	public void setHours(int newHours) {
		hours = newHours;
	}
	
	public void setMinutes(int newMinutes) {
		minutes = newMinutes;
	}
	
	
	/**
	 * Stelt de minuten sinds middernacht in op de gegeven waarde.
	 * 
	 * @pre | 0 <= newMinutesSinceMidnight && newMinutesSinceMidnight < 24 * 60
	 * 
	 * @mutates | this
	 * 
	 * @post | getMinutesSinceMidnight() == newMinutesSinceMidnight
	 * 
	 * */
	public void setMinutesSinceMidnight(int newMinutesSinceMidnight) {
		hours = newMinutesSinceMidnight / 60;
		minutes = newMinutesSinceMidnight % 60;
	} 

}

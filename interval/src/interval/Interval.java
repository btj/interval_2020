package interval;

/**
 * Elke instantie van deze klasse stelt een interval van gehele getallen voor.
 * 
 * @invar De breedte is niet negatief
 *     | 0 <= getBreedte()
 * @invar De bovengrens is gelijk aan de ondergrens plus de breedte
 *     | getBovengrens() == getOndergrens() + getBreedte()
 */
public class Interval {
	
	// Private klasse-invarianten = representatie-invarianten
	/**
	 * 
	 * @invar De bovengrens is niet kleiner dan de ondergrens
	 *     | ondergrens <= bovengrens
	 */
	private int bovengrens;
	private int ondergrens;
	
	/**
	 * @pre | initiëleOndergrens <= initiëleBovengrens
	 * @post | getBovengrens() == initiëleBovengrens
	 * @post | getOndergrens() == initiëleOndergrens
	 */
	public Interval(int initiëleBovengrens, int initiëleOndergrens) {
		this.bovengrens = initiëleBovengrens;
		this.ondergrens = initiëleOndergrens;
	}
	
	public int getOndergrens() {
		return ondergrens;
	}

	public int getBreedte() { // instantiemethode
		return bovengrens - ondergrens;
	}
	
	public int getBovengrens() {
		return bovengrens;
	}
	
	/**
	 * @post De ondergrens van het gegeven interval is gelijk aan de gegeven ondergrens
	 *     | this.getOndergrens() == ondergrens
	 * @post De breedte van het gegeven interval blijft ongewijzigd
	 *     | this.getBreedte() == old(this.getBreedte())
	 */
	public void setOndergrens(int ondergrens) {
		int breedte = bovengrens - this.ondergrens;
		this.ondergrens = ondergrens;
		bovengrens = ondergrens + breedte;
	}
	
	/**
	 * @pre De gegeven bovengrens mag niet kleiner zijn dan de ondergrens.
	 *     | getOndergrens() <= bovengrens
	 * @post De bovengrens van het gegeven interval is gelijk aan de gegeven bovengrens
	 *     | this.getBovengrens() == bovengrens
	 * @post De ondergrens van het gegeven interval blijft ongewijzigd
	 *     | this.getOndergrens() == old(this.getOndergrens())
	 */
	public void setBovengrens(int bovengrens) {
		this.bovengrens = bovengrens;
	}

}

package interval;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IntervalTest {
	
	@Test
	void test() {
		Interval myInterval = new Interval(0, 4);
		myInterval.setOndergrens(3);
		myInterval.setBovengrens(7);
		assert myInterval.getBreedte() == 4;
		//assert Interval.getBreedte(myInterval) == 4;
	}

}

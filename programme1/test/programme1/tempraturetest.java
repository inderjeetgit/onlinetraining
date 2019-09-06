package programme1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class tempraturetest {

	@Test
	void test() {
		Temprature t=new Temprature();
		double actual=50;
		double result=t.convertToFarnheit(t.convertToCelsius(actual));
		assertEquals(result,actual);
	}

}

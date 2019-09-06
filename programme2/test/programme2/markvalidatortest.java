package programme2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class markvalidatortest {

	@Test
	void test() {
		MarkValidator mv=new MarkValidator();
		int mark=60;
		String actual="Grade C";
		String result=mv.markGrade(mark);
		assertEquals(actual,result);
	}

}

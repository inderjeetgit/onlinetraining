package programme3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class markvalswitchtest {

	@Test
	void test() {
		Markvalswitch mks=new Markvalswitch();
		String actual="Grade A";
		String result=mks.markGrade(91);
		assertEquals(actual,result);
		
	}

}

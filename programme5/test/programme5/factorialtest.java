package programme5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class factorialtest {

	@Test
	void test() {
		Factorial ft=new Factorial();
		int actual=120;
		int result=ft.calculateFactorial(5);
		assertEquals(actual,result);
	}

}

package programme4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class sumtest {

	@Test
	void test() {
		SumOfNumbers son=new SumOfNumbers();
		int start=1,end=10;
		int actual=55;
		int result=son.sumOfEvenNumbers(start,end)+son.sumOfOddNumbers(start,end);
		assertEquals(actual,result);
		
	}

}

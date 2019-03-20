package intrest_SI_CI;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class intrest_test {

	@Test
	void test1() {
		si_ci i=new si_ci();
		assertEquals(360,i.SI(12000, 1, 3));
	}
	
	@Test
	void test2() {
		si_ci i=new si_ci();
		assertEquals(120,i.CI(120,1,1));
	}


}

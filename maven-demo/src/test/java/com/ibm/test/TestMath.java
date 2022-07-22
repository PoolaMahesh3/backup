package com.ibm.test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.ibm.Math;
public class TestMath {
	private Math maths;
	
	@BeforeEach
	public void init() {
		maths = new Math();
	}
	
	
@Test

	public void testAdd() {
		assertEquals(10, maths.add(5, 5));
	}
	
	
@Test
	public void testSubs() {
		assertEquals(5, maths.subs(10, 5));
	}
	
	
@Test

	public void testDivValid() {
		assertEquals(2, maths.div(10, 5));
	}
	
	
@Test

	public void testDivInvalid() {
		assertThrows(ArithmeticException.class, () -> maths.div(10, 0));
	}
}

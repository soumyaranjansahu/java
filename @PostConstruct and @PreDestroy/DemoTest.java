package junitString;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

class DemoTest {
	@Before
	public void before() {
    System.out.println("Before");
	}
	@After
	public void after() {
		System.out.println("After");
	}
	@Test
	public void test() {
		Demo demo=new Demo();
		assertTrue("heelo iam soumya",demo.compareString("hello", "hello"));
		//fail("Not yet implemented");
	}
	@Test
	public void testCompareString() {
		Demo demo=new Demo();
		assertEquals("heelo iam soumya",demo.compareString("hello", "hello"));
		//fail("Not yet implemented");

}
}

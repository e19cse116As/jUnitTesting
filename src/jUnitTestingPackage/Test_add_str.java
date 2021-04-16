package jUnitTestingPackage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Test_add_str {

	@Test
	public void test() {
		jUnitFunction obj_1=new jUnitFunction();
		String check=obj_1.add_str("Hello", "World");
		assertEquals("HelloWorld",check);
	}

}

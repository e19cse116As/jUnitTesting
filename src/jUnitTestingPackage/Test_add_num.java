package jUnitTestingPackage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Test_add_num {

	@Test
	public void test() {
		jUnitFunction obj=new jUnitFunction();
		int check=obj.add_num(10, 20);
		assertEquals(30,check);
		
	}

}

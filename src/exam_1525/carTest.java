package exam_1525;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class carTest {
	
	car c1;
	int x;
	

	@Before
	public void setUp() throws Exception {
		c1=new car(300);
	}

	@Test
	public void testGetEnginCapacity() {
		fail("Not yet implemented");
		
		assertEquals(300,x);
		
	}

}

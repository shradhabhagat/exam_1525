package exam_1525;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class carTest {
	
	car jip;
	int d;
	

	@Before
	public void setUp() throws Exception {
		jip=new car(300);
	}

	@Test
	public void testGetEnginCapacity() {
     d=jip.getEnginCapacity();
		
		assertEquals(300,d);
		
	}

}

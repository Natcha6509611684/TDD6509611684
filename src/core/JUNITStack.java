package core;
import java.util.*;
import org.junit.jupiter.api.Assertions;
import junit.framework.AssertionFailedError;
import junit.framework.TestCase;

public class JUNITStack extends TestCase {
	
	public void testCreateNewEmptyStack() {
		
		Stack s1 = new Stack();
		int size = s1.getSize();

		assertEquals(0, size);
		assertTrue(s1.isEmpty());
		
	}
	
	public void testPushElmToTop() {
		Stack s2 = new Stack();
		s2.push(1);
		int size = s2.getSize();
		assertEquals(1,s2.Top());
		
	}
	
	public void LastInFirstOut() {
        Stack s3 = new Stack ();
        s3.push(1);
        s3.push(2);
        s3.push(3);
        assertEquals(1, s3.getSize());
        assertEquals(2, s3.getSize());
        assertEquals(3, s3.getSize());
      
	}
	
	public void PushElmToLimitedSizeStack() {
		
	}
}



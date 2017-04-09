import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestMessage {
	static Message msg = null;

	@BeforeClass
	public static void init() {
		msg = new Message();
	}

	@Test
	public void testAdd() {
		assertEquals(11, msg.add(6, 5));
	}

	@Test
	public void testSubtract() {
		assertEquals(1, msg.subtract(6, 5));
	}

	@Test
	public void testMultiply() {
		assertEquals(30, msg.multiply(6, 5));
	}
}

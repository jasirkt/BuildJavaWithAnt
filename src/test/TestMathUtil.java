import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestMathUtil{
	static MathUtil mathUtil = null;

	@BeforeClass
	public static void init() {
		mathUtil = new MathUtil ();
	}

	@Test
	public void testAdd() {
		assertEquals(11, mathUtil.add(6, 5));
	}

	@Test
	public void testSubtract() {
		assertEquals(1, mathUtil.subtract(6, 5));
	}

	@Test
	public void testMultiply() {
		assertEquals(30, mathUtil.multiply(6, 5));
	}
}

package asd.devops.aula03;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class MoneyTest extends TestCase {

	public MoneyTest(String testName) {
		super(testName);
	}

	public static Test suite() {
		return new TestSuite(MoneyTest.class);
	}

	public void testShouldReturnValue13dot92WhenNewObject13dot92() {
		assertEquals(13.92, new Money(13.92).getValue());
	}
}
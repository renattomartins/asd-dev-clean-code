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

	public void testShouldReturnQuarentaEDoisWhen42() {
		Money money = new Money(42.00);
		
		assertEquals("Quarenta e dois reais", money.toNumberInFull());
	}
}

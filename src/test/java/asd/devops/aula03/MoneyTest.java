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
	
	public void testShouldReturnOitoReaisWhen8() {
		Money money = new Money(8.00);
		
		assertEquals("Oito reais", money.toNumberInFull());
	}

	public void testShouldReturnQuarentaEDoisReaisWhen42() {
		Money money = new Money(42.00);
		
		assertEquals("Quarenta e dois reais", money.toNumberInFull());
	}
	
	public void testShouldReturnSeiscentosESetentaEOitoReaisWhen678() {
		Money money = new Money(678.00);
		
		assertEquals("Seiscentos e setenta e oito reais", money.toNumberInFull());
	}
}

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
	
	public void testShouldReturnDezReaisWhen10() {
		Money money = new Money(10.00);

		assertEquals("Dez reais", money.toNumberInFull());
	}

	public void testShouldReturnQuinzeReaisWhen15() {
		Money money = new Money(15.00);

		assertEquals("Quinze reais", money.toNumberInFull());
	}

	public void testShouldReturnVinteReaisWhen20() {
		Money money = new Money(20.00);

		assertEquals("Vinte reais", money.toNumberInFull());
	}

	public void testShouldReturnQuarentaEDoisReaisWhen42() {
		Money money = new Money(42.00);

		assertEquals("Quarenta e dois reais", money.toNumberInFull());
	}

	public void testShouldReturnCemReaisWhen100() {
		Money money = new Money(100.00);

		assertEquals("Cem reais", money.toNumberInFull());
	}

	public void testShouldReturnCentoETresReaisWhen103() {
		Money money = new Money(103.00);

		assertEquals("Cento e três reais", money.toNumberInFull());
	}

	public void testShouldReturnDuzentosETrintaReaisWhen230() {
		Money money = new Money(230.00);

		assertEquals("Duzentos e trinta reais", money.toNumberInFull());
	}
	
	public void testShouldReturnTrezentosEDezesseisReaisWhen216() {
		Money money = new Money(216.00);

		assertEquals("Duzentos e dezesseis reais", money.toNumberInFull());
	}

	public void testShouldReturnSeiscentosESetentaEOitoReaisWhen678() {
		Money money = new Money(678.00);

		assertEquals("Seiscentos e setenta e oito reais", money.toNumberInFull());
	}

	public void testShouldReturnNovecentosReaisWhen900() {
		Money money = new Money(900.00);

		assertEquals("Novecentos reais", money.toNumberInFull());
	}
}

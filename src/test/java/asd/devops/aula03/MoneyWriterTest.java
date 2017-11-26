package asd.devops.aula03;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class MoneyWriterTest extends TestCase {

	public MoneyWriterTest(String testName) {
		super(testName);
	}

	public static Test suite() {
		return new TestSuite(MoneyWriterTest.class);
	}

	public void testShouldReturnValorInvalidoWhen13dot92() {
		assertEquals("Valor inválido", MoneyWriter.toNumberInFull(new Money(13.92)));
	}
	
	public void testShouldReturnValorInvalidoWhen1456Negative() {
		assertEquals("Valor inválido", MoneyWriter.toNumberInFull(new Money(-1456.00)));
	}

	public void testShouldReturnValorInvalidoWhen1456() {
		assertEquals("Valor inválido", MoneyWriter.toNumberInFull(new Money(1456.00)));
	}
	
	public void testShouldReturnMenosCemReaisWhen100Negative() {
		assertEquals("Menos cem reais", MoneyWriter.toNumberInFull(new Money(-100.00)));
	}
	
	public void testShouldReturnMenosETresReaisWhen23Negative() {
		assertEquals("Menos vinte e três reais", MoneyWriter.toNumberInFull(new Money(-23.00)));
	}
	
	public void testShouldReturnZeroReaisWhen0() {
		assertEquals("Zero reais", MoneyWriter.toNumberInFull(new Money(0.00)));
	}

	public void testShouldReturnOitoReaisWhen8() {
		assertEquals("Oito reais", MoneyWriter.toNumberInFull(new Money(8.00)));
	}

	public void testShouldReturnDezReaisWhen10() {
		assertEquals("Dez reais", MoneyWriter.toNumberInFull(new Money(10.00)));
	}

	public void testShouldReturnQuinzeReaisWhen15() {
		assertEquals("Quinze reais", MoneyWriter.toNumberInFull(new Money(15.00)));
	}

	public void testShouldReturnVinteReaisWhen20() {
		assertEquals("Vinte reais", MoneyWriter.toNumberInFull(new Money(20.00)));
	}

	public void testShouldReturnQuarentaEDoisReaisWhen42() {
		assertEquals("Quarenta e dois reais", MoneyWriter.toNumberInFull(new Money(42.00)));
	}

	public void testShouldReturnCemReaisWhen100() {
		assertEquals("Cem reais", MoneyWriter.toNumberInFull(new Money(100.00)));
	}

	public void testShouldReturnCentoETresReaisWhen103() {
		assertEquals("Cento e três reais", MoneyWriter.toNumberInFull(new Money(103.00)));
	}

	public void testShouldReturnDuzentosETrintaReaisWhen230() {
		assertEquals("Duzentos e trinta reais", MoneyWriter.toNumberInFull(new Money(230.00)));
	}

	public void testShouldReturnTrezentosEDezesseisReaisWhen216() {
		assertEquals("Duzentos e dezesseis reais", MoneyWriter.toNumberInFull(new Money(216.00)));
	}

	public void testShouldReturnSeiscentosESetentaEOitoReaisWhen678() {
		assertEquals("Seiscentos e setenta e oito reais", MoneyWriter.toNumberInFull(new Money(678.00)));
	}

	public void testShouldReturnNovecentosReaisWhen900() {
		assertEquals("Novecentos reais", MoneyWriter.toNumberInFull(new Money(900.00)));
	}
}

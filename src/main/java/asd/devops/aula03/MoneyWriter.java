package asd.devops.aula03;

public class MoneyWriter {

	private static final String[] UNITS = { "", "um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", "nove" };
	private static final String[] TEENS = { "dez", "onze", "doze", "treze", "quatorze", "quinze", "dezesseis", "dezessete", "dezoito", "dezenove" };
	private static final String[] DOZENS = { "", "", "vinte", "trinta", "quarenta", "cinquenta", "sessenta", "setenta", "oitenta", "noventa" };
	private static final String[] HUNDREDS = { "", "cento", "duzentos", "trezentos", "quatrocentos", "quinhentos", "seiscentos", "setecentos", "oitocentos", "novecentos" };
	private static final String HUNDRED = "cem";
	private static final String CONECTOR = " e ";
	private static final String CURRENCY_NAME = " reais";
	
	private MoneyWriter() {}

	public static String toNumberInFull(Money money) {
		String numberInFull = "";
		double number = money.getValue();  
		
		if ( number <= 0 || number % 1 != 0 || number > 999.99)
		{
			return "Valor inválido";
		}

		int hundred = (int) number / 100;
		int ten = (int) ((number % 100) / 10);
		int unit = (int) number % 10;
		
		// hundreds
		if (hundred > 0) {
			numberInFull = MoneyWriter.HUNDREDS[hundred];
			if (ten > 0 || unit > 0) {
				numberInFull += MoneyWriter.CONECTOR;
			}
		}
		
		if (number == 100) {
			numberInFull = MoneyWriter.HUNDRED;
		}
		
		// dozens
		if (ten > 1) {
			numberInFull += MoneyWriter.DOZENS[ten];
			if ( unit > 0) {
				numberInFull += MoneyWriter.CONECTOR;
			}
		}
		
		// teens
		if (ten == 1) {
			numberInFull += MoneyWriter.TEENS[unit];
		}
		
		// units
		if (unit > 0 && ten != 1) {
			numberInFull += MoneyWriter.UNITS[unit];
		}

		numberInFull += MoneyWriter.CURRENCY_NAME;
		numberInFull = numberInFull.substring(0, 1).toUpperCase() + numberInFull.substring(1);

		return numberInFull;
	}
}

package asd.devops.aula03;

public class Money {
	private double money;

	private static final String[] UNITS = { "", "um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", "nove" };
	private static final String[] TEENS = { "dez", "onze", "doze", "treze", "quatorze", "quinze", "dezesseis", "dezessete", "dezoito", "dezenove" };
	private static final String[] DOZENS = { "", "", "vinte", "trinta", "quarenta", "cinquenta", "sessenta", "setenta", "oitenta", "noventa" };
	private static final String[] HUNDREDS = { "", "cento", "duzentos", "trezentos", "quatrocentos", "quinhentos", "seiscentos", "setecentos", "oitocentos", "novecentos" };
	private static final String HUNDRED = "cem";
	private static final String CONECTOR = " e ";
	private static final String CURRENCY_NAME = " reais";

	public Money(double money) {
		this.money = money;
	}

	public String toNumberInFull() {
		if ( this.money <= 0 || this.money % 1 != 0 || this.money > 999.99)
		{
			return "Valor inválido";
		}

		String numberInFull = "";
		
		int hundred = (int) this.money / 100;
		int ten = (int) ((this.money % 100) / 10);
		int unit = (int) this.money % 10;
		
		// hundreds
		if (hundred > 0) {
			numberInFull = Money.HUNDREDS[hundred];
			if (ten > 0 || unit > 0) {
				numberInFull += Money.CONECTOR;
			}
		}
		
		if (this.money == 100) {
			numberInFull = Money.HUNDRED;
		}
		
		// dozens
		if (ten > 1) {
			numberInFull += Money.DOZENS[ten];
			if ( unit > 0) {
				numberInFull += Money.CONECTOR;
			}
		}
		
		// teens
		if (ten == 1) {
			numberInFull += Money.TEENS[unit];
		}
		
		// units
		if (unit > 0 && ten != 1) {
			numberInFull += Money.UNITS[unit];
		}

		numberInFull += Money.CURRENCY_NAME;
		numberInFull = numberInFull.substring(0, 1).toUpperCase() + numberInFull.substring(1);

		return numberInFull;
	}
}

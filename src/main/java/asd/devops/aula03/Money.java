package asd.devops.aula03;

public class Money 
{
    private double money;
    
    private static final String[] UNITS = {"", "um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", "nove"};
    private static final String[] TEENS = {"", "onze", "doze", "treze", "quatorze", "quinze", "dezesseis", "dezessete", "dezoito", "dezenove"};
    private static final String[] DOZENS = {"", "dez", "vinte", "trinta", "quarenta", "cinquenta", "sessenta", "setenta", "oitenta", "noventa"};
    private static final String[] HUNDREDS = {"", "cento", "duzentos", "trezentos", "quatrocentos", "quinhentos", "seiscentos", "setecentos", "oitocentos", "novecentos"};
    private static final String HUNDRED = "cem";
    private static final String CONECTOR = " e ";
    private static final String CURRENCY_NAME = " reais";

	public Money(double money) {
		this.money = money;
	}
	
	public String toNumberInFull() {
		String numberInFull = "";
		
		int hundred = (int)this.money / 100;
		int ten = (int)((this.money % 100) / 10);
		int unit = (int)this.money % 10;
		
		if ( hundred > 0 ) {
			numberInFull = Money.HUNDREDS[hundred] + Money.CONECTOR;
		}
		
		if ( ten > 0 ) {
			numberInFull += Money.DOZENS[ten] + Money.CONECTOR;
		}
		
		numberInFull += Money.UNITS[unit] + Money.CURRENCY_NAME;
		numberInFull = numberInFull.substring(0, 1).toUpperCase() + numberInFull.substring(1);
		
		return numberInFull;
	}
}

package code.figueroajose.jugs.ecinco.cinco;

public class DígitosSuma {

	
	
	public static int dígitosSuma(int digito) {
		var digitoSuma = 0;
	
		digitoSuma = dígitosSumaPrimeraFase(digito);
		
		while(digitoSuma >= 10) {
			digitoSuma= dígitosSumaPrimeraFase(digitoSuma);
		}
		
		return digitoSuma;
	} 
	
	
	public static int dígitosSumaPrimeraFase(int digito) {
		var sumaDigito = 0;
		
		while(digito > 0) {
			var últimodígito = digito % 10;
			sumaDigito += últimodígito;
			digito/=10;
		}
		
		return sumaDigito;
	}
	
	
}

package aulateste;

public class Calculadora {
	
	private WebServiceNumerosRomanos webService;
	
	public Calculadora(WebServiceNumerosRomanos webService){
		this.webService = webService;
	}

	public Double soma(Double valor1, Double valor2){
		if(valor1 != null && valor2 != null){
			return valor1+valor2;
		} else {
			return 0.0;
		}
	}
	
	public int somarNumeroRomano(String numeroRomano1, String numeroRomano2){
		return webService.converte(numeroRomano1) + webService.converte(numeroRomano2); 
	}
}

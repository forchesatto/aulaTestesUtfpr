package aulateste;

public class WebServiceNumerosRomanos {

	private ConversorDeNumeroRomano conversorDeNumeroRomano;
	
	public WebServiceNumerosRomanos(){
		conversorDeNumeroRomano = new ConversorDeNumeroRomano();
	}
	
	public Integer converte(String numeroRomano){
		System.out.println("passou pelo webservice");
		return conversorDeNumeroRomano.converte(numeroRomano);
	}
}

package aulateste;

import java.util.HashMap;
import java.util.Map;

public class ConversorDeNumeroRomano {

	private static final Map<Character, Integer> tabela 
		= new HashMap<Character, Integer>(){{
				put('I',1);
				put('V', 5);
				put('X', 10);
				put('L', 50);
				put('C', 100);
				put('D', 500);
				put('M', 1000);
			}};
	
	public int converte(String numeroRomano) {
		int retorno = 0;
		int ultimoVizinhoDireita = 0;
		for(int i=numeroRomano.length() - 1; i>=0; i--){
			int atual = tabela.get(numeroRomano.charAt(i));
			if(ultimoVizinhoDireita <= atual){
				retorno += atual;	
			} else {
				retorno -= atual;
			}
			ultimoVizinhoDireita = atual;
		}
		return retorno;
	}

}

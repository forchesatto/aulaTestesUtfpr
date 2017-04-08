package aulateste;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ConversorDeNumeroRomanoTest {

	@Test
	public void deveEntenderSimboloI(){
		ConversorDeNumeroRomano conversor = new ConversorDeNumeroRomano();
		int valor = conversor.converte("I");
		assertEquals(1, valor);
	}
	
	@Test
	public void deveEntenderSimboloV(){
		ConversorDeNumeroRomano conversor = new ConversorDeNumeroRomano();
		int valor = conversor.converte("V");
		assertEquals(5, valor);
	}
	
	@Test
	public void deveEntenderSimboloII(){
		ConversorDeNumeroRomano conversor = new ConversorDeNumeroRomano();
		int valor = conversor.converte("II");
		assertEquals(2, valor);
	}
	
	@Test
	public void deveEntenderSimboloXXII(){
		ConversorDeNumeroRomano conversor = new ConversorDeNumeroRomano();
		int valor = conversor.converte("XXII");
		assertEquals(22, valor);
	}
	
	@Test
	public void deveEntenderSimboloIV(){
		ConversorDeNumeroRomano conversor = new ConversorDeNumeroRomano();
		int valor = conversor.converte("IV");
		assertEquals(4, valor);
	}
	
	@Test
	public void deveEntenderSimboloXXIV(){
		ConversorDeNumeroRomano conversor = new ConversorDeNumeroRomano();
		int valor = conversor.converte("XXIV");
		assertEquals(24, valor);
	}
}

package aulateste;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CalculadoraTest {
	
	private Calculadora calculadora;
	
	@Mock
	private WebServiceNumerosRomanos webServiceNumerosRomano;

	@Before
	public void init(){
		calculadora = new Calculadora(webServiceNumerosRomano);
	}
	
	@Test
	public void deveSomar(){
		Double resultado = calculadora.soma(10.0, 10.0);
		assertThat(resultado, is(20.0));
	}
	@Test
	public void deveRetornarZeroSeNull(){
		Double resultado = calculadora.soma(null, null);
		assertThat(resultado, is(0.0));
	}
	@Test
	public void deveRetornarZeroSeUmForNull(){
		Double resultado = calculadora.soma(10.0, null);
		assertThat(resultado, is(0.0));
		resultado = calculadora.soma(null, 10.0);
		assertThat(resultado, is(0.0));
	}
	
	@Test
	public void deveSomarNumeroRomano(){
		Mockito.when(webServiceNumerosRomano.converte("IV")).thenReturn(4);
		Mockito.when(webServiceNumerosRomano.converte("XX")).thenReturn(20);
		int soma = calculadora.somarNumeroRomano("IV", "XX");
		assertThat(soma, is(24));
		//verifica se o método foi realmente chamado dentro da lógica
		Mockito.verify(webServiceNumerosRomano).converte("IV");
	}
	
	
	
	
	
	
	
	
	
}

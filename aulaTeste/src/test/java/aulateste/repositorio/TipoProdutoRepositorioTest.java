package aulateste.repositorio;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import aulateste.AulaTesteMain;
import aulateste.model.TipoProduto;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=AulaTesteMain.class)
public class TipoProdutoRepositorioTest {

	@Autowired
	private TipoProdutoRepositorio tipoProdutoRepositorio;
	
	@Test
	public void deveInserirTipoProduto(){
		TipoProduto tipoProduto = new TipoProduto();
		tipoProduto.setNome("Comida");
		TipoProduto tipoProdutoSalvo = tipoProdutoRepositorio.save(tipoProduto);
		assertNotNull(tipoProdutoSalvo.getCodigo());
		tipoProdutoRepositorio.delete(tipoProdutoSalvo);
	}
	
	
	
	
	
	
	
}

package aulateste.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.support.DirtiesContextTestExecutionListener;
import org.springframework.test.context.transaction.TransactionalTestExecutionListener;

import com.github.springtestdbunit.DbUnitTestExecutionListener;
import com.github.springtestdbunit.annotation.DatabaseSetup;

import aulateste.model.Produto;

@RunWith(SpringRunner.class)
@SpringBootTest
@TestExecutionListeners({ DependencyInjectionTestExecutionListener.class, 
		DirtiesContextTestExecutionListener.class,
		TransactionalTestExecutionListener.class, 
		DbUnitTestExecutionListener.class })
public class ProdutoServiceTest {

	@Autowired
	private ProdutoService produtoService;

	@DatabaseSetup("tipoProduto.xml")
	@Test
	public void deveInserirProduto() {
		Produto produto = new Produto();
		produto.setNome("Cerveja");
		produto.setTipoProduto(new TipoProduto(999L));
		produto.setValorCustoMedio(3.0);
		produto.setValorVenda(4.0);
		produtoService.salvar(produto);
	}

}

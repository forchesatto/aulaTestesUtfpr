package aulateste.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import aulateste.model.Produto;
import aulateste.repositorio.ProdutoRepositorio;

@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepositorio produtoRepositorio;
	
	public Produto salvar(Produto produto){
		return produtoRepositorio.save(produto);
	}
}

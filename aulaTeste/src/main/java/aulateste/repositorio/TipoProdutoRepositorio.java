package aulateste.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import aulateste.model.TipoProduto;

public interface TipoProdutoRepositorio 
							extends JpaRepository<TipoProduto, Long> {

}

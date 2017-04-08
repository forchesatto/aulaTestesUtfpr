package aulateste.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import aulateste.model.Produto;

public interface ProdutoRepositorio 
					extends JpaRepository<Produto, Long> {

}

package br.com.saks.livroservice.repository;

import br.com.saks.livroservice.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long>{
    
}

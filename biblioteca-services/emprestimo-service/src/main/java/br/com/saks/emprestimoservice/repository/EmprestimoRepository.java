package br.com.saks.emprestimoservice.repository;

import br.com.saks.emprestimoservice.model.Emprestimo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmprestimoRepository extends JpaRepository<Emprestimo, Long>{
    
}

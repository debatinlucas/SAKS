package br.com.saks.itememprestimoservice.repository;

import br.com.saks.itememprestimoservice.model.ItemEmprestimo;
import br.com.saks.itememprestimoservice.model.ItemEmprestimoIdentity;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemEmprestimoRepository extends JpaRepository<ItemEmprestimo, ItemEmprestimoIdentity>{
    //O Spring JPA irá analisar automaticamente o nome do método e criar uma consulta a partir dele.
    Optional<ItemEmprestimo> findByItemEmprestimoIdentityIdEmprestimo(Long id);
}

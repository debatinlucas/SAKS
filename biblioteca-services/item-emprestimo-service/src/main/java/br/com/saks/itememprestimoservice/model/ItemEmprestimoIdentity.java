package br.com.saks.itememprestimoservice.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class ItemEmprestimoIdentity implements Serializable {
    @Column(name="id_emprestimo")
    private Long idEmprestimo;
    
    @Column(name="id_livro")
    private Long idLivro;
}

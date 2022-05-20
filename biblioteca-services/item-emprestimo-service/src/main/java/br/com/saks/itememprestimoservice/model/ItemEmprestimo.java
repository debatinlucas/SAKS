package br.com.saks.itememprestimoservice.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class ItemEmprestimo {
    @EmbeddedId
    private ItemEmprestimoIdentity itemEmprestimoIdentity;
}

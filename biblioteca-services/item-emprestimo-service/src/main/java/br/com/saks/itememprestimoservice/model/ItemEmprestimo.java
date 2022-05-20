package br.com.saks.itememprestimoservice.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
public class ItemEmprestimo {
    @EmbeddedId
    private ItemEmprestimoIdentity emprestimoIdentity;
}

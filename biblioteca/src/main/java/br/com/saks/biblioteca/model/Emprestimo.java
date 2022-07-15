package br.com.saks.biblioteca.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import lombok.Data;

@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
@Data
@Entity
public class Emprestimo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;
    
    @ManyToMany
    @JoinTable(
        name = "item_emprestimo",
        joinColumns = @JoinColumn(name = "id_emprestimo"),
        inverseJoinColumns = @JoinColumn(name = "id_livro")
    )
    private List<Livro> livros;
    
    @Column(name="data_retirada")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataRetirada;
    
    @Column(nullable = false)
    private Integer status;
}

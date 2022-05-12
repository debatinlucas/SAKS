package br.com.saks.usuarioservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false, length = 150)
    private String nome;
    
    @Column(nullable = false, unique = true, length = 200)
    private String email;
    
    @Column(nullable = false, length = 200)
    private String senha;
}

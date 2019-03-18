/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsul.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import org.hibernate.annotations.ForeignKey;

/**
 *
 * @author 201613260113
 */
@Entity
@Table(name = "exemplar")
public class Exemplar implements Serializable{
    @Id
    @SequenceGenerator(name = "seq_exemplar", sequenceName = "seq_exemplar_id",
            allocationSize = 1)
    @GeneratedValue(generator = "seq_exemplar", strategy = GenerationType.SEQUENCE)
    private Integer id;
    @NotNull(message = "O livro deve ser informado")
    @OneToOne
    @JoinColumn(name = "livro", referencedColumnName = "id", nullable = false)
    @ForeignKey(name = "fk_exemplar_livro")
    private Livro livro;
    @NotNull(message = "A quantidade deve ser informada")
    @Column(name = "quantidade", nullable = false, length = 3)
    private Integer quantidade;
    

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the livro
     */
    public Livro getLivro() {
        return livro;
    }

    /**
     * @param livro the livro to set
     */
    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    /**
     * @return the quantidade
     */
    public Integer getQuantidade() {
        return quantidade;
    }

    /**
     * @param quantidade the quantidade to set
     */
    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    
    
}

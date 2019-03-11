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
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import org.hibernate.annotations.ForeignKey;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

/**
 *
 * @author 201613260113
 */
@Entity
@Table(name = "livro")
public class Livro implements Serializable{
    @Id
    @SequenceGenerator(name = "seq_livro", sequenceName = "seq_livro_id",
            allocationSize = 1)
    @GeneratedValue(generator = "seq_livro", strategy = GenerationType.SEQUENCE)
    private Integer id;
    @NotNull(message = "O título não pode ser nulo")
    @Length(max = 30, message = "O título não pode ter mais que {max} caracteres")
    @NotBlank(message = "O título não pode ser em branco")
    @Column(name = "titulo", nullable = false, length = 30)
    private String titulo;
    @NotNull(message = "O ISBN não pode ser nulo")
    @Length(max = 13, message = "O ISBN não pode ter mais que {max} caracteres")
    @NotBlank(message = "O ISBN não pode ser em branco")
    @Column(name = "isbn", nullable = false, length = 13)
    private String isbn;
    @NotNull(message = "O autor não pode ser nulo")
    @Length(max = 50, message = "O autor não pode ter mais que {max} caracteres")
    @NotBlank(message = "O autor não pode ser em branco")
    @Column(name = "autor", nullable = false, length = 50)
    private String autor;
    @NotNull(message = "O genero deve ser informado")
    @ManyToOne
    @JoinColumn(name = "genero", referencedColumnName = "id", nullable = false)
    @ForeignKey(name = "fk_livro_genero")
    private Genero genero;

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
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the isbn
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * @param isbn the isbn to set
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    /**
     * @return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * @return the genero
     */
    public Genero getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(Genero genero) {
        this.genero = genero;
    }
    
}

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
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

/**
 *
 * @author 201613260113
 */
@Entity
@Table(name = "pessoa")
public class Pessoa implements Serializable{
    @Id
    @SequenceGenerator(name = "seq_pessoa", sequenceName = "seq_pessoa_id",
            allocationSize = 1)
    @GeneratedValue(generator = "seq_pessoa", strategy = GenerationType.SEQUENCE)
    private Integer id;
    @NotNull(message = "O nome não pode ser nulo")
    @Length(max = 30, message = "O nome não pode ter mais que {max} caracteres")
    @NotBlank(message = "O nome não pode ser em branco")
    @Column(name = "nome", nullable = false, length = 30)
    private String nome;
    @NotNull(message = "O telefone não pode ser nulo")
    @Length(max = 13, message = "O telefone não pode ter mais que {max} caracteres")
    @NotBlank(message = "O telefone não pode ser em branco")
    @Column(name = "telefone", nullable = false, length = 13)
    private String telefone;
    @NotNull(message = "O cpf não pode ser nulo")
    @Length(max = 11, message = "O cpf não pode ter mais que {max} caracteres")
    @NotBlank(message = "O cpf não pode ser em branco")
    @Column(name = "cpf", nullable = false, length = 11)
    private String cpf;
    @NotNull(message = "O login não pode ser nulo")
    @Length(max = 30, message = "O login não pode ter mais que {max} caracteres")
    @NotBlank(message = "O login não pode ser em branco")
    @Column(name = "login", nullable = false, length = 30)
    private String login;
    @NotNull(message = "A senha não pode ser nula")
    @Length(max = 30, message = "A senha não pode ter mais que {max} caracteres")
    @NotBlank(message = "A senha não pode ser em branco")
    @Column(name = "senha", nullable = false, length = 30)
    private String senha;
    @NotNull(message = "O tipo não pode ser nulo")
    @Length(max = 30, message = "O tipo não pode ter mais que {max} caracteres")
    @NotBlank(message = "O tipo não pode ser em branco")
    @Column(name = "tipo", nullable = false, length = 1)
    private String tipo;

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
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the login
     */
    public String getLogin() {
        return login;
    }

    /**
     * @param login the login to set
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
}

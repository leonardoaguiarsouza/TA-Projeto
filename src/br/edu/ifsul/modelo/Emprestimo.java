/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsul.modelo;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import org.hibernate.annotations.ForeignKey;

/**
 *
 * @author 201613260113
 */
@Entity
@Table(name = "emprestimo")
public class Emprestimo implements Serializable{
    @Id
    @SequenceGenerator(name = "seq_emprestimo", sequenceName = "seq_emprestimo_id",
            allocationSize = 1)
    @GeneratedValue(generator = "seq_emprestimo", strategy = GenerationType.SEQUENCE)
    private Integer id;
    @NotNull(message = "O cliente deve ser informado")
    @OneToOne
    @JoinColumn(name = "cliente", referencedColumnName = "id", nullable = false)
    @ForeignKey(name = "fk_emprestimo_cliente")
    private Pessoa cliente;
    @NotNull(message = "O funcionario deve ser informado")
    @OneToOne
    @JoinColumn(name = "funcionario", referencedColumnName = "id", nullable = false)
    @ForeignKey(name = "fk_emprestimo_funcionario")
    private Pessoa funcionario;
    @NotNull(message = "O exemplar deve ser informado")
    @OneToOne
    @JoinColumn(name = "exemplar", referencedColumnName = "id", nullable = false)
    @ForeignKey(name = "fk_emprestimo_exemplar")
    private Exemplar exemplar;
    @Column(name = "reserva")
    private Boolean reserva;
    @Temporal(TemporalType.DATE)    
    @Column(name = "data_emprestimo")
    private Calendar dataEmprestimo;
    @Temporal(TemporalType.DATE)    
    @Column(name = "data_prev_devolucao")
    private Calendar dataPrevistaDevolucao;
    @Temporal(TemporalType.DATE)    
    @Column(name = "data_efet_devolucao")
    private Calendar dataEfetuadaDevolucao;

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
     * @return the cliente
     */
    public Pessoa getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Pessoa cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the funcionario
     */
    public Pessoa getFuncionario() {
        return funcionario;
    }

    /**
     * @param funcionario the funcionario to set
     */
    public void setFuncionario(Pessoa funcionario) {
        this.funcionario = funcionario;
    }

    /**
     * @return the reserva
     */
    public Boolean getReserva() {
        return reserva;
    }

    /**
     * @param reserva the reserva to set
     */
    public void setReserva(Boolean reserva) {
        this.reserva = reserva;
    }

    /**
     * @return the dataEmprestimo
     */
    public Calendar getDataEmprestimo() {
        return dataEmprestimo;
    }

    /**
     * @param dataEmprestimo the dataEmprestimo to set
     */
    public void setDataEmprestimo(Calendar dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    /**
     * @return the dataPrevistaDevolucao
     */
    public Calendar getDataPrevistaDevolucao() {
        return dataPrevistaDevolucao;
    }

    /**
     * @param dataPrevistaDevolucao the dataPrevistaDevolucao to set
     */
    public void setDataPrevistaDevolucao(Calendar dataPrevistaDevolucao) {
        this.dataPrevistaDevolucao = dataPrevistaDevolucao;
    }

    /**
     * @return the dataEfetuadaDevolucao
     */
    public Calendar getDataEfetuadaDevolucao() {
        return dataEfetuadaDevolucao;
    }

    /**
     * @param dataEfetuadaDevolucao the dataEfetuadaDevolucao to set
     */
    public void setDataEfetuadaDevolucao(Calendar dataEfetuadaDevolucao) {
        this.dataEfetuadaDevolucao = dataEfetuadaDevolucao;
    }

    /**
     * @return the exemplar
     */
    public Exemplar getExemplar() {
        return exemplar;
    }

    /**
     * @param exemplar the exemplar to set
     */
    public void setExemplar(Exemplar exemplar) {
        this.exemplar = exemplar;
    }

    

    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsul.testes.junit;

import br.edu.ifsul.jpa.EntityManagerUtil;
import br.edu.ifsul.modelo.Genero;
import br.edu.ifsul.modelo.Emprestimo;
import br.edu.ifsul.modelo.Pessoa;
import java.util.Calendar;
import javax.persistence.EntityManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author 201613260113
 */
public class TestePersistirEmprestimo {
    EntityManager em;

    public TestePersistirEmprestimo() {
    }

    @Before
    public void setUp() {
        em = EntityManagerUtil.getEntityManager();
    }

    @After
    public void tearDown() {
        em.close();
    }
    
    @Test
    public void teste(){
        boolean erro = false;
        try {
            Emprestimo obj = new Emprestimo();
            obj.setCliente(em.find(Pessoa.class, 1));
            obj.setFuncionario(em.find(Pessoa.class, 2));
            Calendar cal = Calendar.getInstance();
            obj.setDataEmprestimo(cal);
            obj.setDataEfetuadaDevolucao(cal);
            obj.setDataPrevistaDevolucao(cal);
            em.getTransaction().begin();
            em.persist(obj);
            em.getTransaction().commit();
        } catch (Exception e){
            erro = true;
            e.printStackTrace();
        }
        // aqui verifico se o valor do erro continua falso oque indica que o teste passou
        Assert.assertEquals(false, erro);
    }
}

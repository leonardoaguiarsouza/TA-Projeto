/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsul.testes.junit;

import br.edu.ifsul.jpa.EntityManagerUtil;
import br.edu.ifsul.modelo.Genero;
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
public class TestePersistirPessoa {
    EntityManager em;

    public TestePersistirPessoa() {
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
            Pessoa obj = new Pessoa();
            obj.setNome("Bruno");
            obj.setTipo("f");
            obj.setCpf("02517532044");
            obj.setLogin("baguiar");
            obj.setSenha("12345");
            obj.setTelefone("54992433633");
            //obj.setGenero(em.find(Genero.class, 1));
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

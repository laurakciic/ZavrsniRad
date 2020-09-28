/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.laurakciic.zavrsnirad.controller;

import hr.laurakciic.zavrsnirad.utility.ZavrsniException;
import hr.laurakciic.zavrsnirad.utility.HibernateUtil;
import org.hibernate.Session;
import java.util.List;

/**
 *
 * @author Laura
 */
public abstract class Obrada<T> { // <T> stoji za type parametar
    
    protected T entitet;
    protected Session session;
    
    protected abstract void kontrolaCreate() throws ZavrsniException;
    protected abstract void kontrolaUpdate() throws ZavrsniException;
    protected abstract void kontrolaDelete() throws ZavrsniException;
    
    public Obrada(T entitet) {
        this();
        this.entitet = entitet;
    }
    
    public Obrada() {
        this.session = HibernateUtil.getSessionFactory().openSession();
    }
    
    public T create() throws ZavrsniException {
        kontrolaCreate();
        save();
        return entitet;
    }
    
    public T createAll(List<T> lista) throws ZavrsniException {
        session.beginTransaction();
        for (T t : lista) {
            setEntitet(t);
            kontrolaCreate();
            session.save(t);
        }
        session.getTransaction().commit();

        return entitet;
    }
    
    public T update() throws ZavrsniException {
        kontrolaUpdate();
        save();
        return entitet;
    }

    public boolean delete() throws ZavrsniException {
        kontrolaDelete();
        session.beginTransaction();
        session.delete(entitet);
        session.getTransaction().commit();
        return true;
    }

    private void save() {
        session.beginTransaction();
        session.save(entitet);
        session.getTransaction().commit();
    }
    
    public T getEntitet() {
        return entitet;
    }

    public void setEntitet(T entitet) {
        this.entitet = entitet;
    }
    
}

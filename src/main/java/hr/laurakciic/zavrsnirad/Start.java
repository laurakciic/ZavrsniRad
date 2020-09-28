/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.laurakciic.zavrsnirad;

//import hr.laurakciic.zavrsnirad.utility.HibernateUtil;
//import org.hibernate.Hibernate;
import hr.laurakciic.zavrsnirad.utility.ZavrsniException;
import hr.laurakciic.zavrsnirad.utility.PocetniInsert;
import hr.laurakciic.zavrsnirad.controller.ObradaSmjer;
import hr.laurakciic.zavrsnirad.model.Smjer;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Laura
 */
public class Start {
    public static void main(String[] args) {
        //HibernateUtil.getSessionFactory().openSession();
       //PocetniInsert.izvedi(); 
       
       Smjer s;
       
       ObradaSmjer obradaSmjer = new ObradaSmjer();
       List<Smjer> lista = new ArrayList<>();
        long pocetak = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            s = new Smjer();
            s.setNaziv("Lorem ipsum dolor sit amet");
            lista.add(s);
        }
       
       try {
           obradaSmjer.createAll(lista);
        } catch (ZavrsniException ex) {
            System.out.println(ex.getPoruka());
        }
       
       long kraj = System.currentTimeMillis();

        System.out.println(kraj - pocetak);
    }
}

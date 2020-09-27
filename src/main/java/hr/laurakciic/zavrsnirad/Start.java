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
       
       Smjer s = new Smjer();
       
       ObradaSmjer obradaSmjer = new ObradaSmjer(s);
              
       
       try {
            obradaSmjer.create();
        } catch (ZavrsniException ex) {
            System.out.println(ex.getPoruka());
        }
       
    }
}

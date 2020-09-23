/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hr.laurakciic.zavrsnirad.utility;

import hr.laurakciic.zavrsnirad.model.Smjer;
import org.hibernate.Session;

/**
 *
 * @author Laura
 */
public class PocetniInsert {
    
    public static void izvedi(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Smjer prvi = kreirajSmjer("Preddiplomski sveučilišni studij Elektrotehnika i informacijska tehnologija");
        Smjer drugi = kreirajSmjer("Preddiplomski sveučilišni studij Računarstvo");
    
        session.beginTransaction();
        session.save(prvi);
        session.save(drugi);
        session.getTransaction().commit();
    }
    
        
    
    
    private static Smjer kreirajSmjer(String naziv){
        Smjer smjer = new Smjer();
        smjer.setNaziv(naziv);
        return smjer;
    }
    
}

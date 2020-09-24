/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hr.laurakciic.zavrsnirad.utility;

import hr.laurakciic.zavrsnirad.utility.HibernateUtil;
import hr.laurakciic.zavrsnirad.model.Student;
import hr.laurakciic.zavrsnirad.model.Smjer;
import hr.laurakciic.zavrsnirad.model.Grupa;
import com.github.javafaker.Faker;
import org.hibernate.Session;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Laura
 */
public class PocetniInsert {
    
    public static void izvedi(){
        
        Session session = HibernateUtil.getSessionFactory().openSession();
        
        Smjer predd_SV_Elektrotehnika = kreirajSmjer("Preddiplomski sveučilišni studij Elektrotehnika i informacijska tehnologija");
        Smjer predd_SV_Racunarstvo = kreirajSmjer("Preddiplomski sveučilišni studij Računarstvo");
        Smjer predd_SR_Racunarstvo = kreirajSmjer("Preddiplomski stručni studij Računarstvo");
        Smjer predd_SR_Automatika = kreirajSmjer("Preddiplomski stručni studij Automatika");
        Smjer predd_SR_Energetika = kreirajSmjer("Preddiplomski stručni studij Energetika");
    
        session.beginTransaction();
        
        session.save(predd_SV_Elektrotehnika);
        session.save(predd_SV_Racunarstvo);
        session.save(predd_SR_Racunarstvo);
        session.save(predd_SR_Automatika);
        session.save(predd_SR_Energetika);
        //session.getTransaction().commit();
        
        Faker faker = new Faker();
        
        String[] jmbagovi = {"4123456789","5213456789","3312456789","2412356789","8512346789","6612345789",
        "3712345689","3812345679","9912345678","2012345678"};
        
        Student student;
        List<Student> studenti_predd_SR_Racunarstvo = new ArrayList<>();
        List<Student> studenti_predd_SR_Automatika = new ArrayList<>();
        
        for(int i=0;i<100;i++){
            
            student = new Student();
            student.setIme(faker.name().firstName());
            student.setPrezime(faker.name().lastName());
            
            if(i > 9){
                student.setJmbag(null);
            }else{
                student.setJmbag(jmbagovi[i]);
            }
     
            session.save(student);
            
           if(i<20){
               studenti_predd_SR_Racunarstvo.add(student);
           }
           if(i>20 && i<40){
               studenti_predd_SR_Automatika.add(student);
           }
        }
        
        session.getTransaction().commit();
        
        session.beginTransaction();
        
        Grupa srR1 = new Grupa();
        srR1.setNaziv("SR_R1");
        srR1.setSmjer(predd_SR_Racunarstvo);
        srR1.setStudenti(studenti_predd_SR_Racunarstvo);
        
        session.save(srR1);
        
        Grupa srA1 = new Grupa();
        srA1.setNaziv("SR_A1");
        srA1.setSmjer(predd_SR_Automatika);
        srA1.setStudenti(studenti_predd_SR_Automatika);
        
        session.save(srA1);
        
        session.getTransaction().commit();
        
    }
   
    private static Smjer kreirajSmjer(String naziv){
        Smjer smjer = new Smjer();
        smjer.setNaziv(naziv);
        return smjer;
    }
    
}

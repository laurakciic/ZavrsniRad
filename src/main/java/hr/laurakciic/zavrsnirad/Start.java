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
import hr.laurakciic.zavrsnirad.controller.ObradaIzostanak;
import hr.laurakciic.zavrsnirad.controller.ObradaKolegij;
import hr.laurakciic.zavrsnirad.model.Smjer;
import hr.laurakciic.zavrsnirad.model.Izostanak;
import hr.laurakciic.zavrsnirad.model.Kolegij;



/**
 *
 * @author Laura
 */
public class Start {
    public static void main(String[] args) {
        //HibernateUtil.getSessionFactory().openSession();
       //PocetniInsert.izvedi(); 
       
       ObradaIzostanak obradaIzostanak = new ObradaIzostanak();
//        for(Izostanak i: obradaIzostanak.getPodaci()){
//            System.out.println(i.getStudent());
//        }

        Izostanak i = new Izostanak();

        obradaIzostanak.setEntitet(i);

        try {
            obradaIzostanak.create();
        } catch (ZavrsniException ex) {
            System.out.println(ex.getPoruka()); // PORUKA!!!
        }
        
        
        ObradaKolegij obradaKolegij = new ObradaKolegij();
//        for(Polaznik p: obradaPolaznik.getPodaci()){
//            System.out.println(p.getIme() + " " + p.getPrezime());
//        }

        Kolegij k = new Kolegij();

        obradaKolegij.setEntitet(k);

        try {
            obradaKolegij.create();
        } catch (ZavrsniException ex) {
            System.out.println(ex.getPoruka()); // PORUKA!!!
        }

        //  Smjer s;

//        ObradaSmjer obradaSmjer = new ObradaSmjer();
//        
//        List<Smjer> podaci = obradaSmjer.getPodaci();
//        
//        for (Smjer smjer : podaci) {
//            System.out.println(smjer.getId() + " " + smjer.getNaziv());
//        }
//        List<Smjer> lista = new ArrayList<>();
//        long pocetak = System.currentTimeMillis();
//        for (int i = 0; i < 1000; i++) {
//            s = new Smjer();
//            s.setNaziv("Lorem ipsum dolor sit amet");
//            lista.add(s);
//        }
//        
//        try {
//                obradaSmjer.createAll(lista);
//            } catch (IzostanakException ex) {
//                System.out.println(ex.getPoruka());
//            }
//        
//        long kraj = System.currentTimeMillis();
//        
//        System.out.println(kraj - pocetak);
    }	    
}

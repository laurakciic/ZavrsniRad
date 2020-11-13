/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.laurakciic.zavrsnirad.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 *
 * @author Laura
 */

@Entity
public class Kolegij extends Student{ 
    
    private String naziv;
    private int semestar;
    private String satipredavanja;
    private String sativjezbi;
    private int dozvoljenoizostanaka;
    private int brojects;
    private String nositelj;
    
    @ManyToOne
    private Smjer smjer;

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getSemestar() {
        return semestar;
    }

    public void setSemestar(int semestar) {
        this.semestar = semestar;
    }

    public String getSatipredavanja() {
        return satipredavanja;
    }

    public void setSatipredavanja(String satipredavanja) {
        this.satipredavanja = satipredavanja;
    }

    public String getSativjezbi() {
        return sativjezbi;
    }

    public void setSativjezbi(String sativjezbi) {
        this.sativjezbi = sativjezbi;
    }

    public int getDozvoljenoizostanaka() {
        return dozvoljenoizostanaka;
    }

    public void setDozvoljenoizostanaka(int dozvoljenoizostanaka) {
        this.dozvoljenoizostanaka = dozvoljenoizostanaka;
    }

    public int getBrojects() {
        return brojects;
    }

    public void setBrojects(int brojects) {
        this.brojects = brojects;
    }

    public String getNositelj() {
        return nositelj;
    }

    public void setNositelj(String nositelj) {
        this.nositelj = nositelj;
    }

    public Smjer getSmjer() {
        return smjer;
    }

    public void setSmjer(Smjer smjer) {
        this.smjer = smjer;
    }
    

    
}

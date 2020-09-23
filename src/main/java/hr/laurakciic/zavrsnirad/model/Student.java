/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.laurakciic.zavrsnirad.model;

import javax.persistence.MappedSuperclass;
import javax.persistence.Entity;

/**
 *
 * @author Laura
 */

@Entity // jer ju nasljeduju Clan i Izostanak
public abstract class Student extends Entitet {
// abstract - za klase koje necemo dalje koristiti pa se zabranjuje koristenje njihovih instanci
    
    private String ime;
    private String prezime;
    private String jmbag;

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getJmbag() {
        return jmbag;
    }

    public void setJmbag(String jmbag) {
        this.jmbag = jmbag;
    }
    
    
}

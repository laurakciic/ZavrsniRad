/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.laurakciic.zavrsnirad.model;

import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;

/**
 *
 * @author Laura
 */
@Entity // nasljeduje ju Kolegij
public class Smjer extends Entitet{
    
    private String naziv;

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }
    
    
}

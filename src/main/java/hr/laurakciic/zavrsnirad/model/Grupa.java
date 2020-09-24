/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.laurakciic.zavrsnirad.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Laura
 */
@Entity // ili MappedSuperclass jer ju nasljeduju ju Clan i Izostanak ? 
public class Grupa extends Entitet{
    
    private String naziv;
    
    @ManyToOne
    private Smjer smjer;
    
    @ManyToOne
    private Kolegij kolegij;
    
    @ManyToMany
    private List<Student> studenti = new ArrayList<>();
    
    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public Kolegij getKolegij() {
        return kolegij;
    }

    public void setKolegij(Kolegij kolegij) {
        this.kolegij = kolegij;
    }
    
    public Smjer getSmjer() {
        return smjer;
    }

    public void setSmjer(Smjer smjer) {
        this.smjer = smjer;
    }
    
    public List<Student> getStudenti() {
        return studenti;
    }

    public void setStudenti(List<Student> studenti) {
        this.studenti = studenti;
    }
    
}
